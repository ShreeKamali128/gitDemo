import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:/Users/SH20204415/Eclipse/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		String text = "Hello";
		for(int i=0 ; i <text.length();i++)
		 System.out.println(text.charAt(i));  //text.charAt();

		driver.findElement(By.id("name")).sendKeys(text);

		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());

		Thread.sleep(2000);
		driver.switchTo().alert().accept(); // ok clicked in alert

		driver.findElement(By.id("confirmbtn")).click();

		System.out.println(driver.switchTo().alert().getText());

		Thread.sleep(2000);
		driver.switchTo().alert().dismiss(); // cancel alert
	}

}
