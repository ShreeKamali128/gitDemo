package Srikrishna;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class propertyDemo {

	public static String email;
	public static String user;
	public static String pass;
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		Properties prop= new Properties();
		prop.load(new FileInputStream("./Files\\data.properties"));   //exception
		
		email=prop.getProperty("Email");         //Email should be there in data file
		user=prop.getProperty("User");			//""
		pass=prop.getProperty("Pass");			//""
		
		
		
		WebDriverManager.edgedriver().setup();   //no autosuggest to add import
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/index.php?route=common/home");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right'] //a[text()='Login']")).click();
		
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(pass);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.quit();
		
		
		
		
		
	}

}
