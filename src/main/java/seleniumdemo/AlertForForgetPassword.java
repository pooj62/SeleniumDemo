package seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertForForgetPassword {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://institute.upsidon.com/access/forgot-password");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"mat-input-0\"]")).sendKeys("pooja.chaudhary62@gmail.com");
		
		driver.findElement(By.xpath("//span[@class=\"mat-button-wrapper\"]")).click();
		
		try {
		    WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.alertIsPresent());
		    Alert alert = driver.switchTo().alert();
		    String alertText = alert.getText();  // Get the alert text if needed
		    System.out.println("Alert text: " + alertText);
		    //Email address is requiredalert.accept();  // Accept the alert (click OK)
		} catch (TimeoutException e) {
		    System.out.println("No alert appeared within the wait time");
		} catch (NoAlertPresentException e) {
		    System.out.println("No alert present");
		}
		
		

	}

}
