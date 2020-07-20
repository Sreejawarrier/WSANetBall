package netballCMS.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import netballCMS.wsaNetball.BaseClassNetball;

public class HomeDashboard extends BaseClassNetball{

		// TODO Auto-generated method stub
		WebDriver driver;
		String pageTit;
		By homeIcon=By.className("button.dropdown-toggle");
		By userProfile=By.className("div.user-profile-box");

		By userNme=By.className("span.user-name");
		By logout=By.className("li.log-out");
		By dashboardHome=By.className("span.dashboard-layout-menu-heading");
		By compIcon= By.className("div.competitions-menu menu-wrap");
		By newCompbutton= By.className("button.ant-btn.primary-add-comp-form.ant-btn-primary");

	    public HomeDashboard() throws Exception {
		super();
		PageFactory.initElements(driver, this);

		}
		//public static void main(String[] args) {

	    public void checkWelcomeMessage(int rno) throws Exception
		{
			String welcomemsg;
			//expectedusername=ExcelUtil.getCellData(rno,5);
			String expectedmsg="Home";
			welcomemsg= driver.findElement(By.className("span.dashboard-layout-menu-heading")).getText();
			Assert.assertTrue(welcomemsg.contains(expectedmsg));
		}
	    public void addCompetition() throws Exception{
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(homeIcon).click();
			driver.findElement(compIcon).click();
			driver.findElement(newCompbutton).click();
			//selects the "NO" option to cancel the registration.Required Only adding Competition
		    driver.switchTo().alert().dismiss();	
			pageTit = driver.getTitle();
			if(pageTit.equalsIgnoreCase("Competitions")) {
				System.out.println("PASS: Browser Title - Expected Result matches Actual Result");
			}
			else {
				System.out.println("FAIL: Browser Title - Expected Result DOES NOT Match Actual Result");
			}
			//Select the "Yes" to add registration along with Competition from the alert dialog box
			//		driver.switchTo().alert().accept();
		   	    
	    }


	}


