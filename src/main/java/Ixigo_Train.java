import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ixigo_Train {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.ixigo.com/trains");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder=\"Leaving from\"]")).click();
		/*
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='H Nizamuddin (NZM)']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Going to']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Surat (ST)']")).click();
		*/
	}

}
