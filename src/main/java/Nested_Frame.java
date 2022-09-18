import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nested_Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		WebDriverManager.chromedriver().setup();  // set up your driver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options); //opening a browser // upcast	
		driver.manage().window().maximize();
		
		
		driver.get("https://demoqa.com/nestedframes");
		//main web page
		System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		
		
		//parent frame
		
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.tagName("body")).getText());
		System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		
		//Child Frame
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		//parent frame 
		driver.switchTo().parentFrame();
		
		System.out.println(	driver.findElement(By.tagName("body")).getText());
		
		
		
		
	}

}
