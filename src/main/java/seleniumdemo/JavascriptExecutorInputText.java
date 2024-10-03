package seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorInputText {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://institute.upsidon.com/");
		
		driver.manage().window().maximize();
		
		WebElement signinbutton =driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", signinbutton);
		
		WebElement email=driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		
		//email.sendKeys("pooja.chaudhary62@gmail.com");
		
		js.executeScript("arguments[0].value='pooja.chaudhary62@gmail.com';",email);
		
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		
		js.executeScript("arguments[0].value='12345';",password);
		
		WebElement signbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		signbutton.click();
		
		//js.executeScript("arguments[0].click()", signbutton);
		
		}

}
