package seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://ui.vision/demo/webtest/frames/");

		driver.manage().window().maximize();

		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		WebElement text3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
		text3.sendKeys("Welcome To Frame3");

		driver.switchTo().frame(0);//inner frame ->A part of Iframe

		driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();

		driver.switchTo().defaultContent();

	}

}
