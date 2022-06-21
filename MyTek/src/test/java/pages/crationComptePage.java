package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class crationComptePage {
	WebDriver driver=null;
	
	public crationComptePage(WebDriver driver) {
		this.driver=driver;
	}
	
//entrer prenom
	public void enterPrenom(String prenom) {driver.findElement(By.id("firstname")).sendKeys(prenom);}
//entrer nom  
	public void enterNom(String nom) {driver.findElement(By.id("lastname")).sendKeys(nom);}
//entrer Email
	public void enterEmail(String Email) {driver.findElement(By.id("email_address")).sendKeys(Email);}
//entrer Mot de pase
	public void enterMDP(String MDP) {driver.findElement(By.id("password")).sendKeys(MDP);}
//confirmation de mot de passe  
	public void enterMDPC(String Confirmation_MDP) {driver.findElement(By.id("password-confirmation")).sendKeys(Confirmation_MDP);}
///validation methode
	public String recupererText() {
	
			driver.findElement(By.id("firstname")).getText();
			
		return null;
	}	
	public void verif(String prenom,String nom,String Email,String MDP,String Confirmation_MDP ) {
		
		 String aero="@";String com=".com";String tn=".tn";String fr=".fr";String gmail="gmail";String talan="talan";String yahoo ="yahoo";
		 
		 
		 if( (prenom.isEmpty()==true)||(prenom.matches(".*[0-9].*")==true)) {driver.quit();System.out.print("PRENOM NON VALIDE ");
		 return;}
	
		 else if( (nom.isEmpty()==true)||(nom.matches(".*[0-9].*")==true)) {driver.quit();System.out.print("NOM NON VALIDE ");
			 
		 return;}
		
		 else if( (Email.isEmpty()==true)||(Email.contains(aero))==false||(Email.contains(com))==false||(Email.contains(tn))==false||(Email.contains(fr))==false
				 ||(Email.contains(gmail))==false||(Email.contains(talan))==false||(Email.contains(yahoo))==false) {driver.quit();
			 System.out.print("EMAIL NON VALIDE ");
		 return;}
		 else if ((MDP.isEmpty()==true)||(MDP.length()<=8==true)) { System.out.print("MDP NON VALIDE ");
		 System.out.print("le mot de passe est de longuer"+MDP.length());
			return; 
			}
		 else if ((Confirmation_MDP.isEmpty()==true)||(Confirmation_MDP!=MDP)) { System.out.print("MDP NON VALIDE ");
		 System.out.print("le mot de passe est de longuer"+MDP.length());
			return; 
			}
		 
	}
	public void cliquer_cc() {
	driver.findElement(By.xpath("//button[contains(@class,'action submit primary')]")).click();
}
	
	public void verif_cc(){
		
		String URL="https://www.mytek.tn/customer/account/";
		String VerifyCC= driver.getCurrentUrl();
		if(VerifyCC.contentEquals(URL)==true) {System.out.print("compte cree");}
		else  {System.out.print("compte non cree ");/*driver.quit();*/}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
