package TrialScenarios.Flipkart;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import TrialScenarios.GenericUtility.WebDriverUtility;
import TrialScenariosRepository.HomePage;
import TrialScenariosRepository.LoginPage;
import TrialScenariosRepository.SelectPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RedmiMoble4GBTest {

	@Test
	public void redmiMobileTest() {
		WebDriver driver;
		WebDriverUtility wUtil=new WebDriverUtility();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		wUtil.getWindowMaximise(driver);
		wUtil.waitUntilDOMLoad(driver);
		
		LoginPage lp=new LoginPage(driver);
		lp.LoginBtnClose(driver);
		Reporter.log("login button closed", true);
		
		HomePage hp=new HomePage(driver);
		hp.MobileSearch(driver);
		Reporter.log("mobile is searched", true);
		
		SelectPage select=new SelectPage(driver);
		select.selectFeature(driver);
		
		Reporter.log("products are printed", true);
		
		
		
	}
	
}
