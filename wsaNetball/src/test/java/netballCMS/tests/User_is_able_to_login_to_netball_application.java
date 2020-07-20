package netballCMS.tests;
import netballCMS.wsaNetball.*;
import netballCMS.pages.*;
import org.testng.annotations.Test;
import netballCMS.util.*;

public class User_is_able_to_login_to_netball_application extends BaseClassNetball{
	
	static LoginPage lp;
	static HomeDashboard hp;

	public User_is_able_to_login_to_netball_application() throws Exception {
		
		super();
		
		
	}

	@Test
	public void User_is_able_to_log_into_netball_application() throws Exception
	{
		int rno;
		ExcelDataUtil.setExcelFileSheet("Testcases");
		rno=ExcelDataUtil.readexcel("User_is_able_to_login_into_the_netball_application");
		System.out.println(rno);
		readData(rno);
		lp=new LoginPage();
		lp.Logging_in(rno);
		hp=new HomeDashboard();
		hp.checkWelcomeMessage(rno);
		
	}


}
