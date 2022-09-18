import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(Options);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
     
    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	      File dest = new File("C:\\AMAN\\google.jpg");
	      
	      
	      FileUtils.copyFile(src, dest);
		
	}

}
