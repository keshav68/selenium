import java.util.List;

import java_cup.runtime.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class WebCompare {

	
	public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the html unit driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        WebDriver driver = new FirefoxDriver();
       
        
        
       // driver3.get("http://newtours.demoaut.com");
        // And now use this to visit Google
        driver.get("http://newtours.demoaut.com");
        WebElement user = driver.findElement(By.name("userName"));
        user.sendKeys("4444");
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("4444");
        
        WebElement element = driver.findElement(By.name("login"));
        element.submit();
        //element.wait();
        
        List<WebElement> radioButton= driver.findElements(By.name("tripType"));
        
        for (WebElement radioSelector :radioButton){
        	if(radioSelector.getAttribute("value").equalsIgnoreCase("oneway"))
        			radioSelector.click();
        }
        
        WebElement passCount= driver.findElement(By.name("passCount"));
        Select selectPassCount=new Select(passCount);
        selectPassCount.selectByValue("3");
        
        WebElement fromPort= driver.findElement(By.name("fromPort"));
        Select selectFromPort=new Select(fromPort);
       // selectFromPort.selectByValue("Frankfurt");
        
        List<WebElement>cityList =selectFromPort.getOptions();
        
        System.out.println("Please enter city you want check");
       @SuppressWarnings("resource")
	java.util.Scanner sc= new java.util.Scanner(System.in);
       String city = sc.nextLine();
       boolean flag=false;
       for (WebElement ws: cityList)
       {
    	  	if(ws.getText().equalsIgnoreCase(city))
    			flag= true;	  
    	   	 
       }
       
       if(flag)
    	   System.out.println("present");
       else 
    	   System.out.println("Not Present ");
       
       sc.close();
      
       
      
        
	}
}
