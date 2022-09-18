import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Happy_fares {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.happyfares.in/");
		
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Select Origin City']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='anguScroll_value']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("[title='GUWAHATI (GAU)']")).click();
		
		/*
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='anguScroll_value'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[@class='ng-binding ng-scope'])[3]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[id@='anguScroll_value'])[2]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='ng-binding ng-scope'])[4]")).click();
	   */
		
		
		
	}
}



