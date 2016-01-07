package sel;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class Register12 {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://newtours.demoaut.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testRegister12() throws Exception {
		selenium.open("/");
		selenium.click("link=REGISTER");
		selenium.waitForPageToLoad("30000");
		selenium.type("name=firstName", "1111");
		selenium.type("name=lastName", "2222");
		selenium.type("id=email", "4444");
		selenium.type("name=password", "4444");
		selenium.type("name=confirmPassword", "4444");
		selenium.click("name=register");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
