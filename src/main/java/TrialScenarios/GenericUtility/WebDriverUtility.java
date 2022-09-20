package TrialScenarios.GenericUtility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility {

	public void getWindowMaximise(WebDriver driver) {
		driver.manage().window().maximize();
		}
	public void waitUntilDOMLoad(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void switchToWindow(WebDriver driver,String partialTitle) {
		Set<String> winIds=driver.getWindowHandles();
		Iterator<String> it=winIds.iterator();
		while(it.hasNext()) {
			String winId=it.next();
			String currentTitle=driver.switchTo().window(winId).getTitle();
			if(currentTitle.contains(partialTitle)) {
				break;
			}
					
		}
	}
	public void rightClickOn(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	public void scrollby(WebDriver driver) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", " ");
	}
	public void scrollbyElement(WebDriver driver,WebElement element) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		int y=element.getLocation().getY();
		jse.executeScript("window.scrollBy(0,"+y+")", element);
	}
	public void scrollToInitial(WebDriver driver) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,0)", " ");
	}
	
}
