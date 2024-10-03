package seleniumdemo;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddBlockExtention {

	public static void main(String[] args) {
		
		/*WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		*/
		File adBlockerExtension = new File("C:\\Users\\hp.crx");

        // Set ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(adBlockerExtension);

        // Initialize the WebDriver with the ChromeOptions
        WebDriver driver = new ChromeDriver(options);

        // Open a website to see if the ad blocker works
        driver.get("https://www.google.com");
		
		

	}

}
