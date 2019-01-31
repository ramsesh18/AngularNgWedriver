package elementIdenfier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;

public class FindElementIdentifierUsingCss extends GlobalInitializer {
	
	
	public FindElementIdentifierUsingCss(WebDriver driver) {
		super(driver);
	}

	public WebElement findElementUsingCss(String identifier, String inputText){
		return driver.findElement(ByAngular.cssContainingText(identifier, inputText));
	}
	
	/** This method is to deal with elements that are non-angular and  just usual selenium stuff**/
	public WebElement findElement(String identifier){
		return driver.findElement(By.cssSelector(identifier));
	}


	
}
