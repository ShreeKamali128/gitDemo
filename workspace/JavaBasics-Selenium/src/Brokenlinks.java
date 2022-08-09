import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:/Users/SH20204415/Eclipse/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href"); // css regular
																									// expression

		// call open connection method: it belongs to url class then cast it to
		// httpurlconnection class
		URL objurl = new URL(url); // malformedurlexception when creating object
		HttpURLConnection objconn = (HttpURLConnection) objurl.openConnection(); // ioexception for object creation
		// making request using a HEAD http request type

		objconn.setRequestMethod("HEAD"); // sending the set request method in http
		objconn.connect(); // make call to the url
		int code = objconn.getResponseCode(); // in turn all response stored inobjconn object only so using that itselff
												// get status code
		System.out.println("code is: " + code);

	}

}
