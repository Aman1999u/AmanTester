import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_explicetwaite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(Options);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("timerAlertButton")).click();
		
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.alertIsPresent());
		
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();

	}

}

 