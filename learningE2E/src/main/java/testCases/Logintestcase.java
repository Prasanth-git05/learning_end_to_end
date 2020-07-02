package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonfunctions.Invokebrowser;
import pageObjects.Loginpageobjects;


public class Logintestcase extends Invokebrowser {
	
	@Test
	public void loginToWebsite() {
		
		PageFactory.initElements(driver, Loginpageobjects.class);
		Loginpageobjects.username.sendKeys(prop.getProperty("username"));
		Loginpageobjects.password.sendKeys(prop.getProperty("password"));
		Loginpageobjects.submit.click();
	
		  
	}

}
