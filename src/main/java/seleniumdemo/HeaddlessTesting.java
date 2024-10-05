package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeaddlessTesting {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();

		// Add the headless argument to run Chrome in headless mode
		options.addArguments("--headless= new");//setting for headless mode of execution

		options.addArguments("--disable-gpu"); // Disables GPU hardware acceleration

        options.addArguments("--window-size=1920,1080"); // Sets a standard window size

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://demo.opencart.com/");

		String act_title = driver.getTitle();

		if(act_title.equals("Your Store")) {

			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}

		driver.quit();
	}

}
