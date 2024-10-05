package seleniumdemo;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.nopcommerce.com/en/demo");

		driver.manage().window().maximize();

		//full page screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;

		File sourcefile = ts.getScreenshotAs(OutputType.FILE);

		//The path to this file is constructed using System.getProperty("user.dir"), which retrieves the current working
		//directory of the project.
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
		//Create an object of the File class

		boolean flag =sourcefile.renameTo(targetfile);

		if(flag) {
			System.out.println("File successfully rename");
		}
		else {
			System.out.println("operation failed");
		}

	}

}
