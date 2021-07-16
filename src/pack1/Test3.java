package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {	
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	//ChromeDriver driver1=new ChromeDriver();driver2 de type chrome uniquement
	driver.get("https://opensource-demo.orangehrmlive.com/");//le site a ouvrir
	driver.manage().window().maximize();//maximiser la fenetre de la page a ouvrir	
	
	WebElement username = driver.findElement(By.id("txtUsername"));
	username.sendKeys("Admin");
	//driver.findElement(By.id("txtUsername")).sendKeys("Admin");btnLogin
	WebElement password = driver.findElement(By.name("txtPassword"));
	password.sendKeys("admin123");	
	WebElement logbtn = driver.findElement(By.id("btnLogin"));
	logbtn.click();	
	WebElement lienWelcome = driver.findElement(By.id("welcome"));//welcome Logout
	lienWelcome.click();	

	WebElement logoutLink = driver.findElement(By.linkText("Logout"));
	logoutLink.click();
	
	
	
	
	
	
	
	
	
	}

}
