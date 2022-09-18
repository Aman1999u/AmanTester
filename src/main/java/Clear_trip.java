import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clear_trip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		Thread.sleep(1000);
		driver.get("https://www.cleartrip.ae/");
		
		//driver.get("https://www.makemytrip.com/railways/");

	}

}
