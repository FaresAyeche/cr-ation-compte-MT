package chgntD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageChDn {

		WebDriver driver=null;
		
		public PageChDn(WebDriver driver) {
			this.driver=driver;
		}
		public void enterDn( ) {
			
			driver.findElement(By.id("email")).sendKeys("ahmed-baha-eddine.ben-dhaya@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("22080023Ah");
			driver.findElement(By.id("send2")).click();
		}
		public void editer( ) {
			
			driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/a[1]")).click();
			driver.findElement(By.id("firstname")).clear();
			driver.findElement(By.id("firstname")).sendKeys("ahmed-baha-eddine.ben-dhaya@gmail.com");
			driver.findElement(By.xpath("//button[contains(@class,'action save primary')]")).click();
		}

	
		public void editer2() {
			driver.findElement(By.id("firstname")).clear();
			driver.findElement(By.id("firstname")).sendKeys("123456879");
			driver.findElement(By.xpath("//button[contains(@class,'action save primary')]")).click();
	
			
		}
		public void verif() {
	
	
		if(driver.findElement(By.xpath("//div[contains(@class,'message-success success message')]")).isDisplayed()==true) {
			System.out.print("/////////////////BUG//////////////////");
			
		}}
}
		
		
		
		
		
		
		
		
		
		


