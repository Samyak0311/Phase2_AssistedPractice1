package gridDemo;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemoStandalone {
public static WebDriver driver;
	
	@Test
	public void griddemo() throws MalformedURLException
	{
		
		//execute code in chrome browser -- use ChromeOptions class
		
	
		// to pass the control for exeuction of code via the grid
		// class -> RemoteWebDriver
		
		ChromeOptions cap = new ChromeOptions();
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.getTitle());
		
	}
	


}
