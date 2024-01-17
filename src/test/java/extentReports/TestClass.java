package extentReports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {


	@Test(testName= "TestAmazon")
	public void method1()
	{
		
		driver.get("https://www.selenium.dev/documentation/");
		String expectedtitle = "amazon";
		
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedtitle);
		
		// record the ststua of the test in the report
		
		extentTest.fail("Assertion has failed, Titles are not same");
	
	}
	
	@Test(testName= "testSelenium")
	public void method2()
	{
	
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.getTitle());
		extentTest.info("Able to open the page and captured the URL");
		extentTest.pass("Test Passed");
	}
	
	@Test (testName= "testSeleniumDocs")
	public void method3()
	{
	
		driver.get("https://www.selenium.dev/documentation/");
		System.out.println(driver.getTitle());
		extentTest.info("Able to open the page and captured the URL");
		extentTest.pass("Test Passed");
	}


}
