package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Handlingalert extends Base {
	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealert = driver.findElement(By.id("alertButton"));
		simplealert.click();
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	public void verifyConfirmAlert() {
	driver.navigate().to("https://demoqa.com/alerts");
	WebElement confirmalert = driver.findElement(By.id("confirmButton"));
	confirmalert.click();
	Alert al=driver.switchTo().alert();
	al.dismiss();
	}

	public static void main(String[] args) {
		Handlingalert handling = new Handlingalert();
		handling.initializeBrowser();
		//handling.verifySimpleAlert();
		handling.verifyConfirmAlert();

	}

}
