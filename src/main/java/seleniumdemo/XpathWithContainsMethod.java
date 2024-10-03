package seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithContainsMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		
		//xpath with contains
		driver.findElement(By.xpath("//input[contains(@placeholder,'rch')]")).sendKeys("tshirt");
		
		//xpath start-with
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'earch')]")).sendKeys("tshirt");
		
	}

}
