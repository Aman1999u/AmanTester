import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Prectice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Actions a =new Actions(driver);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		a.moveToElement(driver.findElement(By.className("exehdJ"))).perform();
		
		Thread.sleep(1000);
		
		a.moveToElement(driver.findElement(By.className("xtXmba"))).click().perform();
		
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"))).click().sendKeys("camera").perform();
		
		a.moveToElement(driver.findElement(By.xpath("//button[@type=\"submit\"]"))).click().perform();
		

	}

}
