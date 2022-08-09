package UdemyAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ceritificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//general chrome profile
		DesiredCapabilities ch = new DesiredCapabilities();
		//ch.acceptInsecureCerts();    one more way of below line
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);  //chrome profile object ch get knowledge with plugins to accept insecure certs
	    ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//belongs to local browser
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		//invoking selenium browser
		
		System.setProperty("webdriver.chrome.driver","C:/Users/SH20204415/Eclipse/chromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);    //
		
	}

}
