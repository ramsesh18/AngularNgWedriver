package elements;

import org.openqa.selenium.WebDriver;

import elementIdenfier.FindElementIdentifierUsingButtonText;
import elementIdenfier.FindElementIdentifierUsingNgOptions;
import elementIdenfier.GlobalInitializer;


public class Button extends GlobalInitializer {
	
	FindElementIdentifierUsingButtonText findelementidentifierusingbuttontext;
	
	public Button(WebDriver driver){
		   /** Creating an instance **/
			super(driver);
			this.findelementidentifierusingbuttontext = new FindElementIdentifierUsingButtonText(driver);
	}
	
	/**
	 * This method takes the name of the button as input
	 * and click it using the name.
	 * Beware: If there are two buttons in the frame with same name, this might not work as expected.
	 * In that case, navigate to that element first and then use this method
	 * @param nameOfTheButton
	 */
	 public void clickTheButton(String nameOfTheButton){
			findelementidentifierusingbuttontext.button(nameOfTheButton).click();;
	 }

	 /**
	  * Takes in the partial name of the button and then click accordingly.
	  * Example: If you have a button name "Click me to open", using just "click" would do if you partialButtonText
	  * @param partialNameOfTheButton
	  */
	 public void clickTheButtonUsingPartialText(String partialNameOfTheButton){
			findelementidentifierusingbuttontext.partialTextButton(partialNameOfTheButton).click();;
	 }
	 
	 /**
	  * Takes in the partial name of the button and then will get the full name accordingly.
	  * @param partialNameOfTheButton
	  */
	 public void getTheNameOfTheButtonUsingPartialText(String partialNameOfTheButton){
			findelementidentifierusingbuttontext.partialTextButton(partialNameOfTheButton).getText();
	 }
}
