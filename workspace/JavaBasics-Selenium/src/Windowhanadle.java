import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Windowhanadle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:/Users/SH20204415/Eclipse/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		
		Set<String> windows= driver.getWindowHandles();
		
		Iterator<String> it= windows.iterator();
		
		String p=it.next();
		String child=it.next();
		
		driver.switchTo().window(child);
		
		String mail = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(p);
		driver.findElement(By.id("username")).sendKeys(mail);
		
	}

}
