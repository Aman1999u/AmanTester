import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class End {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//String expur1="   https://www.gmail.com/";
		//Thread .sleep(1000);
		//driver.get(expur1);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		
		//Find elements(by class)
		
		driver.findElement(By.className("usere_name")).sendKeys("standard_user");
		
		
		//find a element tagname(class attribute value)
		
		 driver.findElement(By.tagName("input")).sendKeys("standard_user");
		
		/*
		 
		
		
		
		
		
		//find a element tagname(class attribute value)
		
		 driver.findElement(By.tagName("input")).sendKeys("standard_user");
		
		/*
		
		
		
		//find a element 
		driver.findElement(By.xpath("(//input)[3]")).click();
		
		//find a elements using bytagname
		
		driver.findElement(By.xpath("//input")).sendKeys("standard_user");
		
		
		
		//find a element tagname(class attribute value)
		
		 driver.findElement(By.tagName("input")).sendKeys("standard_user");
		
		/*
		//driver.get("https://www.saucedemo.com/");
		+Thread.sleep(1000);
		 */
		   
		 
		//find element using Id(ID aatribute value)
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
	
		 
		 // Find elements using Name(Name aatribute value )
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		
		// Finad elements using Password(Password aatribute value)
		
		  
		
		
        // Find elements(password)         		
		
		driver.findElement(By.id("password")).sendKeys("abcdsfgh");
		
		
		
		
		/* 
		 // It is used too Finalelement 
		 
		driver.findElement(By.className("whsQnd zHQkbf"));

		Thread .sleep(1000);
		
		
		/*
		// It is used too Title 
		System.out.println(driver .getTitle());
		System.out.println(driver.getCurrentUrl());
		
		*/
		
		
		
		/*
		 
		 // It is  used too POsition 
		  
		System.out.println(driver.manage().window().getPosition().getX());
		System.out.println(driver.manage().window().getPosition().getY());
		Point p=driver.manage().window().getPosition();
		System.out.println(p.getX());
		System.out.println(p.getY());
		Thread.sleep(1000);
		Point p2 = new Point(50,50);
		driver.manage().window().setPosition(p2);
		*/
		
		
	/*	
	    // It is used too Quit keyword 
		driver.get(expur1);
		Thread.sleep(1000);
		
		WebDriver driver1=new ChromeDriver();
		
		driver1.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.quit();                                            
		driver1.quit();
		*/
			
		/*
		
		  //It is used to be closer keyword 
		driver.get(expur1);
		Thread.sleep(1000);
		
		WebDriver driver1=new ChromeDriver();
		
		driver1.get("https://www.onlinesbi.com/");
		Thread.sleep(1000);
		driver.quit();
		driver1.quit();
		
		driver.close();
		driver1.close();
		
		
		/*
		// It is used to be Maximize keyword
		 
		 
		Thread.sleep(1000);
		driver.navigate().to("https://www.google.com");
		driver.get(expur1);
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.close();
	//	driver1.close();
		*/
		
		// use to dimension
	/*	   
		Dimension d1=driver.manage().window().getSize();
		System.out.println(d1.getHeight());
		System.out.println(driver.manage().window().getSize().getWidth());
		
		Thread.sleep(1000);
		Dimension d=new Dimension(1000,500);
		driver.manage().window().setSize(d);
		
		*/
		

	}

}
