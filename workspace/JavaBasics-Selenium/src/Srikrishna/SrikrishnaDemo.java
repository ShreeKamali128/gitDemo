package Srikrishna;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
public class SrikrishnaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();   //no autosuggest to add import
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		Alert al= driver.switchTo().alert();  //no suggest to add import
		al.sendKeys("hiiii");
		al.accept();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		
		
		
		
		
		
	}

}
