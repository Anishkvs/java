package Array;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.saucedemo.base.AutomationBase;

@Test
public class UploadFile2 extends AutomationBase{

//1. How will you open Browser in Incognito mode.
	WebDriver driver;
	
	public void incognitoBrowser() {

		 ChromeOptions options = new ChromeOptions(); 
		 options.addArguments("--incognito"); 
		 WebDriver driver = new ChromeDriver(options);
	}
	
	public void switchWindow() {
	
//Switch to the new tab
	//driver.switch_to.window(driver.window_handles[1])	
	}
	
	
}
