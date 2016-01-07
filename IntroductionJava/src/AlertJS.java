import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AlertJS {

	
	public static void main(String args[])
	{
		WebDriver driver= new FirefoxDriver();
		
		driver.get("C:\\Users\\PDC2A-Training.PDC2A\\Desktop\\Keshav\\Selenium\\IntroductionJava\\src\\index.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("clickFunction")).click();
		
		
		
		
		
	}
}
