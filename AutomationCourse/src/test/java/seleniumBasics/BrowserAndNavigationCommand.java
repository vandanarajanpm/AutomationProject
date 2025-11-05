package seleniumBasics;

public class BrowserAndNavigationCommand extends Base{
	public void browserCommand() {
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String id =driver.getWindowHandle();
		System.out.println(id);
		
		String source=driver.getPageSource();
		System.out.println(source);
	}
	
	public void navigationCommand() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
	}

	public static void main(String[] args) {
		BrowserAndNavigationCommand cmds = new BrowserAndNavigationCommand();
		cmds.initializeBrowser();
		cmds.browserCommand();
		//cmds.navigationCommand();
		

	}

}
