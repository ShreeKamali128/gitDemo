import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:/Users/SH20204415/Eclipse/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div[id='start'] button")).click();  //start
		
/*
 * //ExlicitWait using WebDriver
		 WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='name']")));
 * */
 
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		WebElement text=w.until(new Function<WebDriver,WebElement> () {
			public WebElement apply (WebDriver driver)  {
				if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
			      return driver.findElement(By.cssSelector("[id='finish'] h4"));
				else
					return null;
														}   
		                                                             }
		                       );
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
	}

}
