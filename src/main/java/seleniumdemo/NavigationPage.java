package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://snapdeal.com/");

		driver.get("https://www.amazon.in/");

		Thread.sleep(3000);

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();

	}

}
