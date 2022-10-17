package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	private WebDriver driver;

	/**
	 * this method is used to initialize the driver on the basis of browser name
	 * 
	 * @param browser
	 * @throws Exception 
	 */
	public WebDriver launchBrowser(String browser) throws Exception {
		System.out.println("browser name is : " + browser);

		switch (browser.toLowerCase()) {
		case "chrome":
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harshal.Kamble\\Downloads\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Harshal.Kamble\\Downloads\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "edge":
			//System.setProperty("webdriver.edge.driver", "C:\\Users\\Harshal.Kamble\\Downloads\\msedgedriver.exe");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("plz pass the right browser.....");
			throw new Exception("WRONGBROWSER");
			//break;
		}
		
		return driver;
	}

	public void launchUrl(URL url) throws Exception {
		String newURL = String.valueOf(url);
		if (newURL == null) {
			System.out.println("url is null");
			throw new Exception("URLISNULL");
		}

		if (newURL.length() == 0) {
			System.out.println("url is blank");
			throw new Exception("URLBLANKEXCEPTION");
		}

		// http(s) -- homework
		if(newURL.indexOf("http")!=0 && newURL.indexOf("https")!=0) {
			System.out.println("http(s) is missing in url");
			throw new Exception("HTTP(s)MISSINGEXCEPTION");
		}

		driver.navigate().to(url);
	}

	
	public void launchUrl(String url) throws Exception {
		if (url == null) {
			System.out.println("url is null");
			throw new Exception("URLISNULL");
		}

		if (url.length() == 0) {
			System.out.println("url is blank");
			throw new Exception("URLBLANKEXCEPTION");
		}

		// http(s) -- homework
		if(url.indexOf("http") !=0 && url.indexOf("https") !=0) {
			System.out.println("http(s) is missing in url");
			throw new Exception("HTTP(s)MISSINGEXCEPTION");
		}

		driver.get(url);
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		if (title != null) {
			return title;
		} else {
			System.out.println("getting null title....");
			return null;
		}
	}

	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("page url : " + url);
		if (url != null) {
			return url;
		} else {
			System.out.println("getting null url....");
			return null;
		}
	}
	
	public void maximizeWindow() {
		if(driver != null) {
			driver.manage().window().maximize();
		}
	}

	public void minimizeWindow() {
		if(driver != null) {
			driver.manage().window().minimize();
		}
	}
	
	public void closeBrowser() {
		if (driver != null) {
			driver.close();
			System.out.println("browser is closed.....");
		}
	}

	public void quitBrowser() {
		if (driver != null) {
			driver.quit();
			System.out.println("browser is closed.....");

		}
	}
}
