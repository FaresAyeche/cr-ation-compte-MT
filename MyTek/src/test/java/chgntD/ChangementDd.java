package chgntD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangementDd {
	
	public static void main(String[] args) throws InterruptedException {
		PageChDn cd;
		
	WebDriver driver=null;
	String projectPath = System.getProperty("user.dir");
	System.out.println("Project path is : "+projectPath);

	System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    driver.navigate().to("https://www.mytek.tn/customer/account/login/referer/aHR0cHM6Ly93d3cubXl0ZWsudG4v/");
    driver.manage().window().maximize();
    cd=new PageChDn(driver);
    cd.enterDn();
    cd.enterDn();
    cd.editer();
   
  cd.editer2();
  Thread.sleep(2000);
cd.verif();

		
	

	//span[contains(@class,'base')]
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
}
