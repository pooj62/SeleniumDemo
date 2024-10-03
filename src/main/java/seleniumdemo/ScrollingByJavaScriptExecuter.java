package seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Durations;

public class ScrollingByJavaScriptExecuter {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		driver.get("https://www.upsidon.com/");
		
		driver.manage().window().maximize();
		
		WebElement teacher=driver.findElement(By.xpath("//div[@id=\"mat-tab-label-0-1\"]"));
		 
	    //Scroll down pageby pixelnumber
		 
		Long scrollPosition = (Long) jse.executeScript("window.scrollBy(0,1500); return window.scrollY;");
		System.out.println(scrollPosition);
		 
		 

	
	}

}
