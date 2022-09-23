package orangehrm.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.LoginPage;
import orangehrm.library.User;
import utils.AppUtils;

public class UserRegtest extends AppUtils

{
	@Parameters({"R","uname","uid","pass"})
   @Test
   public void userReg (String role,String empname,String uid,String pwd) throws InterruptedException
   {
	LoginPage l = new LoginPage();
	l.login("Admin","Qedge123!@#");
	User u = new User();
	u.addUser(role, empname, uid, pwd);
	   
	l.logout();   
	   
	   
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
