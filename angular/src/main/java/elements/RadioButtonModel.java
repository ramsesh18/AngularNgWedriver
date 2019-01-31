package elements;



import org.openqa.selenium.WebDriver;

import elementIdenfier.FindElementIdentifierUsingBinding;
import elementIdenfier.FindElementIdentifierUsingCss;
import elementIdenfier.FindElementIdentifierUsingModel;
import elementIdenfier.GlobalInitializer;


public class RadioButtonModel extends GlobalInitializer {
	
	FindElementIdentifierUsingCss findelementidentifierusingcss;
	FindElementIdentifierUsingModel findelementidentifier;
	FindElementIdentifierUsingBinding  findelementidentifierusingbinding;

	
	public RadioButtonModel(WebDriver driver){
			super(driver);
			this.findelementidentifier = new FindElementIdentifierUsingModel(driver);
			this.findelementidentifierusingcss = new FindElementIdentifierUsingCss(driver);
			this.findelementidentifierusingbinding = new FindElementIdentifierUsingBinding(driver);
	}
	
	/** Below method is used to check if the radiobutton is Enabled. It accepts ng-bind value as parameter
	 * HINT: Usually it will under the tag label for radio box**/
	public boolean isEnabled(String bindingModelName){
	        return findelementidentifierusingbinding.findElementUsingBinding(bindingModelName).isEnabled();
	}
	
	/** Below method is used to check if the radiobutton is Displayed. It accepts ng-bind value as parameter.
	 *  HINT: Usually it will under the tag label for radio box.**/
	public boolean isDisplayed(String bindingModelName){
        return findelementidentifierusingbinding.findElementUsingBinding(bindingModelName).isDisplayed();
	}
	
	/** Below method is used to check if the radiobutton is Selected. It accepts ng-bind value as parameter.
	 *  HINT: Usually it will under the tag label for radio box.**/
	public boolean isSelected(String bindingModelName){
        return findelementidentifierusingbinding.findElementUsingBinding(bindingModelName).isSelected();
	}
	
	/** Below method is used to select radio button. It accepts ng-bind value as parameter.
	 *  HINT: Usually it will under the tag label for radio box.**/
	public void selectRadioButton(String bindingModelName){
		findelementidentifierusingbinding.findElementUsingBinding(bindingModelName).click();
	}
	
	

//	/** **/
//	protected WebElement findElement(String identifier){
//		return driver.findElement(By.cssSelector(identifier));
//	}
}