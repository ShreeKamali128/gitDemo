
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:/Users/SH20204415/Eclipse/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("#checkBoxOption3")).click();       //checkbox
		String opt= driver.findElement(By.cssSelector("[value='option3']")).getText();
		
		WebElement dd=driver.findElement(By.cssSelector("#dropdown-class-example"));               //dropdown
		Select s=new Select(dd);
		s.selectByVisibleText(opt);
		
		driver.findElement(By.name("enter-name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		
		String almsg= driver.switchTo().alert().getText();
		if(almsg.contains(opt))
			System.out.println("Alert has the text");
		else
			System.out.println("Alert has no text..");
		
		
	}

}
