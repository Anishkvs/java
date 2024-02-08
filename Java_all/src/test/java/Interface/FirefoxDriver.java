package Interface;

public class FirefoxDriver implements WebDriver {
	
	public FirefoxDriver() {
		System.out.println("Launch the Firefox broswer");
	}

	@Override
	public void get(String url) {
		
		System.out.println("launch url"+ url);
		
	}

	@Override
	public void findElement(String locator) {
		
		System.out.println("Finding the element"+ locator);
		
	}

	
	@Override
	public void close() {
		
		System.out.println("close the browser");
	}

	@Override
	public void quite() {
		
		System.out.println("quite the browser");
		
	}
	
	@Override
	public void click() {
		
	}

	@Override
	public void sendKeys() {
		
	}

}
