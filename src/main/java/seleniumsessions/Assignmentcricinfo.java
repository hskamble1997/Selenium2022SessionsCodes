package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmentcricinfo {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/asia-cup-2022-1327237/afghanistan-vs-pakistan-10th-match-super-four-1327278/full-scorecard");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		System.out.println(getWckInfo("Babar Azam"));
		

	}
	
	public static ArrayList<String> getWckInfo(String playerName){
		
		String xpath = "//table[contains(@class,'ci-scorecard')]//span[text()='"+playerName+"']/ancestor::td/following-sibling::td";
		ArrayList<String> al = new ArrayList<String>();
		
		List<WebElement> scoreList = driver.findElements(By.xpath(xpath));
		for(WebElement e : scoreList) {
			String text = e.getText();
			if(text.length()!=0) {
				al.add(text);
			}
			
		}
		
		return al;
	}

}
