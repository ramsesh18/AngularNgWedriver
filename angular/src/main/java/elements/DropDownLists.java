package elements;

import org.openqa.selenium.WebDriver;

import elementIdenfier.FindElementIdentifierUsingNgOptions;
import elementIdenfier.GlobalInitializer;


public class DropDownLists extends GlobalInitializer{

	FindElementIdentifierUsingNgOptions findelementidentifierusingngoptions;
	
	public DropDownLists(WebDriver driver){
		   /** Creating an instance **/
			super(driver);
			this.findelementidentifierusingngoptions = new FindElementIdentifierUsingNgOptions(driver);
	}
	
	/** Below method is used to select a value from the select - element without using ng-options**/
	public void selectASpecificValueFromTheList(String model,String dropDownValue){
		findelementidentifierusingngoptions.findElementUsingSelect(model,dropDownValue);
	}
	
	/** Below method is used to get a value from the select - element using ng-options**/
	public String getASpecificValueFromTheListUsingNgOptions(String options,String dropDownValue){
		return findelementidentifierusingngoptions.selectAValueFromDropdownUsingNgOption(options).
		stream().filter(x -> dropDownValue.equals(x.getText())).findAny().orElse(null).getText();
	}
	
	/** Below method is used to select a value from the select - element using ng-options**/
	public void selectASpecificValueFromTheListUsingNgOptions(String options,String dropDownValue){
		 findelementidentifierusingngoptions.selectAValueFromDropdownUsingNgOption(options).
		stream().filter(x -> dropDownValue.equals(x.getText())).findAny().orElse(null).click();;
	}
	
	/** Below method is used to get the count of values from the select - element using ng-options**/
	public long getCountFromTheListUsingNgOptions(String options){
		return findelementidentifierusingngoptions.selectAValueFromDropdownUsingNgOption(options).
		stream().count();
	}
	
}
