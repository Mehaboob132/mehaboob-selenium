package screenCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class capturescreen2 {
	@Test
	void display() {
		WebDriver dr = new ChromeDriver();
	 
		dr.get("https://www.facebook.com");	

}
}