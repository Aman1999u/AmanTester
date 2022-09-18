 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTC_website {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train.search");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("origin")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li//span[text()='BAREILLY - BE']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class=\"ng-tns-c57-9 ui-autocomplete ui-widget\"]")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li//span[text()='AHMEDABAD JN - ADI']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("jDate")).click();
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"journeyClass\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("//span[text()='AC First Class (1A) ']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("journeyQuota")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='PREMIUM TATKAL']")).click();
		
		//Thread.sleep(1000);
				//driver.findElement(By.id("destination")).click();
				
		
		

	}

}
