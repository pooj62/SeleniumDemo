package seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.javatpoint.com/java-tutorial");;
	
	//driver.navigate().to("https://institute.upsidon.com/");
	
	driver.manage().window().maximize();
	
	//driver.findElement(By.xpath("(//span[@class=\"mat-button-wrapper\"])[4]")).click();
	
	//Thread.sleep(4000);
	
	//driver.findElement(By.id("mat-input-0")).sendKeys("gaurav2singhal@gmail.com");
	
	//driver.findElement(By.id("mat-input-1")).sendKeys("1234567");
	
	//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	}
	
}



















