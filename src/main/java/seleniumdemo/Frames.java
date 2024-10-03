package seleniumdemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.manage().window().maximize();
		
		//frame1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		WebElement text1 = driver.findElement(By.xpath("//input[@name='mytext1']"));
		text1.sendKeys("Welcome");
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		WebElement text2 = driver.findElement(By.xpath("//input[@name='mytext2']"));
		text2.sendKeys("Welcoem To Frame2");
		
		driver.switchTo().defaultContent();

		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		WebElement text3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
		text3.sendKeys("Welcome To Frame3");
		
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
	
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		WebElement text4 = driver.findElement(By.xpath("//input[@name='mytext4']"));
		text4.sendKeys("Welcome To Frame4");
	}
}
