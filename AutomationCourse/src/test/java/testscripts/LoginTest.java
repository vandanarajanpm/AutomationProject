package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.DemoBase;

public class LoginTest extends DemoBase {
	@Test
	public void verifyWhetherUserIsAbleToLoginWithValidCredential() {
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameFeild();
		loginpage.enterPasswordOnPasswordFeild();
		loginpage.loginButtonClick();
		}
	@Test
	public void verifyWhetherUserIsAbleToLoginWithValidUsernameAndInvalidPassword() {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("abc");
		
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	}
	@Test
	
	public void verifyWhetherUserIsAbleToLoginWithInValidUsernmaeAndValidPassword() {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("xyz");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		}
	@Test
	public void VerifyWhetherUserIsAbleToLoginWithInvalidUsernameAndInvalidPassword() {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("abcd");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("xyzz");
		
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	}
}
	
	
	
	


