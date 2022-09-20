package TrialScenariosRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import TrialScenarios.GenericUtility.WebDriverUtility;

public class SelectPage extends WebDriverUtility{

	
	public SelectPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickProduct(WebDriver driver) {
		driver.findElement(By.xpath("//div[@data-id='ROHG9R5RWDHK9V2T']")).click();
	}
	public void selectFeature(WebDriver driver) {
		List<WebElement> products=driver.findElements(By.xpath("//li[contains(text(),'4 GB RAM')]/../../../div[1]"));
		for(WebElement ele:products) {
			System.out.println(ele.getText());
		}
	}


	
	
	
}
