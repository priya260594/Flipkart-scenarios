package TrialScenariosRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TrialScenarios.GenericUtility.WebDriverUtility;

public class HomePage extends WebDriverUtility {

	
	@FindBy(xpath="//input[@class='_3704LK']")
	private WebElement SearchBox;
	
	@FindBy(className="_34RNph")
	private WebElement SearchBtn;
	
	@FindBy(className="_2KpZ6l _2U9uOA _3v1-ww")
	private WebElement AddCartBtn;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 
	

	public WebElement getSearchBox() {
		return SearchBox;
	}
	
	public WebElement getSearchBtn() {
		return SearchBtn;
	}
	
	public WebElement getAddCartBtn() {
		return AddCartBtn;
	}
	public void ProductSearch(WebDriver driver) {
		
		SearchBox.sendKeys("Winter Heater");
		SearchBtn.click();
		
	    	}
	public void MobileSearch(WebDriver driver) {
		SearchBox.sendKeys("redmi mobile");
		SearchBtn.click();
	}
}


