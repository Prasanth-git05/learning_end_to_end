package commonfunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Invokebrowser {
	
	public static Properties prop=null;
	public static WebDriver driver=null;
	
	public static Logger log=LogManager.getLogger(Invokebrowser.class.getName());
	
	public static Properties getBrowserProperty() throws IOException {
		FileInputStream browser=new FileInputStream("learning.properties");
		prop=new Properties();
		prop.load(browser);
		return prop;	
	}
	
	@BeforeSuite
	public static void openBrowser() throws IOException {
		
		getBrowserProperty();
		String browserName=prop.getProperty("browser");
		String urlName=prop.getProperty("url");
		if(browserName.equalsIgnoreCase("chrome")) {
			log.info("Opening google chrome");
			driver=new ChromeDriver();
			driver.get(urlName);
			driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
			
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			driver.get(urlName);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		}
		else {
			driver=new InternetExplorerDriver();
			driver.get(urlName);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}

}
