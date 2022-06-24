package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.crationComptePage;

public class CcDemo {
	WebDriver driver=null;
	
	crationComptePage cc ;
	
	
	
	@SuppressWarnings("deprecation")
	@Given("Navigateur ouvert")
	public void navigateur_et_page() {
		System.out.println("Inside Step - browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		 
	}

	@And("Utilisateur dans la page de creation")
	public void utilisateur_dans_la_page_de_creation() {
		driver.navigate().to("https://www.mytek.tn/customer/account/create/");
	}
	@When("^je_tape (.*) and (.*) and (.*) and (.*) and (.*)$")
	
	
	public void je_tape_prenom_et_nom_et_Email_MDP_et_MDP(String prenom , String nom, String Email,String MDP,String Confirmation_MDP) throws InterruptedException {
		cc= new crationComptePage(driver);
		
		cc.enterPrenom(prenom);
		cc.enterNom(nom);
		cc.enterEmail(Email);
		cc.enterMDP(MDP);
		cc.enterMDPC(Confirmation_MDP);

		
		
	}
	  
	@And("je clique sur creer un compte")
	public void je_clique_sur_creer_un_compte() throws InterruptedException {
		cc.cliquer_cc();

	}

	@Then("^page d_acceuil ouverte avec (.*) and (.*) and (.*) and (.*) and (.*)$")
	public void page_d_acceuil_ouverte(String prenom , String nom, String Email,String MDP,String Confirmation_MDP )throws InterruptedException {
		

	cc.verif_cc(prenom, nom, Email, MDP, Confirmation_MDP);
	///////////////////////////////////////////Connexion/////////////////////////////////////////////////// 

		


	
	
	}

	
	
}
