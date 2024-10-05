package javascriptExecutoruse;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPageTillEndOfthePage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.upsidon.com/");

		JavascriptExecutor jse =(JavascriptExecutor)driver;



		jse.executeScript("window.scrollBy(0,document,body,scrollHeight)");

	}

}
