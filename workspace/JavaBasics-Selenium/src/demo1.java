import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//chrome
		//System.setProperty("webdriver.chrome.driver", "C:/Users/SH20204415/Eclipse/chromeDriver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//edge
		
	    System.setProperty("webdriver.edge.driver", "C:/Users/SH20204415/Eclipse/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//timeout implicit for all objects
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		//driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sessionKey");
		
		driver.get("https://rahulshettyacademy.com/#/index");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);     //milliseconds
		driver.close();
		driver.quit();
		
		/*
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("shree");
		arr.add("jay");
		arr.add("jaan");
		
		System.out.print(arr.get(2));
		*/
	}

}
