package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortProduct {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("titan watch for women");

		WebElement  clickonsearchbutton= driver.findElement(By.xpath("//button[@type='submit']"));
		clickonsearchbutton.click();

		List<WebElement>watch=driver.findElements(By.xpath("//div[@class='_75nlfW LYgYA3']"));


		for(int i=0;i<=watch.size();i++) {
			String text=watch.get(i).getText();
			System.out.println(text);
		}
	}
}
