package orangehrm.library;

import org.openqa.selenium.By;

import utils.AppUtils;

public class LoginPage extends AppUtils
{
  public void login(String uid,String pwd)
  {
	  driver.findElement(By.id("txtUsername")).sendKeys(uid);
	  driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	  driver.findElement(By.id("btnLogin")).click();
	  
  }
	public boolean isAdminModuleDisplayed()
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			return true;
			
		}
		else
		{
			return false ;
		}
		
	}
	public boolean isErrorMsgDisplayed()
	{
	
		if(driver.findElement(By.id("spanMessage")).isDisplayed()) 
		{
		return true;
		}	
		else 
		{
		return false;	
		}	
	}
	
	public void logout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	

// code to login as employee and check employee module displayed or not?
public boolean isEmpModuleDisplayed()
// we r using here try catch because when we use if else condition with find element condition Admin displayed or not then Admin will'nt be there ,it'll show no such element exception ,so we have to handle exception.
  {
  try
  {
      driver.findElement(By.linkText("Admin")).isDisplayed();
	  return false;
  }
  catch (Exception e)
	// TODO: handle exception
  {	
	  return true ;
  }








  }











}