package gridDemo;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
public class GridConfigTOML {
static WebDriver driver;
	
	@Test
	public void griddemo() throws MalformedURLException
	{
		
		DesiredCapabilities cap = null;
		
		cap = new DesiredCapabilities();
		
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
	
		driver = new RemoteWebDriver(new URL("http://localhost:4449/wd/hub"),cap);
		
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.getTitle());
		
	}


}
