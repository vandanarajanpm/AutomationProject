package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.DemoBase;
import utility.ExcelUtility;

public class LoginTest extends DemoBase {
	@Test
	public void verifyWhetherUserIsAbleToLoginWithValidCredential() throws IOException {
		String usernamevalue=ExcelUtility.getStringData(0, 0, "Loginpage");
		String passwordvalue=ExcelUtility.getStringData(0, 1, "Loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameFeild(usernamevalue);
		loginpage.enterPasswordOnPasswordFeild(passwordvalue);
		loginpage.loginButtonClick();
		}
	@Test
	public void verifyWhetherUserIsAbleToLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String usernamevalue=ExcelUtility.getStringData(1, 0, "Loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameFeild(usernamevalue);
		loginpage.enterPasswordOnPasswordFeild(passwordvalue);
		loginpage.loginButtonClick();
		
		}
	@Test
	
	public void verifyWhetherUserIsAbleToLoginWithInValidUsernmaeAndValidPassword() throws IOException {
		String usernamevalue=ExcelUtility.getStringData(2, 0, "Loginpage");
		String passwordvalue=ExcelUtility.getStringData(2, 1, "Loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameFeild(usernamevalue);
		loginpage.enterPasswordOnPasswordFeild(passwordvalue);
		loginpage.loginButtonClick();
		}
	@Test
	public void VerifyWhetherUserIsAbleToLoginWithInvalidUsernameAndInvalidPassword() throws IOException {
		String usernamevalue=ExcelUtility.getStringData(3, 0, "Loginpage");
		String passwordvalue=ExcelUtility.getStringData(3, 1, "Loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameFeild(usernamevalue);
		loginpage.enterPasswordOnPasswordFeild(passwordvalue);
		loginpage.loginButtonClick();
		}
}
	
	
	
	


