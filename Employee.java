package orangehrm.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.AppUtils;

public class Employee extends AppUtils

{
 public boolean AddEmployee(String fname,String lname)
 {
driver.findElement(By.linkText("PIM")).click();
driver.findElement(By.linkText("Add Employee")).click();
driver.findElement(By.name("firstName")).sendKeys(fname);
driver.findElement(By.name("lastName")).sendKeys(lname);
String  idno = driver.findElement(By.id("employeeId")).getAttribute("value");	 
driver.findElement(By.id("btnSave")).click();

driver.findElement(By.linkText("Employee List")).click();
driver.findElement(By.name("empsearch[id]")).sendKeys(idno);
driver.findElement(By.id("searchBtn")).click();
WebElement table = driver.findElement(By.id("resultTable"));
List<WebElement> rows = table.findElements(By.tagName("tr"));
List<WebElement> cols;
boolean isemployeereg = false  ;
for(int i =1;i<rows.size();i++)
{
	cols=rows.get(i).findElements(By.tagName("td"));
	if(cols.get(1).getText().equals(idno))
    {
	isemployeereg = true;
	break;
	}
}	
    if(isemployeereg)
    {
    	return true ;
    }
    else
    {
    	return false;
    }

}


//same program as above ,just it includes middle name also.	
 public boolean AddEmployee(String fname,String mname,String lname)	
 {
	 driver.findElement(By.linkText("PIM")).click();
	 driver.findElement(By.linkText("Add Employee")).click();
	 driver.findElement(By.name("firstName")).sendKeys(fname);
	 driver.findElement(By.name("middleName")).sendKeys(mname);
	 driver.findElement(By.name("lastName")).sendKeys(lname);
	 String  idno = driver.findElement(By.id("employeeId")).getAttribute("value");	 
	 driver.findElement(By.id("btnSave")).click();

	 driver.findElement(By.linkText("Employee List")).click();
	 driver.findElement(By.name("empsearch[id]")).sendKeys(idno);
	 driver.findElement(By.id("searchBtn")).click();
	 WebElement table = driver.findElement(By.id("resultTable"));
	 List<WebElement> rows = table.findElements(By.tagName("tr"));
	 List<WebElement> cols;
	 boolean isemployeereg = false  ;
	 for(int i =1;i<rows.size();i++)
	 {
	 	cols=rows.get(i).findElements(By.tagName("td"));
	 	if(cols.get(1).getText().equals(idno))
	     {
	 	isemployeereg = true;
	 	break;
	 	}
	 }	
	     if(isemployeereg)
	     {
	     	return true ;
	     }
	     else
	     {
	     	return false;
	     }

	 }
	 
 }	
	
	
	
	
	
	
	

