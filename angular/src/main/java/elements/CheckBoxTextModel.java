package elements;


import org.openqa.selenium.WebDriver;



import elementIdenfier.FindElementIdentifierUsingCss;
import elementIdenfier.GlobalInitializer;

public class CheckBoxTextModel extends GlobalInitializer{
	
	FindElementIdentifierUsingCss findelementidentifierusingcss;
	
	public CheckBoxTextModel(WebDriver driver){
		   /** Creating an instance **/
			super(driver);
			this.findelementidentifierusingcss = new FindElementIdentifierUsingCss(driver);
	}
	
	/** Below method is used to check if the checkbox is Enabled**/
	public boolean isEnabled(String modelName){
	        return findelementidentifierusingcss.findElement(modelName).isEnabled();
	}
	
	/** Below method is used to check if the checkbox is Displayed**/
	public boolean isDisplayed(String modelName){
        return findelementidentifierusingcss.findElement(modelName).isDisplayed();
	}
	
	/** Below method is used to check if the checkbox is Selected**/
	public boolean isSelected(String modelName){
        return findelementidentifierusingcss.findElement(modelName).isSelected();
	}
	
	/** Below method is used to select / deselect checkbox**/
	public void selectOrDeselectCheckbox(String modelName){
		findelementidentifierusingcss.findElement(modelName).click();
	}
	
	/** **/
//	protected WebElement findElement(String identifier){
//		return driver.findElement(By.cssSelector(identifier));
//	}
}
