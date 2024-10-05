package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedTestScreenMessage {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://demo.opencart.com/");

		String act_title=driver.getTitle();

		if(act_title.equals(act_title)) {

			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test fail");
		}

	}

}
