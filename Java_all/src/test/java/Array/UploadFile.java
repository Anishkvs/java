package Array;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public WebDriver driver = null;

	@Test
	public void fileUpload() {


	
		String u = "https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm";
		driver.get(u);

	}

}
