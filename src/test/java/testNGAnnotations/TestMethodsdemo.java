package testNGAnnotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethodsdemo {
	@Test(groups= {"Sanity","functional","Sprint1.functional"})
	public void method1()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.close();
	}
	
	@Test(groups= {"Sanity"})
	public void method2()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.getTitle());
		driver.close();
	}
	
	@Test (groups= {"Sanity"})
	public void method3()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/");
		System.out.println(driver.getTitle());
		driver.close();
	}
	
	
	@Test(groups= {"Sanity","functional","Sprint1.functional"})
	public void method4()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/projects/");
		System.out.println(driver.getTitle());
		driver.close();
		
	}
	
	
	@Test(groups= {"functional"})
	public void method5()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/support/");
		System.out.println(driver.getTitle());
		driver.close();
	}
	
	@Test(groups= {"functional"})
	public void method6()
	{
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/blog/");
	System.out.println(driver.getTitle());
	driver.close();
		
	}
	
	@Test(groups= {"Sprint1.Sanity","functional"})
	public void method7()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testng.org/");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
