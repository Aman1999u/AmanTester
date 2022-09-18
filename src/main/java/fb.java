import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(1000);
		WebElement mo = driver.findElement(By.id("month"));
		Select m=new Select(mo);
		m.selectByVisibleText("Sep");
		
		
		    Thread.sleep(1000);
            WebElement da = driver.findElement(By.id("day"));
            Select d=new Select(da);
            d.selectByVisibleText("23");
            
               Thread.sleep(1000);
                  WebElement ya = driver.findElement(By.id("year"));
                  Select y=new Select(ya);
                  y.selectByValue("1999");
                    
              
		
	/*	
		  driver.get("https://www.facebook.com/");
	        driver.findElement(By.linkText("Create new account")).click();
	        
	        Thread.sleep(1000);
	        driver.findElement(By.name("firstname")).sendKeys("Aman");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.name("lastname")).sendKeys("Upadhyay");
	        
	*/
		/*
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Ankit");
		driver.findElement(By.name("lastname")).sendKeys("Kanda");
		//driver.findElement(By.name("reg_email__")).sendKeys("8982181057");
	
		Thread.sleep(2000);
		WebElement d=driver.findElement(By.id("day"));
		Select s = new Select(d);
        s.selectByValue("25");
        */
		
		
	}

}
