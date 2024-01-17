package dataDrivenTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test; 

public class ParameterDemo {
public static WebDriver driver;
	
	@BeforeTest
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
	}
	
	
	@Parameters({"username","lastName","email","telephone","password","confirm"})
	//form[@class='form-horizontal']/descendant::input[2]
	@Test
	public void register_user(String username, String lastName, String email, String telephone, String password, String confirm )
	{
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys(lastName);
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(telephone);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(confirm);
			
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}


}
