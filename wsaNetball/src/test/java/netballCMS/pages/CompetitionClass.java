package netballCMS.pages;
import netballCMS.util.ExcelDataUtil;
import netballCMS.wsaNetball.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//import netballCMS.util.*;

public class CompetitionClass extends BaseClassNetball{
	// TODO Auto-generated method stub
	WebDriver driver;
	String pageTit;
	By compName=By.id("competition_name");
	By defaultLogo=By.className("input.ant-checkbox-input");
	By venue=By.className("div.ant-select-selection__rendered");//not unique and xpath is so long
	By compType=By.xpath("//div[@id='competitionTypeRefId']//label[1]//span[2]");
	By compFormat=By.xpath("//div[@id='competitionFormatRefId']//label[1]//span[2]");
	By compStartDate=By.xpath("//span[@id='startDate']//div//input");
	By compEndDate= By.xpath("//span[@id='endDate']//div//input");
	
	By newCompbutton= By.className("button.ant-btn.primary-add-comp-form.ant-btn-primary");

    public CompetitionClass() throws Exception {
	super();
	PageFactory.initElements(driver, this);

	}

     public void addNewCompetition(int i) throws Exception{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String competitionName=ExcelDataUtil.getCellData(i,4);
		String venueName=ExcelDataUtil.getCellData(i,5);
		driver.findElement(compName).click();
		driver.findElement(compName).sendKeys(competitionName);
		driver.findElement(defaultLogo).click();
		//String ven=driver.findElement(By.className("venue")).getText();
		//List <WebElement> ven = driver.findElements(By.ClassName("venue"));
		driver.findElement(venue).click();
		driver.findElement(venue).sendKeys(venueName);
		
		

		
    
    }
    
    
    
    
    

	//WebElement element= driver.findElement(By.id("id value"));  
	     //String val=element.getAttribute("innerText");
        //String helloMsg=driver.findElement(welcMessage).getText();
		//Assert.assertTrue(helloMsg.contains("Hello"));
    
    
    

}
