package seleniumdemo;


import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		
		driver.get("https://institute.upsidon.com/access/sign-in");
		driver.manage().window().maximize();
		
		WebElement emailid = wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@id='mat-input-0']"));
			}
			
		});
			emailid.sendKeys("gaurav2singhal@gmail.com");
		
		WebElement password = wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@id='mat-input-1']"));
			}
			
		});
			password.sendKeys("1234567");
			
			WebElement signinbutton = wait.until(new Function<WebDriver,WebElement>(){
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.xpath("//button[@type='submit']//span[@class='mat-button-wrapper']"));
				}
				
			});
			signinbutton.click();	
	}
				

}
