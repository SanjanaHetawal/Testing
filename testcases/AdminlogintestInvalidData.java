package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminlogintestInvalidData extends AppUtils
{
	@Parameters({"id","password"})
    @Test
	public void AdminLogintest2(String uid,String pwd)
    {
    	LoginPage lp = new LoginPage();
        lp.login(uid,pwd);
        boolean res = lp.isErrorMsgDisplayed();
        Assert.assertTrue(res);
    	
   
	}















}
