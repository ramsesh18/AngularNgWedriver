package elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import testngangular.NewTest;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

/**
 * Hello world!
 *
 */
public class Elements 

{
	
	WebDriver driver;
	

	public Elements(WebDriver driver){
		   //Creating an instance of NgWebDriver
		this.driver = driver;

	}
	
	/** ng-model: Below method is used to enter text in a textbox**/
	public void inputTextModel(String modelName, String inputText){
		driver.findElement(ByAngular.model(modelName)).clear();
		driver.findElement(ByAngular.model(modelName)).sendKeys(inputText);
	}
	
    /**  ng-options: Get the list using ng-options**/	
	public List<WebElement> getListUsingOptions (String modelName){
		return driver.findElements(ByAngular.options(modelName));
		
	}
		 /**  ng-options: From the values received from the list , iterate through it**/	
	public void iterateThroughTheList (List<WebElement> dropdownValues, String textToChoose){
			  for (WebElement option : dropdownValues) {
					 if (option.getText().equalsIgnoreCase(textToChoose)){
							 option.click();
					 }
			  }
	}
		
	/** ng-binding: Get the text using ng-binding**/
	public String getTextBasedOnNgBinding(String modelName){
		return driver.findElement(ByAngular.binding(modelName)).getText();
	}
	
	/** ng-binding: click using ng-binding**/
	public void clickBasedOnNgBinding(String modelName){
		driver.findElement(ByAngular.binding(modelName)).click();
	}
	
	
	
	/** ng-binding: Get all the text based on partial model Name **/
	public List<WebElement> getTextBasedOnNgBindingUsingPartialName(String modelName){
	   	return driver.findElements(ByAngular.binding(modelName));
	}
		
}
