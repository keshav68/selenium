import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;


public class Sample {

	
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
        selectFromPort.selectByValue("Frankfurt");
        
        
        
        WebElement fromMonth= driver.findElement(By.name("fromMonth"));
        Select selectFromMonth=new Select(fromMonth);
        selectFromMonth.selectByValue("3");
        
        
        WebElement fromDay= driver.findElement(By.name("fromDay"));
        Select selectFromDay=new Select(fromDay);
        selectFromDay.selectByValue("10");
        
        
        WebElement toPort= driver.findElement(By.name("toPort"));
        Select selectToPort=new Select(toPort);
        selectToPort.selectByValue("London");
        
        
        WebElement toMonth= driver.findElement(By.name("toMonth"));
        Select selectToMonth=new Select(toMonth);
        selectToMonth.selectByValue("4");
        
        WebElement toDay= driver.findElement(By.name("toDay"));
        Select selectToDay=new Select(toDay);
        selectToDay.selectByValue("20");
        
        List<WebElement> radioButtonservClass= driver.findElements(By.name("servClass"));
        
        for (WebElement radioSelectorservClass :radioButtonservClass){
        	if(radioSelectorservClass.getAttribute("value").equalsIgnoreCase("First"))
        		radioSelectorservClass.click();
        }
        
        
        WebElement airline= driver.findElement(By.name("airline"));
        Select selectairline=new Select(airline);
        selectairline.selectByVisibleText("Blue Skies Airlines");
        
        WebElement findFlights = driver.findElement(By.name("findFlights"));
        findFlights.submit();
        
        
       
        List<WebElement> radioButtonOutFlight= driver.findElements(By.name("outFlight"));
        
        for (WebElement radioSelectorOutFlight :radioButtonOutFlight){
        	if(radioSelectorOutFlight.getAttribute("value").equalsIgnoreCase("Pangea Airlines$362$274$9:17"))
        		radioSelectorOutFlight.click();
        }
        
        List<WebElement> radioButtonInFlight= driver.findElements(By.name("inFlight"));
        
        for (WebElement radioSelectorInFlight :radioButtonInFlight){
        	if(radioSelectorInFlight.getAttribute("value").equalsIgnoreCase("Pangea Airlines$362$274$9:17"))
        		radioSelectorInFlight.click();
        }
        
        WebElement reserveFlights = driver.findElement(By.name("reserveFlights"));
        reserveFlights.submit();
        
        
        WebElement buyFlights = driver.findElement(By.name("buyFlights"));
        buyFlights.submit();
        
		//WebElement trip= driver.findElement(By.xpath());
       
        
        
        
     //   driver.quit();
    }
}
