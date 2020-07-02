package testCases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunctions.Invokebrowser;
import pageObjects.Userrole;

public class Usersroletestcase extends Invokebrowser {

	public void usersRoleTest() {

		Actions action = new Actions(driver);

		action.moveToElement(Userrole.admin).build().perform();
		action.moveToElement(Userrole.umanage).build().perform();
		action.moveToElement(Userrole.usersTab).click().build().perform();

	}

	public void systemUsersSelect() {

		Select userrole = new Select(Userrole.userdd);
		userrole.selectByIndex(1);

		Select userStatus = new Select(Userrole.status);
		userStatus.selectByIndex(1);

		Userrole.submit.click();
	}

	@Test
	public void userCheck() {
		PageFactory.initElements(driver, Userrole.class);
		usersRoleTest();

		systemUsersSelect();

		String username = Userrole.usernameName.getText();

		String userrole = Userrole.usernameRole.getText();

		String userstatus = Userrole.userStatus.getText();

		Assert.assertEquals(username, "Admin");

		Assert.assertEquals(userrole, "Admin");

		Assert.assertEquals(userstatus, "Enabled");

	}

}
