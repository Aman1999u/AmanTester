import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prectice_Website {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
	//	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Type to Select Countries\"]")).sendKeys("Ind");
       
		driver.findElement(By.xpath("//li//div[text()='British Indian Ocean Territory']"));
		 
	}

}