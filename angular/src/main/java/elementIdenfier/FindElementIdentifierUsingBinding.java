package elementIdenfier;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;

public class FindElementIdentifierUsingBinding extends GlobalInitializer {
	
	
	public FindElementIdentifierUsingBinding(WebDriver driver) {
		super(driver);
	}

	public WebElement findElementUsingBinding(String bindingIdentifier){
		return driver.findElement(ByAngular.binding(bindingIdentifier));
	}
	

}
