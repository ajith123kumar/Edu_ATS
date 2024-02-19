package AppTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class searchJob extends Login_success
{
	public static void searchnewjob(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	//	Thread.sleep(3000);
		try {

			// Start login
			driver.findElement(By.xpath("//span[@class='nI-gNb-sb__placeholder']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Enter keyword / designation / companies']")).sendKeys("Software Tester" + Keys.ENTER);
			WebElement dropdownElement = driver.findElement(By.xpath("//input[@id='experienceDD']"));
	        
	        // Wrap the dropdown element with a Select object
	        Select dropdown = new Select(dropdownElement);
	        
	        dropdown.selectByIndex(2);
	        
			driver.findElement(By.xpath("//input[@placeholder='Enter location']")).sendKeys("Chennai"+ Keys.ENTER);
			System.out.println("*****Search Job Successful*****");

		}
		catch(Exception e)
		{
			System.out.println("***JobSearch unSuccessful***");
		}
		finally {
            // DO NOT REMOVE THE BELOW CODE
            driver.quit();
        }

	

	}


}
