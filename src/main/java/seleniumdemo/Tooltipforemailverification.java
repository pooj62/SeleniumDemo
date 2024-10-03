package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltipforemailverification {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://institute.upsidon.com/access/sign-in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		WebElement emailalert = driver.findElement(By.xpath("(//strong[contains(text(), \"required\")])[1]"));
		
		String fillemailalert = emailalert.getText();
		
		System.out.println("Not fill email error message : :"+fillemailalert);
		
		WebElement paswordalert = driver.findElement(By.xpath("(//strong[contains(text(), \"required\")])[2]"));
		
		System.out.println("Not fill email error message : :"+ paswordalert);
		
	}

}
