package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

/**
 * 
 * @author RamaseshanT
 * Utility class for Browser set up
 *
 */
public class Browser  {
		   WebDriver driver;
	
	public Browser(WebDriver driver) {
		this.driver = driver;
		
	}

	/**
	 * Set up class path 
	 * @param classPath
	 */
	public void setUpClasspath(String classPath){
		System.setProperty("webdriver.chrome.driver",classPath);		
	}
	
	 public WebDriver setUpFirefox() {
	        return new FirefoxDriver();
	 }

	 /**
	  * Initialize the chrome driver. This will not start the window maximized.
	  * You need to do it by yourself
	  * @return
	  */
	 public WebDriver setUpChrome() {
	       return new ChromeDriver();
	 }
	 
	 /**
	  * Initialize the chrome driver. This will not start the window maximized.
	  * You need to do it by yourself
	  * @return
	  */
	 public WebDriver setUpChromeAndMaximize() {
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("start-maximized");
		 return new ChromeDriver(options);
	    }

	 
//	 public void invokeUrl(WebDriver driver,String url){
//		 driver.get(url);
//		 
//	 }
	}

