package seleniumdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.testrail.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement>headerlink=driver.findElements(By.className("breakdance-menu-list"));
		
		System.out.println("Total numbers of headerlinks,"+headerlink.size());
		
		
	}

}
