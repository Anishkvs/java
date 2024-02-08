package Interface;

public class RunInterface {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.get("amazon.com");
		driver.findElement("name");
		driver.close();
		driver.quite();

	}

}
