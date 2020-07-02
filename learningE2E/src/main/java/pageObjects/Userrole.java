package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Userrole {
	
	@FindBy(linkText = "Admin")
	//@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/b[1]")
	public static WebElement admin;
	
	@FindBy(linkText = "User Management")
	//@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	public static WebElement umanage;
	
	@FindBy(linkText ="Users")
	public static WebElement usersTab;
	
	@FindBy(id = "searchSystemUser_userType")
	public static WebElement userdd;
	
	@FindBy(id = "searchSystemUser_status")
	public static WebElement status;
	
	@FindBy(id="searchBtn")
	public static WebElement submit;
	
	@FindBy(xpath = "//tr[1]/td[2]")
	public static WebElement usernameName;
	
	@FindBy(xpath = "//tr[1]/td[3]")
	public static WebElement usernameRole;
	
	
	
	@FindBy(xpath = "//tr[1]/td[5]")
	public static WebElement userStatus;
	
}
