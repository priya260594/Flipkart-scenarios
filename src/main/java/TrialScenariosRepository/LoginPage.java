package TrialScenariosRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//button[.='✕']")
	private WebElement LoginBtnClose;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLoginBtnClose() {
		return LoginBtnClose;
	}
	public void LoginBtnClose(WebDriver driver) {
		LoginBtnClose.click();
	}
	
}
