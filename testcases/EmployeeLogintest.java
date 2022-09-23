package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class EmployeeLogintest extends AppUtils

{
		
	@Test
  public void Employeelogin()
  {
	LoginPage l = new LoginPage();
    l.login("R1234","Rina@1128" );
	boolean res = l.isEmpModuleDisplayed();
	Assert.assertTrue(res);	
	l.logout();	
  }			
}
