package Interface_Pratice;

public class FirefoxDriver implements WebDriver{

	@Override
	public void get(String url) {
		
		System.out.println("Your url is "+ url);
		
	}

	@Override
	public void findElement(String locator) {
		
		System.out.println("Your locator is "+ locator);
		
		
	}

	@Override
	public void close() {
		
		System.out.println("Close the browser");
		
	}

	@Override
	public void quite() {
		
		System.out.println("Quite the browser");
		
		
	}
	

}
