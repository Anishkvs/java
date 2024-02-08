package Interface_Pratice;

public class Run {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("Amazon.com");
		
		driver.findElement("Amazon product");
		

	}

}
