package section16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relativelocaators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:/Users/SH20204415/Eclipse/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// 1) above
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		WebElement nameLabel = driver.findElement(with(By.tagName("label")).above(nameEditBox));
		System.out.println(nameLabel.getText());

		//below
		WebElement dobLabel = driver.findElement(By.cssSelector("[for='dateofBirth']")); // labelDOB
		driver.findElement(with(By.tagName("input")).below(dobLabel)).click(); // submit as it skipped dobeditbox since
																			// it is a flex webelement
		
		//toLeftOf
		WebElement checkBoxText=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));   //checkboxText
		driver.findElement(with(By.tagName("input")).toLeftOf(checkBoxText)).click();        //checkbox clicked

		//toRightOf
		WebElement radioBtn= driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioBtn)).getText());
		
		
	}

}
