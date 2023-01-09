package section15;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		DesiredCapabilities dc= new DesiredCapabilities();
	    dc.setBrowserName("edge");
	    dc.setPlatform(Platform.WINDOWS);
	  //  dc.setVersion(null);
	    
	    //WebDriver driver= new ChromeDriver()
	    WebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
	    
	    
	    //normal steps carried out
	    driver.get("https://www.google.com");
	    
	}

}
