package Interface_Pratice;

public interface WebDriver {
	
	public void get(String url);
	
	public void findElement(String locator);
	
	public void close();
	
	public void quite();

}
