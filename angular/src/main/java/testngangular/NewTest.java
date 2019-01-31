package testngangular;

import java.util.List;
import java.util.stream.Collectors;

import javax.swing.RepaintManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.Browser;

import com.paulhammant.ngwebdriver.ByAngular;
//import com.paulhammant.ngwebdriver.NgWebDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

import elements.Button;
import elements.CheckBoxTextModel;
import elements.DropDownLists;
import elements.Elements;
import elements.InputTextModel;
import elements.RadioButtonModel;
import elements.RepeaterAndTable;

public class NewTest {
	
	WebDriver driver;
	static NgWebDriver ngdriver;
	String bindingModelName = "flightbooking.adults";
	String bindingPartialModelName = "flightbooking";
	 String modelName = "booking.originSearchString";
	 String listOptions = "item for item in range(1, defaults.travelers.adults.max) track by item";
	  String input = "Toronto";
	  String textToSelect = "2";
 
	@BeforeTest
	public void beforeClass() {
		//System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
	}
	
	@Test
	 public void lauchBrowser() throws InterruptedException{
		
		Browser browser = new Browser(driver);
		browser.setUpClasspath("lib/chromedriver.exe");
		driver = browser.setUpChromeAndMaximize();
		
	//	browser.invokeUrl(driver,"https://www.capitalone.com/cars/");
	
//		ChromeOptions options = new ChromeOptions();
//		driver.manage().window().maximize();
//		options.addArguments("--start-maximized");
//		driver = new ChromeDriver();


	  //Sample AngularJs Webpage
	//  driver.get("https://sp.booking.com/index.html?aid=811211&lang=en&label=copaair-Homepage-menubar/viajar-EN");
	//driver.get("https://www.copaair.com/en/web/gs/home");
	//	driver.get("http://www.angularjshub.com/code/examples/collections/01_Repeater/index.demo.php");
		driver.get("https://www.vodafone.co.nz/broadband/internet-plans/");

	   //Creating an instance of NgWebDriver
//ngdriver = new NgWebDriver((JavascriptExecutor) driver);

	 
	  Elements elements = new Elements(driver);
	  InputTextModel input = new InputTextModel(driver);
	  CheckBoxTextModel checkbox =  new CheckBoxTextModel(driver);
	  RepeaterAndTable repeat = new RepeaterAndTable(driver);
	  RadioButtonModel radio =  new RadioButtonModel(driver);
	  DropDownLists dd = new DropDownLists(driver);
	  Button button = new Button(driver);
	  
	  button.clickTheButton("Check plans");
	  
	  Thread.sleep(2000);
	  
	  driver.switchTo().activeElement();
	  
	  Actions action = new Actions(driver);
	  //action.moveToElement(driver.findElement(By.cssSelector("#address-checker > div > div > div > div > h2")));
	  action.moveToElement(driver.findElement(By.cssSelector("#address-checker > div > div > div > div > div > div.address-checker__search-input-wrap")));
	  action.moveToElement(driver.findElement(By.xpath("//*[@id='address-checker']/div/div/div/div/div/div[1]/input"))).click();
	  action.moveToElement(driver.findElement(ByAngular.model("vm.addressSearchField"))).sendKeys("Hey");
//	 driver.findElement(By.xpath("//*[@id='address-checker']/div/div/div/div/div/div[1]/input")).sendKeys("4A Denn");
	// input.setTextValue("vm.addressSearchField", "4A Denny");
	//  driver.findElement(By.cssSelector("#address-checker > div > div > div > div > h2")).click();
	//  driver.findElement(By.cssSelector("#address-checker > div > div > div > div > div > div > input")).sendKeys("4 Denny");
	 // System.out.println(input.isDisplayed("vm.addressSearchField"));
	  
//	  ByAngular.Factory baf = ByAngular.withRootSelector("ng-model");
///	  WebElement element = driver.findElement(baf.model("vm.addressSearchField"));
//	  element.sendKeys("Test");
//	  
//	  NgWebDriver ngwd = new NgWebDriver(driver).withRootSelector("something-custom");
//	  ByAngular.Factory baf = ngwd.makeByAngularFactory()
//	  WebElement element = webDriver.findElement(baf.exactRepeater("day in days"));
//	  element.click();
	  
//	input.setTextValue("vm.addressSearchField", "4A Denny");
//	  button.clickTheButtonUsingPartialText("Add");
	  
//	  FindElementIdentifierUsingBinding bin = new FindElementIdentifierUsingBinding(driver);
//	  bin.findElementUsingBinding("flightbooking.search").click();
//	  driver.findElement(By.xpath("//*[@id='p_p_id_bookingmenu_WAR_copabookingmenuportlet_']/div/div/div/booking-menu/ul/li[5]/a/h2")).click();
//	  Thread.sleep(3000);
	//  ngdriver.waitForAngularRequestsToFinish();
//	  dd.selectASpecificValueFromTheList("#trDate", "Yesterday");
	//  System.out.println(driver.findElement(ByAngular.options("make as make for make in dropDownLists.makes track by make")).getText());
	// System.out.println(dd.getCountFromTheListUsingNgOptions("make as make for make in dropDownLists.makes track by make"));
//	  driver.findElement(By.xpath("//*[@id='id_openOriginsModal']")).click();
//	  Thread.sleep(3000);
	 
	//  driver.findElement(ByAngular.)
//	  System.out.println(driver.findElement(ByAngular.repeater("region in regionCountries").row(1)));
	  
//	  System.out.println(repeat.selectASpecificValueFromTheColumn("region in regionCountries", "cityName", "Belem, BR"));

//	  WebElement wes = driver.findElement(ByAngular.repeater("region in regionCountries").row(1));
//	  
//	  WebElement wes3 = driver.findElement(ByAngular.repeater("region in regionCountries").column("cityName"));
//	  
//	  List<WebElement> wes1 = repeat.getAllValuesIncludingRowAndColumnInNgRepeat("region in regionCountries");
		
//	  System.out.println(repeat.selectValuesBasedOnRowId("region in regionCountries", 4));
	
//	  List<WebElement>  wes4 = driver.findElements(ByAngular.repeater("region in regionCountries").column("cityName"));
//	  
//	  System.out.println(wes3.getText());
//	  
//	  
//	  for (WebElement option : wes1) {
//	
//		  if (!(option.getText().isEmpty())){
//				 System.out.println(option.getText());
//			
//			 }
//	 }
	
	  
	//  input.setTextValue(modelName, "Toronto");
	  
//	  input.isEnabled(modelName);
//	 System.out.println(checkbox.isEnabled("#frm > div.bui-checkbox.xp__travel-purpose > label"));
//	 System.out.println(checkbox.isDisplayed("#frm > div.bui-checkbox.xp__travel-purpose > label"));
//	 System.out.println(checkbox.isSelected("#frm > div.bui-checkbox.xp__travel-purpose > label"));
//	 checkbox.selectOrDeselectCheckbox("#frm > div.bui-checkbox.xp__travel-purpose > label");
 
 
	 // driver.findElement(By.cssSelector("#id_openOriginsModal")).click();;
	  
	  //String test = driver.findElement(ByAngular.repeater("colIndex in getNumberOfColumns(defaults.columnsByCountryRegion)").column(column)).getText();
	 // System.out.println("*** " +test);;
	  
	  
//	  ByAngular.repeater("foo in f").row(17)
//	  ByAngular.repeater("foo in f").row(17).column("foo.name");
//	  ByAngular.repeater("foo in f").column("foo.name")
	//  System.out.println(modelName+"++++" +input);
//	  input.inputTextModelToSendData(modelName, "Tor");
//	  input.inputTextModelToSelectAutoCompleteValues(modelName);
	//  System.out.println("Output: " +input.inputTextModelToSendData(modelName, "Tor"));
	  
	 
	  /** Text input using ng-model**/
//	  input.setTextValue(modelName, "Toronto");
	  
	  
//	  
//	  /** Get list using ng-options**/
//	 List<WebElement> options1 = elements.getListUsingOptions(listOptions);
//	  
//	 /** Iterate through the values in the dropdown **/
//	 elements.iterateThroughTheList(options1, textToSelect ); 
//	 
//	 /** get the text based on ng-binding using the exact name**/
//	 String var = elements.getTextBasedOnNgBinding(bindingModelName);
	  


//	 
//	 /** get all the based on ng-binding using the partial name**/
//	 List<WebElement> bindingName = elements.getTextBasedOnNgBindingUsingPartialName(bindingPartialModelName); 
//	 
//
//	  for (WebElement option : bindingName) {
//	
//		  if (option.getText().equalsIgnoreCase("Adults (12+)")){
//				 System.out.println(option.getText());
//			
//			 }
//	 }
//	
//	  /** Button **/
//	  driver.findElement(ByAngular.buttonText("Search")).click();;
	  
	// System.out.println(bindingName);
	 

	 
	 
	  
	  
	  
	  
	
	  
	  
	  
	//  call method(modelName,String);
//	  
//	  driver.findElement(ByAngular.model("name")).sendKeys("Test Company");
//	  driver.findElement(ByAngular.model("employees")).sendKeys("1000");
//	  driver.findElement(ByAngular.model("headoffice")).sendKeys("Mysore");
//	  driver.findElement(ByAngular.buttonText("Submit")).click();
	  
	//  Thread.sleep(2000);
	//  String txt = driver.findElement(ByAngular.repeater("company in companies").row(4).column("name")).getText();
	//  System.out.println(txt + " Added.");
	  
//	  if(txt.equalsIgnoreCase("Test Company")){
//	   System.out.println("New Company Added. Now remove it");
//	   driver.findElement(ByAngular.repeater("company in companies").row(4)).findElement(ByAngular.buttonText("Remove")).click();
//	  }

	   Thread.sleep(3000);
	//  driver.quit();
	   
	
	 
	}
}
