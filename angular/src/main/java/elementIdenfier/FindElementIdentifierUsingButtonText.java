package elementIdenfier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;

public class FindElementIdentifierUsingButtonText extends GlobalInitializer  {
	

	public FindElementIdentifierUsingButtonText(WebDriver driver) {
		super(driver);
	}

	/**
	 * To use this method, just mention text mentioned in the button
	 * @param identifier
	 * @return
	 */
	public WebElement button(String identifier){
		return driver.findElement(ByAngular.buttonText(identifier));
	}
	
	/**
	 * To use this method, just mention partial text mentioned in the button
	 * @param identifier
	 * @return
	 */
	public WebElement partialTextButton(String partialTextIdentifier){
		return driver.findElement(ByAngular.partialButtonText(partialTextIdentifier));
	}
	

}
