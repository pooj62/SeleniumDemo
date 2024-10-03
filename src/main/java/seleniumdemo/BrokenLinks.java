package seleniumdemo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	private static Object HttpURLConnecetion;

	public static <HTTPURLConnecetion> void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of Broken Links "+links.size());
		
		int noOfBrokenLinks =0;
		
		for(WebElement linkElement :links) {
			
			String hrefattValue=linkElement.getAttribute("href");
		
	
		if(hrefattValue==null||hrefattValue.isEmpty()) {
			
			System.out.println("href attribute value is null or Empty. So Not possible to check");
			
			continue;
		}
		//hit the url
		try
		{
			URL linkURL = new URL(hrefattValue);//converted href value from string to URL format.
			
			HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();//open connection to the server
			
			conn.connect();//connect to server and request the server
			
			if(conn.getResponseCode()>=400) {
				
				System.out.println(hrefattValue+"------>+BrokenLinls");
				
				noOfBrokenLinks++;
			}
			else {
			
				System.out.println(hrefattValue+"------>+NotBrokenLinls");
		}
	}
		catch(Exception e) {
			
		}

		}
		System.out.println("Number of brokenlinks:"+noOfBrokenLinks);
	}
}
