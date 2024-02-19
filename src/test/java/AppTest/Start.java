package AppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		//  WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q"));
		Thread.sleep(6000);
		try {
			Register.Registersignin(driver);
			Login_success.userlogin(driver);
			invalid_Login.invaliduserlogin(driver);
			searchJob.searchnewjob(driver);
			System.out.println("***Testing is Successful***");

		}
		catch(Exception e)
		{

			System.out.println("***Testing is unSuccessful***");

		}
		finally {
			driver.quit();
		}


	}

	}