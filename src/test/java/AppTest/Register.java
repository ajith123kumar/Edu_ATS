package AppTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class Register {
	public static void userlogin(Webdriver driver) throws Exception
	{
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(3000);
		try {
			
		// Start Register
		driver.findElement(By.xpath("//a[@id='register_Layer']").click);
		System.out.println("*****Register Page Open*****");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys."Ajith Kumar D"+.ENTER);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys."ajithkumar@neverskip.com"+.ENTER);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys."Ajith@1996"+.ENTER);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys."7418135553"+.ENTER);
		driver.findElement(By.xpath("//div[@class='radioWrap']//div[2]//div[2]//p[1]")).click);
		driver.findElement(By.xpath("//i[contains(@class,'ico resman-icon resman-icon-check-box')]")).click);
		driver.findElement(By.xpath("//button[@type='submit']")).click);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@type='submit']")).click);
		System.out.println("*****Register Successful*****");
		
		}catch(Exception e)
		{

		System.out.println("***Login unSuccessful***");

		System.out.println("");
	}
		finally {
            // DO NOT REMOVE THE BELOW CODE
            driver.quit();
        }

	}
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path_to_chrome_driver");
        WebDriver driver = new ChromeDriver();
        try {
            userLogin(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
