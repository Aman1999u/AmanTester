import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prectice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		// .....  find elements (id, name ,password)
         
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
	     driver.findElement(By.id("btnLogin")).click();
	   
	    
       	 driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
       	 
       	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		 
		 
		 driver.findElement(By.partialLinkText("Info")).click();
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		
		/*
		driver.get("https://www.facebook.com/");
		
		//..........(Use too Id,name)
		 
		driver.findElement(By.id("email")).sendKeys("aman");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();		
		/*
		//...........(use too Xpath)
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Aman");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		*/
		
	   /*
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.className("signin")).click();
		
		driver.findElement(By.id("login1")).sendKeys("Seleniumpanda@rediffmail.com");
		
        driver.findElement(By.name("passwd")).sendKeys("selenium@123");
		
		driver.findElement(By.className("signinbtn")).click();
		*/
		
		
          
		
	
		
	}

}
