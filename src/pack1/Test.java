package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {	
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	//ChromeDriver driver1=new ChromeDriver();driver2 de type chrome uniquement
	driver.get("https://opensource-demo.orangehrmlive.com/");//le site a ouvrir
	driver.manage().window().maximize();//maximiser la fenetre de la page a ouvrir	
	
	String titlePage = driver.getTitle();//recuperer le titre ici avec get on appel le titre
	System.out.println("le titre de la page est: "+titlePage);
	if(titlePage.equals("OrangeHRM"))	{
		System.out.println("le test est reussi");
	} else {
		System.out.println("le test a echoue");
	}
	
	String urlPage = driver.getCurrentUrl();//recuperer l'URL de la page 	
	System.out.println("l'url de la page est: "+urlPage);
	if(urlPage.equals("https://opensource-demo.orangehrmlive.com/"))	{
		System.out.println("le test URL est réussi");
	} else {
		System.out.println("le test URL a échoué");
	}	
		
		
		
		

	}

}
