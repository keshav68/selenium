import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class IframeTest {

	
	public static void main(String args[]){
		
		WebDriver driver= new  FirefoxDriver();
		driver.get("http://jqueryui.com/dialog");
		List<WebElement> listFrame=driver.findElements(By.tagName("iframe"));
		System.out.println(" No of iFrame"+listFrame.size());
		
		int i=0;
		for(WebElement element : listFrame){
			
			
			
			System.out.println(driver.switchTo().frame(i).getTitle());
			i++;
			//System.out.println("Frame Name "+element.getText());
			
		}
		
		
	}
}
