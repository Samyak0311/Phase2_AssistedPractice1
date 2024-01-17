package listernersDemo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	@BeforeClass
	public void connectDB()
	{
		//code
	}
	
	// that means the closeDB() method will get executed as the last method of this class
    // this method will be executed only once in the end
	// this method will get executed after execution of all test method completes
	
	@AfterClass
	public void clossDB()
	{
		//code
	}
	
	
	@BeforeMethod
	public void openbrowser()
	{
		// code 
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		// code 
	}
	
	
	@Test(priority='1')
	public void method1()
	{
		System.out.println("Selenium Code");
	}
	
	
	// this method will not be executed
	@Test(priority='2', dependsOnMethods = {"method1"}, enabled=false )
	public void method2()
	{
		System.out.println("Selenium Code number 2");
	}


}
