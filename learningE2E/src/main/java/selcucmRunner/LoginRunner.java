package selcucmRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)

@CucumberOptions(features="C:/Users/HP/learningE2E/SelFeaturefiles/OrangeLogin.feature",glue="selcucumbstepdef", stepNotifications=true)


public class LoginRunner {

}
