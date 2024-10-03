package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessSSL {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		options.setAcceptInsecureCerts(true);//certs mean certificate, accepts ssl certificate 
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		
		driver.getTitle();//privacy error
		
		System.out.println("Title of the page:" +driver.getTitle());
		

	}

}
