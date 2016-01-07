import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class SalesForce {

	
	public static void main(String [] args)
	
	{
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.salesforce.com/in/");
		driver.findElement(By.id("button-login")).click();		
	
		driver.findElement(By.id("signup_link")).click();	
		driver.findElement(By.id("UserFirstName")).sendKeys("keshav");
		driver.findElement(By.id("UserLastName")).sendKeys("keshav");
		driver.findElement(By.id("UserTitle")).sendKeys("Developer");
		driver.findElement(By.id("UserEmail")).sendKeys("Developer@keshav.com");
		driver.findElement(By.id("UserPhone")).sendKeys("0123456789");
		driver.findElement(By.id("CompanyName")).sendKeys("Abcd");
		driver.findElement(By.id("CompanyPostalCode")).sendKeys("411028");
		
		WebElement element =  driver.findElement(By.id("CompanyEmployees"));
		Select noOfEmp= new Select(element);
		noOfEmp.selectByIndex(1);
		
		WebElement element2 =  driver.findElement(By.id("CompanyLanguage"));
		Select lang= new Select(element2);
		lang.selectByIndex(4);
		
		
		driver.findElement(By.id("SubscriptionAgreement")).click();
		driver.findElement(By.linkText("start free trial")).click();
		
		
	}
}
