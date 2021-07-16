package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {	
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	//ChromeDriver driver1=new ChromeDriver();driver2 de type chrome uniquement
	driver.get("https://opensource-demo.orangehrmlive.com/");//le site a ouvrir
	driver.manage().window().maximize();//maximiser la fenetre de la page a ouvrir	
	
	String codeSource = driver.getPageSource();
	System.out.println("le code source de la page: "+codeSource);//afficher code source
	if(codeSource.contains("OrangeHRM")) {      //validation de code source si il contient Orange (comparaison ou test)
		System.out.println("passed");
	}
	else System.out.println("failed");
		
		

	}

}
