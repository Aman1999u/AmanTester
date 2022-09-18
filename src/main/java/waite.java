import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train.search");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		driver.findElement(By.id("origin")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//li//span[text()='BAREILLY - BE']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class=\"ng-tns-c57-9 ui-autocomplete ui-widget\"]")).click();
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     	//Thread.sleep(2000);
		driver.findElement(By.xpath("//li//span[text()='AHMEDABAD JN - ADI']")).click();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		driver.findElement(By.id("jDate")).click();
		
		
	}

}
