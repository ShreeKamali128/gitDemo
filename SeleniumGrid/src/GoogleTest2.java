import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest2 {
	
	@Test
	public void HomePageCheck() throws MalformedURLException
	{
		DesiredCapabilities dc= new DesiredCapabilities();
	 //   dc.setBrowserName("chrome");
	    dc.setPlatform(Platform.WINDOWS);
//	    dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        dc.setCapability(CapabilityType.BROWSER_NAME, "chrome");
	 
	    WebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444"),dc);
	    driver.get("https://www.rahulshettyacademy.com");
	    driver.findElement(By.linkText("Courses")).click();
	    
	}

}
