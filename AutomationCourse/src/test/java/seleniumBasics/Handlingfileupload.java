package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Handlingfileupload extends Base{
	public void verifyFileUploadUsingSendkeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement fileupload = driver.findElement(By.id("uploadfile_0"));
		fileupload.sendKeys("C:\\Users\\sives\\git\\AutomationProject\\AutomationCourse\\src\\test\\resources\\searchelement1.pdf");
		
		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.click();
		
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
		
	}
	public void fileUploadUsingRobotClass() throws AWTException {
	driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
	WebElement robotfileupload = driver.findElement(By.id("pickfiles"));
	robotfileupload .click();
	StringSelection se = new StringSelection("C:\\Users\\sives\\git\\AutomationProject\\AutomationCourse\\src\\test\\resources\\searchelement1.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(se, null);
	Robot r=new Robot();
	r.delay(2500);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	}
	

	public static void main(String[] args) {
	Handlingfileupload	file = new  Handlingfileupload();
	file.initializeBrowser();
	//file.verifyFileUploadUsingSendkeys();
	try {
		file.fileUploadUsingRobotClass();
	} catch (AWTException e) {
	
		e.printStackTrace();
	}
	file.browserCloseAndQuit();
	
	

	}

}
