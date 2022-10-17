package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// Open bowser : chrome
		// launch url : google.com
		// get the title
		// verify the title : act vs exp
		//close the browser
		
		//download chromedriver.exe file - configure it
		
		//automation steps:
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harshal.Kamble\\Downloads\\chromedriver.exe");//configure chromedriver.exe and start the server
		WebDriver driver = new ChromeDriver();//launch the chrome browser and assign 1 session is to the driver reference
		driver.get("https://www.google.com");//enter url
		
		String title = driver.getTitle();//get the title
		System.out.println("Page title : "+title);
		
		//verification point: act vs exp result //checkpoint
		if(title.equals("Google")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String source = driver.getPageSource();
		//System.out.println(source);
		if(source.contains("Copyright The Closure Library Authors")) {
			System.out.println("Pass");
		}
		
		//close the browser
		driver.quit();
		//driver.close();
	}

}
