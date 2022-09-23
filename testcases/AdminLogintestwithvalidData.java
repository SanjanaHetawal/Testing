package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLogintestwithvalidData extends AppUtils
{
	
	
	@Parameters({"adminid","password"})
	@Test
   public void checkAdminLogin(String uid,String pwd)
   {
		LoginPage log = new LoginPage();
        log.login(uid,pwd);
        
   boolean res = log.isAdminModuleDisplayed();
   Assert.assertTrue(res);
        
   log.logout();     
   }   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

