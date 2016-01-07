import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://wikisend.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("uploadfield")).sendKeys("C:\\Users\\PDC2A-Training.PDC2A\\Desktop\\keshav.xls");
		
		driver.findElement(By.id("upload_but")).click();
		
		
	}

}
