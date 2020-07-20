package netballCMS.wsaNetball;

import java.util.concurrent.TimeUnit;
/**
* Base class initializes the chrome driver
* It reads the configuration details from the Excel sheet
* It also has method to implement scroll to
* 
*
*/
import netballCMS.util.ExcelDataUtil;
import netballCMS.util.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassNetball {
WebDriver driver;
String driverPath = "C:\\ComplyBook_Selenium\\newChromeDriver\\chromedriver.exe";
public static final String currentDir = System.getProperty("user.dir");
public static final String testDataExcelFileName="testdata.xlsx";
public static String userName, passwd, testcaseName;

	public BaseClassNetball() throws Exception
	{
		
	}
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://netball-comp-admin-dev.worldsportaction.com/login");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
	
	
	public void readData(int i) throws Exception
	{
		//String userName, passwd, testcaseName;
		
		//ExcelDataUtil.setExcelFileSheet("TestCases");
		testcaseName=ExcelDataUtil.getCellData(i,1);
		Log.info(testcaseName);
		userName=ExcelDataUtil.getCellData(i,2);
		passwd=ExcelDataUtil.getCellData(i,3);
		
	}
	
	public void closeApp()
	{
		driver.quit();
	}

	}


