package seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestIncognitoMode {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		
		driver.get("https://www.javatpoint.com/java-tutorial"); 
		
		String act_title=driver.getTitle();
		
		if(act_title.equals("Java Tutorial | Learn Java Programming - javatpoint")) {
			
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test fail");
		}


	}

}
