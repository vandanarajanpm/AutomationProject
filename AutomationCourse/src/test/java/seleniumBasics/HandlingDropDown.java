package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base{
	public void verifyDropDown() {
	driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");	 
	WebElement dropdown1=driver.findElement(By.id("dropdowm-menu-1"));
	Select select = new Select(dropdown1);
	//select.selectByIndex(1);
	//select.selectByValue("python");
	select.selectByVisibleText("SQL");
	}
	public void verifyCheckBox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkBox=driver.findElement(By.xpath("//input[@value='option-2']"));
		checkBox.click();
		System.out.println(checkBox.isSelected());
		
	}
	public void verifyRadioButton() {
	driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement radioButton=driver.findElement(By.xpath("//input[@value='green']"));
	radioButton.click();
		
	}

	public static void main(String[] args) {
		HandlingDropDown handlingdropdown = new HandlingDropDown();
		handlingdropdown.initializeBrowser();
		//handlingdropdown.verifyDropDown();
		handlingdropdown.verifyCheckBox();
	     // handlingdropdown.verifyRadioButton();
			
		}

	}


