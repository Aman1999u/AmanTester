import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//simple 
		
	     driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		  Thread.sleep(1000);
           org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
           System.out.println(alert1.getText());
           Thread.sleep(1000);
           driver.switchTo().alert().accept();
           
        //Conformation
           
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(1000);
       org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.dismiss();
           
		
		//prompat
        
        driver.findElement( By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(1000);
        org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
        System.out.println(alert3.getText());
        alert3.sendKeys("AMAN");
        alert3.accept();

	}

}
