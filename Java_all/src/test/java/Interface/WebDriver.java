package Interface;

//https://www.youtube.com/watch?v=aBfj5xQZazM&t=2s
//InterView question
//Can you create your own WebDriver

public interface WebDriver {
	
	
	public void get(String url);
	
	public void findElement(String locator);
	
	public void click();
	
	public void sendKeys();
	
	public void close();
	
	public void quite();
	
	
	
	

}
