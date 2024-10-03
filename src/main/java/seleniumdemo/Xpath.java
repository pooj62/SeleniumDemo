package seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		
		
		//xpath with single element
		//WebElement tshirt =driver.findElement(By.xpath("//input[@name='search']"));
        //tshirt.sendKeys("tshirt");   
		
		//xpath with multiple attribute
        //WebElement tshirt = driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']"));
        //tshirt.sendKeys("tshirt");        
		
		//using and operator
		//WebElement tshirt = driver.findElement(By.xpath("//input[@name='search'and@placeholder='Search']"));
		//tshirt.sendKeys("tshirt");
		
		
		//using or operator
		//WebElement tshirt = driver.findElement(By.xpath("//input[@name='search'or@placeholder='search']l"));
		//tshirt.sendKeys("tshirt");
		
		
		//xpath with text()=inner Text
		//boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		//System.out.println(displaystatus);
		
		//String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		//System.out.println(value);
		 
	}
}

