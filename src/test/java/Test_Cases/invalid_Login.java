package Test_Cases;

import java.time.Duration;

public class invalid_Login {
	static void invaliduserlogin(Webdriver driver) throws Exception
	//Method for login
{
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(3000);
		try {
			
		// Start login
		driver.findElement(By.xpath("//a[@id='login_Layer']").sendKeys.Enter);
		System.out.println("*****Login Page Open*****");
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("testasdf@mail.ced".ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("sdfasdf"+Keys.ENTER);
		
		//exception handled because of steal element to continue code execution
		//try catch allows to defined a block of code to be tested for exceptions(errors) while executed
		System.out.println("*****Login values Enterd Place Entered*****");
		
		driver.findElement(By.xpth("//button[@type='submit']")).click();

		System.out.println("***Login unSuccessful***");

		}catch(Exception e)
		{

		System.out.println("***Login unSuccessful***");

		System.out.println("");
	}
		finally {
            driver.quit();
        }
	}

}
