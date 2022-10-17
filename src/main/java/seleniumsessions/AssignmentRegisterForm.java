package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssignmentRegisterForm {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {

		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//Id
		By fname = By.id("input-firstname");
		By lname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		//name
		By nfname = By.name("firstname");
		By nlname = By.name("lastname");
		By nemail = By.name("email");
		By ntelephone = By.name("telephone");
		By npassword = By.name("password");
		By nconfirmPassword = By.name("confirm");
		
		//xpath
		By xname = By.xpath("//*[@id=\"input-firstname\"]");
		By xlname = By.xpath("//*[@id=\"input-lastname\"]");
		By xemail = By.xpath("//*[@id=\"input-email\"]");
		By xtelephone = By.xpath("//*[@id=\"input-telephone\"]");
		By xpassword = By.xpath("//*[@id=\"input-password\"]");
		By xconfirmPassword = By.xpath("//*[@id=\"input-confirm\"]");
		
		//css selector
		By csname = By.cssSelector("#input-firstname");
		By cslname = By.cssSelector("#input-lastname");
		By csemail = By.cssSelector("#input-email");
		By cstelephone = By.cssSelector("#input-telephone");
		By cspassword = By.cssSelector("#input-password");
		By csconfirmPassword = By.cssSelector("#input-confirm");
		
		
		
		//classname
//		By cfname = By.className("form-control");
//		By clname = By.className("lastname");
//		By cemail = By.className("email");
//		By ctelephone = By.className("telephone");
//		By cpassword = By.className("password");
//		By cconfirmPassword = By.className("confirm");
		
		
		
		//1.
//		driver.findElement(By.id("input-firstname")).sendKeys("dsdf");
//		driver.findElement(By.id("input-lastname")).sendKeys("reno");
//		driver.findElement(By.id("input-email")).sendKeys("reno@gmail.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
//		driver.findElement(By.id("input-password")).sendKeys("ds12df");
//		driver.findElement(By.id("input-confirm")).sendKeys("ds12df");
		
		//2.
//		WebElement finame = driver.findElement(By.id("input-firstname"));
//		finame.sendKeys("dsdf");
//		WebElement lastname = driver.findElement(By.id("input-lastname"));
//		lastname.sendKeys("reno");
//		WebElement emailf = driver.findElement(By.id("input-email"));
//		emailf.sendKeys("reno@gmail.com");
//		WebElement tel = driver.findElement(By.id("input-telephone"));
//		tel.sendKeys("1234567890");
//		WebElement pwd = driver.findElement(By.id("input-password"));
//		pwd.sendKeys("ds12df");
//		WebElement cpwd = driver.findElement(By.id("input-confirm"));
//		cpwd.sendKeys("ds12df");
		
//		doSendKeys(nfname,"robin");
//		doSendKeys(nlname,"thomas");
//		doSendKeys(nemail,"rbin@gmail.com");
//		doSendKeys(ntelephone,"9876543210");
//		doSendKeys(npassword,"robin123");
//		doSendKeys(nconfirmPassword,"robin123");
//		
//		Thread.sleep(4000);
		
		By loginLnk = By.linkText("Login");
		By registerLnk = By.linkText("Register");
		By forgotpwdLnk = By.linkText("Forgotten Password");
		By myacctLnk = By.linkText("My Account");
		By addrBookLnk = By.linkText("Address Book");
		By wishListLnk = By.partialLinkText("List");
		By ordhistLnk = By.linkText("Order History");
		By dwnldLnk = By.linkText("Downloads");
		
		By contiButton = By.className("btn-primary");
		By warnMesg = By.className("alert-danger");
		By fnameWarMesg = By.xpath("//*[@id=\"account\"]/div[2]/div/div");
		By lnameWarMesg = By.cssSelector("#account > div:nth-child(4) > div > div");
		By emailWarMwsg = By.cssSelector("#account > div:nth-child(5) > div > div");
		By pwdWarMesg = By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[1]/div/div");
		
//		doClick(loginLnk);
//		navigateBack();
//		Thread.sleep(2000);
////		doClick(registerLnk);
////		navigateBack();
////		Thread.sleep(2000);
//		doClick(forgotpwdLnk);
//		navigateBack();
//		Thread.sleep(2000);
//		doClick(myacctLnk);
//		navigateBack();
//		Thread.sleep(2000);
//		doClick(addrBookLnk);
//		navigateBack();
//		Thread.sleep(2000);
//		doClick(wishListLnk);
//		navigateBack();
//		Thread.sleep(2000);
//		doClick(ordhistLnk);
//		navigateBack();
//		Thread.sleep(2000);
//		doClick(dwnldLnk);
//		Thread.sleep(2000);
//		navigateBack();
		
//		doClick(contiButton);
//		String warMesg = doGetText(warnMesg);
//		
//		System.out.println(warMesg);
//
//		String fnMesg = doGetText(fnameWarMesg);
//
//		System.out.println(fnMesg);
//		
//		String lnMesg = doGetText(lnameWarMesg);
//
//		System.out.println(lnMesg);
//
//		String emlMesg = doGetText(emailWarMwsg);
//
//		System.out.println(emlMesg);
//
//		String pwdMesg = doGetText(pwdWarMesg);
//
//		System.out.println(pwdMesg);
		
//		String tel = doGetAttribute(telephone,"placeholder");
//		System.out.println(tel);
//		
//		String ped = doGetAttribute(password,"id");
//		System.out.println(ped);
		
		doSendKeys(fname,"Rocky");
		String myName = doGetAttribute(fname,"value");
		System.out.println(myName);
		
		doSendKeys(nemail,"jevean@yopmail.com");
		String nemailtext = doGetAttribute(nemail,"value");
		System.out.println(nemailtext);
		
		brUtil.closeBrowser();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void navigateBack() {
		driver.navigate().back();
	}

	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public static String doGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public static boolean doELeIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
}
