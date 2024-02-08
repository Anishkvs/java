package Interface;

public class ChromeDriver implements WebDriver {
	
	public ChromeDriver() {
		System.out.println("launch the Chrome broswer");
	}

	@Override
	public void get(String url) {
		
		System.out.println("launch url "+ url);
		
	}

	@Override
	public void findElement(String locator) {
		
		System.out.println("Finding the element "+ locator);
		
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
