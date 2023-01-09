import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class JSDOmExampl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:/Users/SH20204415/Eclipse/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//when headless browser mode; also to get clear view of element at down of the  page
		//switching to JS ;casting the driver to JSE
		JavascriptExecutor js=(JavascriptExecutor)driver;

		
		js.executeScript("window.scrollBy(0,500)");              //webpage scroll
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");   //that table  scroll
		
		
		List<WebElement> vals=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));  //4th column
		int sum=0;
		for(int  i=0;i<vals.size();i++)
		{
			sum+=Integer.parseInt(vals.get(i).getText());
		}
		System.out.println("sum is: "+ sum);
		int tot= Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, tot);
	}

}
