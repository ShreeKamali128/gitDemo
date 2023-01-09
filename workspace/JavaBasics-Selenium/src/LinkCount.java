import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:/Users/SH20204415/Eclipse/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerDriver= driver.findElement(By.id("gf-BIG"));	
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement colDr=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    System.out.println(colDr.findElements(By.tagName("a")).size());
	    int col1Size=colDr.findElements(By.tagName("a")).size();
	    
	    for(int i=1;i<col1Size;i++)
	    {
	    	String clickOnLink=Keys.chord(Keys.CONTROL, Keys.ENTER);
	    	colDr.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
	    	Thread.sleep(5000);
	    }
	    
	    Set<String> wins=driver.getWindowHandles();
	    Iterator<String> itr=wins.iterator();
	    
	    while(itr.hasNext())
	    {
	      driver.switchTo().window(itr.next());         //itr.next here returns window id so put it in as argument
	      System.out.println(driver.getTitle());
	    }
	}

}
