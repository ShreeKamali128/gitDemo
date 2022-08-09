package section14.java;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Webtablesorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:/Users/SH20204415/Eclipse/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// stream iterates through every element of the list(collection) on 1st
		// iteration it picks wheat and store it in map's 's' var.
		// then do the required function

		// 1 Click on column
		// 2 Capture all webelements to list
		// 3 Capture text of all elements into a new list(original_list)
		// 4 Sort the original list to become sorted list
		// 5 Compare original vs sorted list

		
		// STREAMS-BASIC
		driver.findElement(By.xpath("//tr/th[1]")).click(); // 1  on clicked table becomes sorted
		
		List<WebElement> li = driver.findElements(By.xpath("//tr/td[1]")); // 2    from all rows,veg names at first col all obtained

		List<String> orgls = li.stream().map(s -> s.getText()).collect(Collectors.toList()); // 3
		List<String> sols = orgls.stream().sorted().collect(Collectors.toList()); // 4
		Assert.assertTrue(orgls.equals(sols)); // 5

		
		// STREAMS meth MAPPER
		// traverse the name of veggies int table using gettext
		// if rice then move one column to get price
		List<WebElement> li1 = driver.findElements(By.xpath("//tr/td[1]")); // 2)all column la ulla veg names to a list

		List<String> price = li1.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPrice(s))
				.collect(Collectors.toList()); // if rice get price
		price.forEach(a -> System.out.println(a)); // print

		
		// PAGINATION
		List<String> prices;
		do {
			List<WebElement> li2 = driver.findElements(By.xpath("//tr/td[1]")); // grab all veg names to a list
			prices = li2.stream().filter(s -> s.getText().contains("Rice")).map(ss -> getPrices(ss))
					.collect(Collectors.toList()); // stream parse all names, filter to s if there is 'rice' in all names and get price
													// via map meth and convert to list 
			prices.forEach(a -> System.out.println(a));
			// Pagination
			if (prices.size() < 1)
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		} while (prices.size() < 1);
		
		
		
	
		
		

	}

	private static String getPrices(WebElement ss) {
		// TODO Auto-generated method stub
		String vals = ss.findElement(By.xpath("following-sibling::td[1]")).getText();  //s has generic path //tr/td already
		return vals;
	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String val = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return val;
	}

}
