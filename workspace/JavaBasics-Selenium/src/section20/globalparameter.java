package section20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class globalparameter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Properties prp = new Properties();
		
		FileInputStream fis= new FileInputStream("C:\\Users\\SH20204415\\eclipse-workspace\\Selenium\\Demo1\\Files\\propdata.properties");
		prp.load(fis);
		System.out.println(prp.getProperty("browser"));
		
		prp.setProperty("browser", "firefox");
		
		FileOutputStream fos= new FileOutputStream("C:\\Users\\SH20204415\\eclipse-workspace\\Selenium\\Demo1\\Files\\propdata.properties");
		prp.store(fos, null);
		System.out.println(prp.getProperty("browser"));
		
		
	}

}
