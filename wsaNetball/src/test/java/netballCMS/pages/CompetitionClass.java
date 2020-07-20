package netballCMS.pages;
import netballCMS.wsaNetball.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import netballCMS.util.*;

import com.sun.tools.javac.util.Assert;

public class CompetitionClass extends BaseClassNetball{
	// TODO Auto-generated method stub
	WebDriver driver;
	By homeIcon=By.className("button.dropdown-toggle");
	By userProfile=By.className("div.user-profile-box");

	By userNme=By.className("span.user-name");
	By logout=By.className("li.log-out");
	By dashboardHome=By.className("span.dashboard-layout-menu-heading");
    public CompetitionClass() throws Exception {
	super();
	PageFactory.initElements(driver, this);

	}

    public void checkWelcomeMessage(int rno) throws Exception
	{
		WebElement welcomemsg;

		String expectedusername,expectedmsg;
		//expectedusername=ExcelUtil.getCellData(rno,5);
		expectedmsg="Home";
		welcomemsg= (WebElement)driver.findElement(By.className("span.dashboard-layout-menu-heading"));

		//Assert.assertEquals(welcomemsg.getText(),expectedmsg);
	}

	//WebElement element= driver.findElement(By.id("id value"));  
	     //String val=element.getAttribute("innerText");
        //String helloMsg=driver.findElement(welcMessage).getText();
		//Assert.assertTrue(helloMsg.contains("Hello"));

}
