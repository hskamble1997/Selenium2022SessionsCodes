package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {
	
	static WebDriver driver;

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
//		WebDriver driver = new ChromeDriver();// launch chrome browser

//		System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Downloads/geckodriver");
//		WebDriver driver = new FirefoxDriver();

		// WebDriver driver = new SafariDriver();

		// cross browser logic:

		String browser = "edge";
		
		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harshal.Kamble\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Harshal.Kamble\\Downloads\\firfoxdriver.exe");
			driver = new FirefoxDriver();
			break;

		case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Harshal.Kamble\\Downloads\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
			
		default:
			System.out.println("plz pass the right browser.....");
			break;
		}

		driver.get("https://www.google.com");
		String title = driver.getTitle();// get the title
		System.out.println("page title : " + title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

		// close the browser:
		driver.quit();

	}

}
