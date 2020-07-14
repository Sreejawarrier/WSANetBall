package netballCMS.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import netballCMS.util.ExcelDataUtil;
import netballCMS.wsaNetball.*;

public class LoginPage extends BaseClassNetball{
	WebDriver driver;
	String pageTitle;
	By userid=By.name("userName");
	By passw=By.name("password");
	By submit=By.className("button.ant-btn open-reg-button.ant-btn-primary");
	
	
	public LoginPage() throws Exception
	{		
		PageFactory.initElements(driver, this);
 

	}

	public String getNetballPageTitle() {
		// 	//Verification Point
		pageTitle = driver.getTitle();
		if(pageTitle.equalsIgnoreCase("AdactIn.com - Search Hotel")) {
			System.out.println("PASS: Browser Title - Expected Result matches Actual Result");
		}
		else {
			System.out.println("FAIL: Browser Title - Expected Result DOES NOT Match Actual Result");
		}
		return pageTitle;
	}
	
	
	public void Logging_in(int i) throws Exception
	{	
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String username=ExcelDataUtil.getCellData(i,2);
		String password=ExcelDataUtil.getCellData(i,3);
		driver.findElement(userid).click();
		driver.findElement(userid).sendKeys(username);
		driver.findElement(passw).click();
		driver.findElement(passw).sendKeys(password);
		driver.findElement(passw).sendKeys(Keys.RETURN);
		driver.findElement(submit).click();
	}
	
		
		//WebElement element= driver.findElement(By.id("id value"));  
	     //String val=element.getAttribute("innerText");
        //String helloMsg=driver.findElement(welcMessage).getText();
		//Assert.assertTrue(helloMsg.contains("Hello"));

	
	
	
	
	
	
	

}
