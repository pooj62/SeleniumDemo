package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleSelectCheckbox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		/*for(int i=0;i<checkboxes.size();i++) {
			
			checkboxes.get(i).click();
		}*/
		
		//foreach
		for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}
		System.out.println("Total No.of checkboxes:"+checkboxes.size());
			
	}

	
}
