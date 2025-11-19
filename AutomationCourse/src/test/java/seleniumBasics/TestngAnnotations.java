package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
	@Test
	public void sampleTestCase() {
		System.out.println("Test case");
	}
	@BeforeMethod
	public void beforeMethodSample() {
		System.out.println("BeforeMethod");	
	}
	@AfterMethod
	public void afterMethodSample() {
		System.out.println("AfterMethod");	 
		}
	@BeforeClass
	public void beforeclass() {
		System.out.println("Beforeclass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
		}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");	
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Beforesuite");
		
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("Aftersuite");
	}

}
