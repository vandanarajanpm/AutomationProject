package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Handlingframe  extends Base{
	public void verifyFrame() {
	driver.navigate().to("https://demoqa.com/frames");
	List<WebElement>totalframe=driver.findElements(By.tagName("iframe"));
	System.out.println(totalframe.size());
	
	WebElement frame =driver.findElement(By.id("frame1"));
	driver.switchTo().frame(frame);
	
	WebElement framename=driver.findElement(By.id("sampleHeading"));
	System.out.println(framename.getText());
	
	driver.switchTo().defaultContent();
	
		
		
	}

	public static void main(String[] args) {
	Handlingframe frame = new Handlingframe();
	frame.initializeBrowser();
	frame.verifyFrame();
		
		

	}

}
