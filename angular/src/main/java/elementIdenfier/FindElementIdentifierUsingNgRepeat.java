package elementIdenfier;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;

public class FindElementIdentifierUsingNgRepeat extends GlobalInitializer  {
	
	public FindElementIdentifierUsingNgRepeat(WebDriver driver) {
		super(driver);
	}
	/** ng-repeat : get the value by iterating through the column**/
	public List<WebElement> getTheListValueOfNgRepeatByIterationThroughColumn(String repeatIdentifier, String columnName){
		return driver.findElements(ByAngular.repeater(repeatIdentifier).column(columnName));
	}
	
	/** ng-repeat : get row id based on row id **/
	public WebElement getTheListValueOfNgRepeatBasedOnRowNumber(String repeatIdentifier, int rowId){
		return driver.findElement(ByAngular.repeater(repeatIdentifier).row(rowId));
	}
	
	/** ng-repeat : get row id based on row id and column Name**/
	public WebElement getTheListValueOfNgRepeatBasedOnRowNumberAndColumnName(String repeatIdentifier, int rowId, String columnName){
		return driver.findElement(ByAngular.repeater(repeatIdentifier).row(rowId).column(columnName));
	}
	
	/** ng-repeat : give me everything (including row and column) - I will sort them out myself**/
	public List<WebElement> getAllTheListValueOfNgRepeat(String repeatIdentifier){
		return driver.findElements(ByAngular.repeater(repeatIdentifier));
	}

}
