package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectLastTwoCheckbox {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

		int totalcheckboxes = checkboxes.size();

		for(int i= totalcheckboxes-2;i<totalcheckboxes;i++)
		{
			checkboxes.get(i).click();
		}

	}
}
