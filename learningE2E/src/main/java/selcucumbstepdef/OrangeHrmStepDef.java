package selcucumbstepdef;

import org.openqa.selenium.support.PageFactory;
import commonfunctions.Invokebrowser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Loginpageobjects;


public class OrangeHrmStepDef extends Invokebrowser {

	public void loginpage() { 
		PageFactory.initElements(driver,Loginpageobjects.class); 
		}

	@Given("^The user navigates to \"([^\"]*)\"$")
	public void the_user_navigates_to_something(String url) throws Throwable {
		Invokebrowser.openBrowser();	
	}

	@When("The user enters the credentials {string} and {string}")
	public void the_user_enters_the_credentials_and(String arg1, String arg2) {
		loginpage();
		
		Loginpageobjects.username.sendKeys(arg1);
		Loginpageobjects.password.sendKeys(arg2);

	}

	@Then("The user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		//loginpage();
		
		Loginpageobjects.submit.click();
	}
	
	@And("the user navigates to the home page of Orange HRM")
	public void the_user_navigates_to_the_home_page_of_Orange_HRM() {
		
		String currentUrl = driver.getCurrentUrl();

		String actualUrl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";

		if (currentUrl.contains(actualUrl)) {
			System.out.println(currentUrl);
		} else {
			System.out.println("error. please check");
		}
	}

}
