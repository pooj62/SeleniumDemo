package seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartPrefix {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://ecommerce.test.k6.io/");

		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("a.attachment-woocommerce_thumbnail size-woocommerce_thumbnail[href='http://ecommerce.test.k6.io/product/album/']"));
	}

}
