package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunctions.Invokebrowser;

import pageObjects.Dash;


public class Dashboardleaverequest extends Invokebrowser {
	
	@Test
	public void leaveRequest() {
		
		
		PageFactory.initElements(driver, Dash.class);
		
		String dashDisplay=Dash.dashboard.getText();
		
		System.out.println(dashDisplay);
	
		Assert.assertEquals(dashDisplay, "No Records are Available");
	
	}

}
