package seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://tus.io/demo");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id=\"P0-0\"]")).sendKeys("C:\\Users\\hp\\Downloads\\PoojaChaudhary_Teacher.pdf");

		Thread.sleep(3000);
			if (driver.findElement(By.xpath("//input[@id=\"P0-0\"]")).getText().equals("PoojaChaudhary_Teacher.pdf")) {

			}
				{
					System.out.println("file uploaded");
				}

				{
					System.out.println("Not Uploaded");
				}
	}
}


