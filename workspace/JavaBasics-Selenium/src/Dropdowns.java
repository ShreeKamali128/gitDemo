
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:/Users/SH20204415/Eclipse/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		
		  //static dropdowns have select tag so used the below code
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		  Select dropdown= new Select(staticdropdown);
		  
		  dropdown.selectByIndex(3);
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  dropdown.selectByVisibleText("AED");
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  dropdown.selectByValue("INR");
		 

		/*
		 * //Adult count add by clicking + button and done
		 * driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 * driver.findElement(By.id("divpaxinfo")).click(); Thread.sleep(2000);
		 * Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText()
		 * ,"1 Adult"); //1 adult for(int i=1;i<5;i++)
		 * {driver.findElement(By.id("hrefIncAdt")).click();} ///add button +
		 * driver.findElement(By.id("btnclosepaxoption")).click(); //done
		 * //System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); //5
		 * adult Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),
		 * "5 Adult");
		 */

		
		  //From To city
		   driver.get("https://spicejet.com");
		   driver.findElement(By.xpath("(//div[@class=\"r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2\"])[1]")).click(); 
		   Thread.sleep(2000); 
		   //driver.findElement(By.xpath("//div[text()=\"Chennai International Airport\"]")).click(); //text() xpath
		   driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[text()='Chennai International Airport']")).click(); //parent child relationship xpath Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[text()=\"Indira Gandhi International Airport\"]")).click();
		  Thread.sleep(2000); 
		  driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")); //calendar UI
		 
		
		   //List of options in the auto suggestive dropdown
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  driver.findElement(By.id("autosuggest")).sendKeys("ind");
		  Thread.sleep(5000);
		  List<WebElement> countries =driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a")); //parent child travel css
		  for(WebElement options: countries) 
		  {
		  if(options.getText().equalsIgnoreCase("India")) 
		     {options.click(); break;}
		  }
		 
		/*
		 * //Family Friends checkbox selection Thread.sleep(9000);
		 * driver.findElements(By.xpath("//div[@style=\"margin-right: 6px;\"]")).get(0).
		 * click(); Assert.assertTrue(driver.findElements(By.
		 * xpath("//div[@style=\"margin-right: 6px;\"]")).get(0).isEnabled());
		 * Thread.sleep(9000); //to count all check boxes pick common among attribute
		 * among all the checkbox symbols System.out.println(driver.findElements(By.
		 * cssSelector("div[style='margin-right: 6px;']")).size());
		 */
		/*
		 * //Return date enabled on round trip check driver.get("https://spicejet.com");
		 * Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Return Date']"))
		 * .getAttribute("style").contains("0.5")); //return date disabled
		 * driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[2]")).
		 * click(); //round trip
		 * System.out.println(driver.findElement(By.xpath("//div[text()='Return Date']")
		 * ).getAttribute("style"));
		 * if(driver.findElement(By.xpath("//div[text()='Return Date']")).getAttribute(
		 * "style").contains("1")) Assert.assertTrue(true); //return date enabled
		 */
		/*
		 * //Search driver.get("https://spicejet.com"); driver.findElement(By.
		 * xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']"
		 * )).click();
		 */
	}

}
