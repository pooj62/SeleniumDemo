package seleniumdemo;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificSectionScreenShot {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("https://www.flipkart.com/pay-day-aug-bbdh-store");

		driver.manage().window().maximize();

		/*WebElement featuredproducts = driver.findElement(By.xpath("(//div[@class='a7hc-p WccAh0'])[1]"));

		File sourcefile = featuredproducts.getScreenshotAs(OutputType.FILE);

		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\featuredproducts.png");

		sourcefile.renameTo(targetfile);*/

		//get middle of the page
		WebElement TopDealsonGadgets = driver.findElement(By.xpath("(//div[@class='a7hc-p WccAh0'])[3]"));

		File sourcefile = TopDealsonGadgets.getScreenshotAs(OutputType.FILE);

		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\TopDealsonGadgets.png");

		sourcefile.renameTo(targetfile);
		}

	}


