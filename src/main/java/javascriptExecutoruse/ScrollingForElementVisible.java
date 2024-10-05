package javascriptExecutoruse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingForElementVisible {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");

		driver.manage().window().maximize();
		//Scroll the page till element is visible
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		WebElement communitypoll=driver.findElement(By.xpath(" //strong[contains(text(),'Community poll')]"));

		jse.executeScript("arguments[0].scrollIntoView(true);", communitypoll);

		if (communitypoll.isDisplayed()) {
            System.out.println("Element is in view.");
        } else {
            System.out.println("Element is not in view.");
        }

        // Optionally, you can also validate the element's position
        int elementPosition = communitypoll.getLocation().getY();
        System.out.println("Element Y position: " + elementPosition);

    }  {

		//System.out.println(jse.executeScript("return window.pageYoffset;"));






	}

}
