package Array.loop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.w2a.base.Page;

public class loop{
	
	
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//input[@type='email']")).sendKeys(a[1][1]);

	for (int i=0; i<4; i++)
	{
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		for (int j=0; j<4; j++)
			

		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("testUser");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("testPass");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
			Thread.sleep(3000);
		}
	}
	
}
	
}
