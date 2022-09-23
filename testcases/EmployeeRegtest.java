package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.Employee;
import orangehrm.library.LoginPage;
import utils.AppUtils;

public class EmployeeRegtest extends AppUtils
{
	

  @Parameters({"adminid","password","nam","surname",})
  @Test
  public void checkEmpReg(String uid,String pass,String fname,String lname)
    {
	  LoginPage i = new LoginPage();
	  i.login(uid,pass);
	  Employee emp = new Employee();
	  boolean result = emp.AddEmployee(fname,lname);
	  Assert.assertTrue(result);
	  i.logout();
	
	}

	
}
