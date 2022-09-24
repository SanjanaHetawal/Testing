package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AppUtils 
{
public static WebDriver driver; // we will declare driver as variable in class level so that it will be global variable & can be accessed among all methods of this class.	

public static String url = "http://orangehrm.qedgetech.com"; // declaring one more static variable ,for every test case in this page,url will be same .
@BeforeTest

public static void launchApp()
   {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get(url);
   }
@AfterTest
public static void CloseApp()
  {
	driver.close();
   }


}
   