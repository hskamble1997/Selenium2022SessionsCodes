package seleniumsessions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementSectionLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//		List<WebElement> sectionsLinks = driver.findElements(By.className("list-group-item"));
		//
//				System.out.println(sectionsLinks.size());
		//
//				for (WebElement e : sectionsLinks) {
//					System.out.println(e.getText());
//				}
				
		By rightSecsLinks = By.className("list-group-item");
		ElementUtil eleUtil = new ElementUtil(driver);
		ArrayList<String> textList = eleUtil.getElementsTextList(rightSecsLinks);
		System.out.println(textList);
		if(textList.contains("Order History")) {
			System.out.println("PASS");
		}
		
		
		

	}

}
