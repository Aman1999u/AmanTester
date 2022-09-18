import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List_Box_prectice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		/*	
        driver.get("https://support.google.com/mail/answer/56256?hl=en");
        
        
        driver.findElement(By.partialLinkText("Create an ")).click();
        
        //
        driver.findElement(By.name("firstName")).sendKeys("aman");
        driver.findElement(By.id("lastName")).sendKeys("sharma");
        */
        
        
        
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        
        driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Aman");
        
        
        
        
        
	
	}

}
