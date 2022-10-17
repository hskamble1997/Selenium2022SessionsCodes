package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssignmentCountryArraylist {

	static ElementUtil eleUtil;
	static By country;
	public static void main(String[] args) throws Exception {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		brUtil.maximizeWindow();
		
		country = By.id("Form_getForm_Country");
		eleUtil = new ElementUtil(driver);
		
		System.out.println(getDropDownOptionsText(country));
	}
	
	public static ArrayList<String> getDropDownOptionsText(By locator) {
		List<WebElement> wbl = eleUtil.getDropDownOptions(locator);
		ArrayList<String> al = new ArrayList<String>();
		
		for(WebElement e : wbl) {
			String text = e.getText();
			al.add(text);
		}
		
		return al;
	}
		
}


