import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrecticeIRCTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train.search");
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		Thread.sleep(1500);
		driver.findElement(By.id("origin")).click();
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()='INDORE JN BG - INDB']")).click();
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@class=\"ng-tns-c57-9 ui-inputtext ui-widget u-default ui-corner-all ui-autocomplete-input ng-star-inserted\"]i-state")).click();
	
		Thread.sleep(1500);
		driver.findElement(By.xpath("//li[@id=\"p-higtion\"]hlighted-op")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("// span[text()='KALYAN JN - KYN']")).click();
	}
	

}
