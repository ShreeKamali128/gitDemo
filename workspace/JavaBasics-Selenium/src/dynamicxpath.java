import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.edge.driver","C:\\Users\\SH20204415\\Eclipse\\Edge\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		driver.manage().window().maximize();
		
		//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".rts-counter")));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		
	}
	
	
	public static void printCount()
	{
		
		return;
	}

}
