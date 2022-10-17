package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class QuitVsCloseSessionId {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Harshal.Kamble\\Downloads\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("page title : "+title);
		
		//close the browser
		//driver.quit();//123
		driver.close();
		
		//System.out.println(driver.getTitle());//123
		
		driver = new EdgeDriver();//launch edge driver and assign new session id to driver var
		driver.get("https://www.google.com");//456;
		System.out.println(driver.getTitle());//456
		//NoSuchSessionException: Session ID is null. Using webdriver after calling quit?
		driver.quit();
	}

}
