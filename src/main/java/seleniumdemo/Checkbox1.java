package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://total-qa.com/checkbox-example/");

		List<WebElement> check=driver.findElements(By.xpath("//input[@type='checkbox']"));

		//select all checkbox
		/*for(WebElement checkbox:check)
		{
			checkbox.click();
		}
		System.out.println("Total No.of checkboxes:"+check.size());
		}*/
		//First two selected checboxes
	/*for(int i=0; i<2;i++) {

		check.get(i).click();
	}
		System.out.println("Total Number of checkboxes:"+check.size());
	}*/


	}
}


