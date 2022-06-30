package chgntD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageChDn {

		WebDriver driver=null;
		//les données 
		String PT1="ahmed-baha-eddine.ben-dhaya@gmail.com";
		String PT2="1234";
		public PageChDn(WebDriver driver) {
			this.driver=driver;
		}
		public void enterDn( ) throws InterruptedException {
			
			driver.findElement(By.id("email")).sendKeys("ahmed-baha-eddine.ben-dhaya@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("22080023Ah");
			Thread.sleep(2000);
			driver.findElement(By.id("send2")).click();
		}
		public void editer( ) {
			
			driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/a[1]")).click();
			driver.findElement(By.id("firstname")).clear();
			driver.findElement(By.id("firstname")).sendKeys(PT1);
			driver.findElement(By.xpath("//button[contains(@class,'action save primary')]")).click();
		}
		
		public void verif() {
		
		if(driver.findElement(By.xpath("//div[contains(@class,'message-error error message')]")).isDisplayed()==true) {
			System.out.print("/////////////////////////PAS DE BUG/////////////////////");
		}}
	
		public void editer2() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/a[1]")).click();
			driver.findElement(By.id("firstname")).clear();
			driver.findElement(By.id("firstname")).sendKeys(PT2);
			driver.findElement(By.xpath("//button[contains(@class,'action save primary')]")).click();
			Thread.sleep(5000);
			
		}
		public void verif2() {
		
			
String a=	driver.findElement(By.xpath("//h1[contains(@class,'page-title')]")).getText() ;
			System.out.print(a);
	
			if(driver.findElement(By.xpath("//h1[contains(@class,'page-title')]")).isDisplayed()==true&& (PT2.matches(".*[0-9].*")==true)) {
				System.out.print("///////////////////////// BUG/////////////////////");
			}
	  /*//&& (PT2.matches(".*[0-9].*")==true)*/

		}
		
		
		//
		
		
		
		}
		
		
		
		
		
		
		
		
		
		


