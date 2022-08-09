import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Calendarui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:/Users/SH20204415/Eclipse/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		//click a date 5 months later //loop until 5 months end
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		//grab common attribute and put it in list and iterate
		List<WebElement> travelDate=driver.findElements(By.cssSelector(".day"));
		int n = driver.findElements(By.cssSelector(".day")).size();
		
		for(int i=0;i<n;i++)
		{
			String text= driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
	}

}
