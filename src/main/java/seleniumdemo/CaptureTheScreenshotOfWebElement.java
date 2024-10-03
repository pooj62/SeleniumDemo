package seleniumdemo;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTheScreenshotOfWebElement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.flipkart.com/pay-day-aug-bbdh-store");
		
		driver.manage().window().maximize();
		
		WebElement fulllogo=driver.findElement(By.xpath("(//img[@title='Flipkart'])[1]"));
		
		File sourcefile =fulllogo.getScreenshotAs(OutputType.FILE);
		
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\fulllogo.png");
		
		sourcefile.renameTo(targetfile);

		
	}

}
