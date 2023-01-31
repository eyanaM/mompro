package com.Utilitypack.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DBBaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public DBBaseClass() {
		try {
			FileInputStream fls= new FileInputStream(System.getProperty("user.dir")+ "\\"
					+ "src\\test\\java\\com\\DBConfigpack\\qa\\DBconfigfile.properties");
			prop= new Properties();
			prop.load(fls);
		} catch (FileNotFoundException e) {
			System.out.println("please Check this code");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void initBrowser() {
		
		String BrowserSet= prop.getProperty("Browser1");
		
		if(BrowserSet.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\DBDriver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			
		
	}
		else if(BrowserSet.equals("FireFox")) {
			
			
		}
  
	
}
public static void launchURL(String URL) {
	driver.get(prop.getProperty("URL"));
	
}
}
