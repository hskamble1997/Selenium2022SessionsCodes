package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssignmentDemo {

	public static void main(String[] args) throws Exception {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("edge");
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		brUtil.maximizeWindow();
		
		ElementUtil eleUtil = new ElementUtil(driver);
		By links = By.tagName("a");
		List<WebElement> linksList = eleUtil.getElements(links);
		
		System.out.println(linksList.size());
		
		int count = 1;
		for(WebElement e : linksList) {
			if(count % 2 == 0) {
				System.out.println(e.getAttribute("href")+" : "+count);
				
				driver.navigate().back();
			}
			
			count++;
		}
		
		brUtil.closeBrowser();
	}

}
