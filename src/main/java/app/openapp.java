package app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openapp {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
        
	      //  WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	        driver.get("http://www.google.com");
	        WebElement element = driver.findElement(By.name("q"));
	        Thread.sleep(6000);
	}

}
