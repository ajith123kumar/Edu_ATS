package AppTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Login_success extends Register{
	static void userlogin(WebDriver driver) throws Exception
	//Method for login
	{
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(3000);
		try {
			
		// Start login
		driver.findElement(By.xpath("//a[@id='login_Layer']")).sendKeys(Keys.ENTER);
		System.out.println("*****Login Page Open*****");
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("ajithkumar@neverskip.com"+ Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Ajith@1996"+Keys.ENTER);
		
		//exception handled because of steal element to continue code execution
		//try catch allows to defined a block of code to be tested for exceptions(errors) while executed
		System.out.println("*****Login values Enterd Place Entered*****");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("***Login Successful***");

		}
		catch(Exception e)
		{

		System.out.println("***Login unSuccessful***");

		System.out.println("");
	}
		finally {
            driver.quit();
        }
	}

}
