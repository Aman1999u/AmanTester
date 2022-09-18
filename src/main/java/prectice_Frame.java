import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prectice_Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//ChromeOptions Options=new ChromeOptions();
		//Options.addArguments("--disable-notifications");
		//WebDriver driver1=new ChromeDriver(Options);
       
		
   //  ((Object) options).addArguments("--disable-notifications");
    //  WebDriver driver1=new ChromeDriver( options);
		
	
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.navigate().refresh();
	//driver.switchTo().frame("nvpush_popup_background_iframe");
	
     	Thread.sleep(1000);
	
	   driver.findElement(By.xpath("//img[@class='closeSummer']")).click();
		
		
		/*
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		//switch to frame by id(string)
		//Thread.sleep(1000);
		//driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		
		//Switch to frame by name(string)
		Thread.sleep(1000);
		driver.switchTo().frame("notification-frame-~19713b278");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class=\"close\"]")).click();
		
		/*
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"fromCity\"]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Kolkata Howrah Junction']")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='New Delhi Railway Station']")).click();
        */


	}

}
