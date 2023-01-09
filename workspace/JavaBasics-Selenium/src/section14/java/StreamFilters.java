package section14.java;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class StreamFilters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:/Users/SH20204415/Eclipse/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// data with rice word should all be displayed:
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> vegs = driver.findElements(By.xpath("//tr/td[1]")); // 5 rows's 1st col data in 1st page after
																				// rice given but here there is only one
																				// rice name so
																				// returns size 1
		List<WebElement> riceLs = vegs.stream().filter(veg -> veg.getText().contains("Rice"))
				.collect(Collectors.toList());// collect all rice binded veg names in to list so return size 1
		Assert.assertEquals(vegs.size(), riceLs.size()); // return true since the grabed rice count after rice searched
															// and the filtered search count are similar

	}

}
