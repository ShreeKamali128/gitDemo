import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:/Users/SH20204415/Eclipse/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		// From TO city
		driver.get("https://spicejet.com");
		driver.findElement(By.xpath("(//div[@class=\"r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2\"])[1]"))
				.click();

		Thread.sleep(2000);
		// driver.findElement(By.xpath("//div[text()=\"Chennai International
		// Airport\"]")).click(); //text() xpath
		driver.findElement(
				By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[text()='Chennai International Airport']"))
				.click(); // parent child relationship xpath
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Indira Gandhi International Airport\"]")).click();
		Thread.sleep(2000);

		// start date
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click(); // calendar UI
																										// 17 date class

		// Family Friends Checkbox
		Thread.sleep(9000);
		driver.findElements(By.xpath("//div[@style=\"margin-right: 6px;\"]")).get(0).click();
		Assert.assertTrue(driver.findElements(By.xpath("//div[@style=\"margin-right: 6px;\"]")).get(0).isEnabled());
		Thread.sleep(9000);
		System.out.println(driver.findElements(By.cssSelector("div[style='margin-right: 6px;']")).size());

		// Return disabled
		Assert.assertTrue(
				driver.findElement(By.xpath("//div[text()='Return Date']")).getAttribute("style").contains("0.5")); // return
																													// date
																													// disabled
		// driver.findElement(By.xpath("(//div[@class='css-1dbjc4nr-zso239'])[2]")).click(); //round trip
		System.out.println(driver.findElement(By.xpath("//div[text()='Return Date']")).getAttribute("style"));
		if (driver.findElement(By.xpath("//div[text()='Return Date']")).getAttribute("style").contains("1"))
			Assert.assertFalse(false); // return date enabled

		// Search
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']"))
				.click();
	}

}
