package automationcore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
public WebDriver driver;
public WebDriver browserInitialisation(String BrowserName) throws Exception
{
	if(BrowserName.equalsIgnoreCase("Chrome"))
	{
		driver = new ChromeDriver();
	}
	else if(BrowserName.equalsIgnoreCase("firefox"))
	{
		driver= new EdgeDriver();
	}
	else
	{
		throw new Exception("Invalid Name exception");
	}
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	return driver;
	
}
}
