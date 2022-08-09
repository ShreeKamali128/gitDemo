package section16;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Invokingmulwinsortabs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:/Users/SH20204415/Eclipse/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		//switching new Tab
		driver.switchTo().newWindow(WindowType.TAB); // in same browser new tab opens

		Set<String> handles = driver.getWindowHandles(); // all opened windows are got into handles set of strings
		Iterator<String> itr = handles.iterator();
		String pr = itr.next();
		String chl = itr.next(); // got id of the child win
		driver.switchTo().window(chl); // important mistake done- missed out it //control must switch to new tab

		driver.get("https://rahulshettyacademy.com/#/index"); // control switched and so hit the url to get
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String l2 = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1)
				.getText(); // regular expression css used href*
		driver.switchTo().window(pr);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement nm=driver.findElement(By.xpath("//input[@name='name']"));
		nm.sendKeys(l2);
		
		//SCREENSHOT
		File f=nm.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("nameLabel.png"));
		System.out.println("height of name edit box is: "+ nm.getRect().getDimension().getHeight());
		
		//ExPlicitwait using WebDriver
		 WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='name']")));
		 
		//driver.quit();

	}

}
