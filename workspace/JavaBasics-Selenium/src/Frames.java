import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:/Users/SH20204415/Eclipse/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		System.out.println(driver.findElements(By.tagName("iframe")).size());  //findelements plural since more number of elements
	 
		
		WebElement src=driver.findElement(By.id("draggable"));
		src.click();
		WebElement tar=driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(src,tar).build().perform();
		
		driver.switchTo().defaultContent();                    //switch back to normal window from the frame
	
		
	}

}
