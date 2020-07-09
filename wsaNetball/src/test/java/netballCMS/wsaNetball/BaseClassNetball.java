package netballCMS.wsaNetball;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassNetball {
WebDriver driver;
String driverPath = "C:\\ComplyBook_Selenium\\newChromeDriver\\chromedriver.exe";

	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://netball-comp-admin-dev.worldsportaction.com/login");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}

	}


