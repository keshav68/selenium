import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class IntroWeb {

	
	public static void main(String args[]){
		
		WebDriver dr= new FirefoxDriver();
		
		dr.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		dr.get("http://newtours.demoaut.com");
		dr.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		/*WebElement we= dr.findElement(By.id("round_trip_button1"));
		String []classes= we.getAttribute("class").split(" ");
		
		for (String temp: classes){
			if (temp.equalsIgnoreCase("active"))
					System.out.println("selected");
			
		}
		
		System.out.println(we.getText());
		*/
		int k=0;
		
		List<WebElement> alllinkspresent=dr.findElements(By.tagName("a"));
		for(WebElement temp :alllinkspresent){
			k++;
			System.out.println(temp.getText());
			
			//System.out.println(temp.getAttribute("link"));
		}
		System.out.println("number of link "+k);
		System.out.println(alllinkspresent);
		System.out.println("Program Ends ");
	}
	
}
