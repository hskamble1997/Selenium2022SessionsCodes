package seleniumsessions;

public class MaximizeFullScreen {

	public static void main(String[] args) throws Exception {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
//		driver.get("www.google.com");

		BrowserUtil brUtil = new BrowserUtil();
		brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://www.google.com");
		
		//ChromeOptions co = new ChromeOptions();
		
	}

}
