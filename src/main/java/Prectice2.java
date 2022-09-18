

	package Mypackage.TestDemo;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeClass;
	import org.testng.AssertJUnit;
	import org.testng.ITestResult;

	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.MediaEntityBuilder;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

	import Utility.Pojo;
	import Utility.Screenshot;
	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Prectice2 {extends  Pojo{

		public static class Login {
			 WebDriver driver;
			 ExtentTest logger;
			   ExtentReports extent;
				@BeforeClass
				   public void beforeclass()
				   {
				     
						WebDriver driver=openChromebrowser();
					    this.driver=driver;
				      
					    ExtentHtmlReporter reporter=new ExtentHtmlReporter("./test-output/Batch14.html");
					    
					     extent=new ExtentReports ();
					    
					    extent.attachReporter(reporter);
					    
					   logger = extent.createTest("testA)");
					  logger = extent.createTest("testB");
				   }
				    
				    @Test(priority=1)
					public   void testA() throws InterruptedException, IOException
				   {
					   
					   
					    Login login = new Login();  
					  
					    Login.sendUserName();
					     Login.sendPassword();
				        Login.clickOnLogInButton();
					   
					 
					     
					    String actual_Url= driver.getCurrentUrl();
					    
					   String Expected_Url= ("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
					    
					   login.verifyhomepageelment();
					   
					   @Test(priority=2)
						public void testB() throws InterruptedException, IOException
					    {
						   Thread.sleep(1000);
					       driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
					      driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
					       
					      
					      driver.findElement(By.xpath("//button[text()=\" Login \"]")).click();
					      Screenshot.captureScreenshot(driver);
				
					      System.out.println("Aman");
					      
					      Assert.fail() ; 
					    }
					 
					    @AfterMethod()
					    public void afterMethod(ITestResult result) throws IOException
					    {
					      if(result.getStatus()==ITestResult.FAILURE)
					      {
					    	String temp=  Screenshot.captureScreenshot(driver);
					    	  
					    	  logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
					      }
					    
					       extent.flush();
					    }
					    @AfterClass()
					    public void afterClass()
					    {
					    	System.out.println("AfterClass_ClassA");
					    }
					    }				    }			    
}
