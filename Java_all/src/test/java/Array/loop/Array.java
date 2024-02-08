package Array.loop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.w2a.base.Page;

public class Array extends Page{
	
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.lambdatest.com/login");	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String aa[][] = new String[2][3];
		
		aa[0][0] = "firstuser@gmail.com";
		aa[0][1] = "SecondUser@gmail.com";
		aa[0][2] = "anishkumarkvs24@gmail.com";
		aa[1][0] = "Pass0111!";
		aa[1][1] = "Pass0222!";
		aa[1][2] = "Anish12!";
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(aa[0][2]);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(aa[1][1]);
		
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
		
			

}
	
}
