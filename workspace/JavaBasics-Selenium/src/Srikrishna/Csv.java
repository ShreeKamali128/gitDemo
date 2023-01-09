package Srikrishna;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Csv {

	public static String email;
	public static String user;
	public static String pass;
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		File f= new File("./Files\\csvdata.csv");
		FileReader fr = new FileReader(f); //exception wen f added
		BufferedReader br= new BufferedReader(fr);
		String data;
		
		while((data=br.readLine())!= null)
		{
			String[] arr=data.split(",");
			email=arr[0];
			user=arr[1];
			pass= arr[2];
		
		
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

}
