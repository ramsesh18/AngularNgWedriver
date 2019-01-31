package elements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import elementIdenfier.FindElementIdentifierUsingCss;
import elementIdenfier.FindElementIdentifierUsingModel;
import elementIdenfier.GlobalInitializer;



public class InputTextModel extends GlobalInitializer {

	FindElementIdentifierUsingModel findelementidentifier;
	FindElementIdentifierUsingCss findelementidentifierusingcss;
	
	public InputTextModel(WebDriver driver){
		/** Initialize**/
		super(driver);
		this.findelementidentifier = new FindElementIdentifierUsingModel(driver);
		this.findelementidentifierusingcss = new FindElementIdentifierUsingCss(driver);
	}
	
	/** ng-model: Below method is used to clear a text in a textbox**/
	public void clearTextValue(String modelName){
		findelementidentifier.findElement(modelName).clear();;
	}
	
	/** ng-model: Below method is used to enter text in a textbox**/
	public void setTextValue(String modelName, String inputText){
		findelementidentifier.findElement(modelName).sendKeys(inputText);
	}
	
	/** ng-model: Below method is used to get text from a field**/
	public String getTextValue(String modelName, String inputText){
		return findelementidentifier.findElement(modelName).getText();
	}
	
	/** ng-model: Below method is used to check if the textbox is enabled**/
	public boolean isEnabled(String modelName){
        return findelementidentifier.findElement(modelName).isEnabled();
	}
	
	/** ng-model: Below method is used to check if the textbox is displayed or not**/
	public boolean isDisplayed(String modelName){
		return findelementidentifier.findElement(modelName).isDisplayed();
	}
	
	/** ng-model: Below method is used to get the value of text**/
	public String inputTextModelToGetTheValueOfTheTextBox(String modelName){
		return findelementidentifier.findElement(modelName).getText();
	}
	
	/** ng-model: Below method is used to get the value of text**/ 
	public WebElement cssContainingText(String modelName, String inputText){
		return findelementidentifierusingcss.findElementUsingCss(modelName, inputText);
	}
	
	
	/** ng-model: Below method is used to get the first value returned using Auto Complete
	 * @throws InterruptedException **/
	public void selectAutocompleteFirstValue(String modelName) throws InterruptedException{
		Thread.sleep(2000);
		findelementidentifier.findElement(modelName).sendKeys(Keys.ARROW_DOWN);
		findelementidentifier.findElement(modelName).sendKeys(Keys.ENTER);
	}
	
	
}