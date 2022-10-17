package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentPrac {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println(rowCount);
		
		int colCount = driver.findElements(By.cssSelector("table#customers th")).size();
		System.out.println(colCount);
		
		//table[@id="customers"]/tbody/tr[5]/td[1]
		//table[@id="customers"]/tbody/tr[2]/td[3]
		
		String befXpath = "//table[@id=\"customers\"]/tbody/tr[";
		String midXpath = "]/td[";
		String aftXpath = "]";
		
		for(int i=2; i<=rowCount; i++) {
			for(int j=1; j<=colCount;j++) {
				String mainXpath = befXpath +i +midXpath+j+aftXpath;
				System.out.print(driver.findElement(By.xpath(mainXpath)).getText()+" ");
			}
			System.out.println();
		}
		
		
		driver.quit();
		
	}
	
			
	
}
