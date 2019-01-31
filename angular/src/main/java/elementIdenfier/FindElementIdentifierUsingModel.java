package elementIdenfier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;

public class FindElementIdentifierUsingModel extends GlobalInitializer {

	public FindElementIdentifierUsingModel(WebDriver driver) {
		super(driver);
	}

	public WebElement findElement(String identifier){
		return driver.findElement(ByAngular.model(identifier));
	}
	

}
