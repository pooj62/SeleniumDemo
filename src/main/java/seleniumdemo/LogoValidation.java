package seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoValidation {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.upsidon.com/");
		
		driver.manage().window().maximize();
		
		Boolean logo=driver.findElement(By.xpath("(//img[@alt=\"Upsidon logo icon\"])[2]")).isDisplayed();
		
		//verify if status is true
		if(logo) {
			System.out.println("logo is present");
		}else {
			System.out.println("logo is not present");
		}
		
		Boolean logoText=driver.findElement(By.xpath("(//img[@alt=\"Upsidon logo text\"])[2]")).isDisplayed();
		
		if(logoText) {
			System.out.println("LogoText is present");
		} else {
			System.out.println("LogoText is not present");
		}
	}

}
