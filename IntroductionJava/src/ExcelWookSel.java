import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ExcelWookSel {

	
	public static void main(String args[])
	{
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		
		Workbook ws;
		try {
			ws = Workbook.getWorkbook(new File("C:\\Users\\PDC2A-Training.PDC2A\\Desktop\\keshav.xls"));
			Sheet worksheet= ws.getSheet(0);
			
			
			for(int r=0;r<worksheet.getRows();r++)
			{
				WebElement user = driver.findElement(By.name("userName"));
		        user.sendKeys(worksheet.getCell(0, r).getContents());
		        WebElement pass = driver.findElement(By.name("password"));
		        pass.sendKeys(worksheet.getCell(0, r).getContents());
		        
		        WebElement element = driver.findElement(By.name("login"));
		        element.submit();
		        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		        
		        
		        
		        
			}
					
					
			
			
			
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
