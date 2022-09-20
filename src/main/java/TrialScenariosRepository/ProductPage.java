package TrialScenariosRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TrialScenarios.GenericUtility.WebDriverUtility;

public class ProductPage extends WebDriverUtility{

	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement CartButtonClicked;
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getCartButtonClicked() {
		return CartButtonClicked;
	}
	public void addToCart(WebDriver driver) {
		scrollby(driver);
		CartButtonClicked.click();
				
	}
}

