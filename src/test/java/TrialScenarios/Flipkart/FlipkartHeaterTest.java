package TrialScenarios.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import TrialScenarios.GenericUtility.WebDriverUtility;
import TrialScenariosRepository.HomePage;
import TrialScenariosRepository.LoginPage;
import TrialScenariosRepository.ProductPage;
import TrialScenariosRepository.SelectPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartHeaterTest {

	@Test
	public void WinterHeaterTest() throws InterruptedException {
		
		WebDriver driver;
		WebDriverUtility wUtil=new WebDriverUtility();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		wUtil.getWindowMaximise(driver);
		wUtil.waitUntilDOMLoad(driver);
		
		LoginPage lp=new LoginPage(driver);
		lp.LoginBtnClose(driver);
		Reporter.log("login button closed", true);
		
		HomePage hp=new HomePage(driver);
		hp.ProductSearch(driver);
		Reporter.log("Product is searched", true);
		
		SelectPage select=new SelectPage(driver);
		select.clickProduct(driver);
		Reporter.log("Selection of ProductPage appeared", true);

		wUtil.switchToWindow(driver, "SEARCH&ppt=hp&ppn=homepage&ssid=bh9h8csvqo0");
        wUtil.waitUntilDOMLoad(driver);  
		String PRODUCTHEADER=driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
	    System.out.println(PRODUCTHEADER);
		
	    ProductPage product=new ProductPage(driver);
		product.addToCart(driver);
		
        Reporter.log("Product added to cart", true);
		String CARTHEADER=driver.findElement(By.xpath("//a[@class='_2Kn22P gBNbID']")).getText();
        Assert.assertEquals(PRODUCTHEADER, CARTHEADER);
        
        Reporter.log("same Product added to cart", true);
		Thread.sleep(6000);
		driver.close();
	}
}
