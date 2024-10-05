package seleniumdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksInaWebPage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.upsidon.com/");

		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (WebElement link : links) {
		    System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}


	}

}
