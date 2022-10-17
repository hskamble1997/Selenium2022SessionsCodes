package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		
		//JS pop up
		//Alert pop up
		//modal dialog pop up
		
		//1.alert()--> only ok button within pop up
		//2. confirm()-->Only 2 button in pop up
		//3. prompt()--> 1 text field and 1button in this pop up. these are 3 types of pop up in java script
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();//browser -ch
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000);
		
		//pop up is displayed
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		//alert.sendKeys("testing");
		
		//accept the alert
		alert.accept();
		
		//dismiss the alert:
		//alert.dismiss();
		driver.quit();
										

	}

}
