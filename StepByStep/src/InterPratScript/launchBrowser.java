package InterPratScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public  class launchBrowser {
	
	public WebDriver driver;

	
	public void launch() {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
	}
	
	public static void main(String[] args) {
		
		launchBrowser obj = new launchBrowser();
		obj.launch();
		launch();
	}


}
 