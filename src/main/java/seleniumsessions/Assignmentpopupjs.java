package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assignmentpopupjs {

	public static void main(String[] args) throws Exception {
		
		BrowserUtil bUtil = new BrowserUtil();
		WebDriver driver = bUtil.launchBrowser("edge");
		bUtil.launchUrl("https://the-internet.herokuapp.com/");
		bUtil.maximizeWindow();
		
		By jsAlertsLink = By.linkText("JavaScript Alerts");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doClick(jsAlertsLink);
		
		Thread.sleep(3000);
		
		By jsAlertButton = By.xpath("//button[text()='Click for JS Alert']");
		By jsConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
		By jsprompButton = By.xpath("//button[text()='Click for JS Prompt']");
		
		
//		eleUtil.doClick(jsAlertButton);
//		
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		Thread.sleep(3000);
//		
//		alert.accept();
		
//		eleUtil.doClick(jsConfirmButton);
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		Thread.sleep(3000);
//		
//		alert.dismiss();
		
		eleUtil.doClick(jsprompButton);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		
		alert.sendKeys("admin");
		
		Thread.sleep(5000);
		alert.accept();
		
		Thread.sleep(3000);
		
		
		
		
		bUtil.closeBrowser();
	}
	
}
