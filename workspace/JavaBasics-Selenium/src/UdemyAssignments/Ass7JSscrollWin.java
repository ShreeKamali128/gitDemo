package UdemyAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass7JSscrollWin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:/Users/SH20204415/Eclipse/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");              
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.table-display').scrollTop=500");
		
		System.out.println(driver.findElements(By.cssSelector(".table-display tr")).size());
		System.out.println(driver.findElements(By.cssSelector(".table-display th")).size());
		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());
		
		/*
		WebElement tabDri=driver.findElement(By.className("table-display")); //limiting diver to only table by creating new driver obj webelmnt
		System.out.println(tabDri.findElements(By.tagName("tr")).size());
		System.out.println(tabDri.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		List<WebElement> rd=tabDri.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(rd.get(0).getText());
		System.out.println(rd.get(1).getText());
		System.out.println(rd.get(2).getText());
		*/
		

		//ass8
		driver.findElement(By.id("autocomplete")).sendKeys("ind");

	    Thread.sleep(2000);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
	}

}
