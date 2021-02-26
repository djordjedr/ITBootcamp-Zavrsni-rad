package objekti;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShiftPlaning {
	
	

	public static final String URL="https://prkiprvicevic8.humanity.com/app/schedule/employee/week/overview/overview/23%2c1%2c2021/";
	private static final String LETSGO_URL="//*[@id=\"walkme-balloon-462027\"]/div/div[1]/div[2]/div/div[2]/div/a";
	private static final String NO_THANKS="//*[@id=\"walkme-balloon-1035800\"]/div/div[1]/div[2]/div/div[2]/div/div[1]/a";
	
	
	public static final String REPORTS="//*[text()='Reports']";	
	public static final String DASHBOARD="//*[@id=\"sn_dashboard\"]/span";
	public static final String SHIFT_PLANING="//*[@id=\"sn_schedule\"]/span";
	public static final String TIMECLOCK="//*[@id=\"sn_timeclock\"]/span";
	public static final String LEAVE="//*[@id=\"sn_requests\"]/span/i";
	public static final String TRANING="//*[@id=\"sn_training\"]/span";
	public static final String STAFF="//*[@id=\"sn_staff\"]/span";
	public static final String AVAILIBILITY="//*[text()='Availability']";
	private static final String PAYROLL_SPAM="//*[@id=\"walkme-balloon-456078\"]/div/div[1]/div[2]/div/div[1]";
	public static final String PAYROLL="//*[@id=\"sn_payroll\"]";
	
	private static final String SETTINGS="//*[@id=\"sn_admin\"]/span";
	private static final String SETTINGS_SPAM="//*[@id=\"walkme-balloon-360256\"]/div/div[1]/div[2]/div/div[1]";	//go to shift planing
	
	
	//private static final String SETTINGS_SPAM2="//*[text()='intercom-anchor intercom-1tdusvr e12dv51w1']\"; 				//	chat bot	"
	
		
	private static final String SETTINGS_SPAM3="/html/body/div[12]/div/div[1]/div[2]/div/div[2]/div/a";				//lets go
	private static final String SETTINGS_SPAM4="//*[@id=\"walkme-balloon-1035800\"]/div/div[1]/div[2]/div/div[2]/div/div[1]/a/span";
	
	//public static final String SETTINGS_NOTIFIKACIJE1="//*[@id=\"pref_pref_email\"]";
	
	private static final String SETTINGS_LANGUAGE="//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	

	public static final String SETTINGS_NOTIFIKACIJE1="//*[@id=\"pref_pref_email\"]";
	public static final String SETTINGS_NOTIFIKACIJE2="//*[@id=\"pref_pref_mobile_push\"]";
	public static final String SETTINGS_NOTIFIKACIJE3="//*[@id=\"pref_pref_sms\"]";
	public static final String SETTINGS_NOTIFIKACIJE4="//*[@id=\"pref_pref_training\"]";
	public static final String SETTINGS_NOTIFIKACIJE5="//*[@id=\"pref_pref_reports\"]";
	public static final String SETTINGS_NOTIFIKACIJE6="//*[@id=\"pref_pref_edit_profile\"]";

	public static final String SETTINGS_NOTIFIKACIJE7="//*[@id=\"pref_pref_visible_staff\"]";
	public static final String SETTINGS_NOTIFIKACIJE8="//*[@id=\"pref_pref_visible_staff_details\"]";
	public static final String SETTINGS_NOTIFIKACIJE9="//*[@id=\"pref_pref_on_now\"]";
	public static final String SETTINGS_NOTIFIKACIJE10="//*[@id=\"pref_pref_message_wall_on\"]";
	public static final String SETTINGS_NOTIFIKACIJE11="//*[@id=\"pref_pref_message_wall_comments\"]";
	public static final String SETTINGS_NOTIFIKACIJE12="//*[@id=\"pref_pref_messaging_module\"]";

	
	private static final String SETTINGS_SAVE="//*[@id=\"_save_settings_button\"]";
	
	//za sutra
	
	private static final String ADDEMPLOYEE="//*[@id=\"e_empty\"]/button";
	private static final String ADDEMPLOYEE_FNAME="//*[@id=\"fname_2\"]";
	private static final String ADDEMPLOYEE_LNAME="//*[@id=\"lname_2\"]";
	
	private static final String ADDEMPLOYEE_2_FNAME="//*[@id=\"fname_3\"]";
	private static final String ADDEMPLOYEE_2_LNAME="//*[@id=\"lname_3\"]";
	private static final String ADDEMPLOYEE_2_POSITION="//*[@id=\"positions_3-selectized\"]";
	
	
	private static final String ADDEMPLOYEE_3_FNAME="//*[@id=\"fname_4\"]";
	private static final String ADDEMPLOYEE_3_LNAME="//*[@id=\"lname_4\"]";
	private static final String ADDEMPLOYEE_3_POSITION="//*[@id=\"positions_4-selectized\"]";
	
	
	private static final String ADDEMPLOYEE_4_FNAME="//*[@id=\"fname_5\"]";
	private static final String ADDEMPLOYEE_4_LNAME="//*[@id=\"lname_5\"]";
	private static final String ADDEMPLOYEE_4_POSITION="//*[@id=\"_ns_row_5\"]/td[3]/div/div[1]";
	
	private static final String ADDEMPLOYEE_5_FNAME="//*[@id=\"fname_6\"]";
	private static final String ADDEMPLOYEE_5_LNAME="//*[@id=\"lname_6\"]";
	private static final String ADDEMPLOYEE_5_POSITION="//*[@id=\"_ns_row_6\"]/td[3]/div/div[1]";
	
	
	private static final String ADDEMPLOYEE_CONTINUE="//*[@id=\"add_employee_btn\"]";
	private static final String ADDEMPLOYEE_POSITION="//*[@id=\"positions_2-selectized\"]";
	private static final String EMPLOYEE="//*[text()='Prki Prvicevic']";			//BINGO!!
	private static final String EMPLOYEE_SPAM="//*[@id=\"walkme-balloon-462027\"]/div/div[1]/div[2]/div/div[2]/div/a";
	private static final String EMPLOYEE_EDIT="//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	private static final String EMPLOYEE_PRKILI="//*[@id=\"first_name\"]";
	private static final String EMPLOYEE_SAVE="//*[@id=\"act_primary\"]";
	//private static final String EMPLOYEE_UPLOADPICTURE="//*[@id=\"in-btn\"]/span";

	//private static final String EMPLOYEE_SPAM="//*[@id="in-btn"]/span";
	public static void settings (WebDriver driver) {
		WebElement ae= driver.findElement(By.xpath(SETTINGS));
		ae.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	
	
		
		/*
		 InputEvent.BUTTON1_DOWN_MASK :  For mouse left -click
InputEvent.BUTTON2_DOWN_MASK  : For mouse middle button click
InputEvent.BUTTON3_DOWN_MASK : For mouse right-click
InputEvent.BUTTON1_MASK
InputEvent.BUTTON2_MASK
InputEvent.BUTTON3_MASK
		 
		Robot robot;											//kontrolisanje misa
	
		robot = new Robot();
		
		int x=1306;
		int y=533;
		robot.mouseMove(x,y); 
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
		 robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		//(974, 533)
*/

	
	//////////////////////
	public static void settingsNotifikacije (WebDriver driver, String SetingsNotifikacije) throws InterruptedException{
		Thread.sleep(1000);
		WebElement ae= driver.findElement(By.xpath(SetingsNotifikacije));
		ae.click();
			}
	/////////////////////
public static void skrolDole (WebDriver driver) throws InterruptedException{
		 JavascriptExecutor js = (JavascriptExecutor) driver;						//skrolovanje u browseru
		 js.executeScript("window.scrollBy(0,350)", "");
		 Thread.sleep(1000);
	}
	
	public static void settingsSave (WebDriver driver) throws InterruptedException{
		Thread.sleep(1000);
		WebElement ae= driver.findElement(By.xpath(SETTINGS_SAVE));
		ae.click();
	}

	
	public static void settingsSpam (WebDriver driver) throws InterruptedException{
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement ae= driver.findElement(By.xpath(SETTINGS_SPAM));
		ae.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		
	}
	
	public static void settingsSpam2 (WebDriver driver) {
		try {
			Thread.sleep(7000);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			driver.switchTo().frame("allowfullscreen");
			WebElement ae= driver.findElement(By.className("intercom-launcher-frame intercom-my0cau e1ur5zlj0"));
			ae.click();
			ae.click();
			driver.switchTo().defaultContent();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void settingsSpam3 (WebDriver driver)  {
		try {
			Thread.sleep(7000);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			WebElement ae= driver.findElement(By.xpath(SETTINGS_SPAM3));
			ae.click();
			ae.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void settingsSpam4 (WebDriver driver) throws InterruptedException {
		Thread.sleep(7000); 
		WebElement ae= driver.findElement(By.xpath(SETTINGS_SPAM4));
		ae.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	public static void settingsLanguage (WebDriver driver) throws InterruptedException {
		Thread.sleep(7000); 
		WebElement ae= driver.findElement(By.xpath(SETTINGS_LANGUAGE));
		ae.click();
		ae.sendKeys(Keys.ARROW_DOWN);		
		ae.sendKeys(Keys.ARROW_DOWN);
		ae.sendKeys(Keys.ARROW_DOWN);
		ae.sendKeys(Keys.ARROW_DOWN);	
		ae.sendKeys(Keys.ARROW_DOWN);
		ae.sendKeys(Keys.ARROW_DOWN);
		ae.sendKeys(Keys.ARROW_DOWN);
		ae.sendKeys(Keys.ENTER);
		Thread.sleep(1000); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	public static void payrollSpam (WebDriver driver) {
		WebElement ae= driver.findElement(By.xpath(PAYROLL_SPAM));
		ae.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
public static void click (WebDriver driver) {
		WebElement ae= driver.findElement(By.xpath(LETSGO_URL));
		ae.click();
	}

//////////////////////////////
public static void prozori (WebDriver driver, String prozor) {
	WebElement ae= driver.findElement(By.xpath(prozor));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	ae.click();
}
///////////////////////////////

public static void reports (WebDriver driver) {
	WebElement ae= driver.findElement(By.xpath(REPORTS));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	ae.click();
}



public static void spam (WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	WebElement be= driver.findElement(By.xpath(NO_THANKS));
	be.click();
}

public static void addEmployee (WebDriver driver) throws InterruptedException {
	Thread.sleep(2000);
	WebElement be= driver.findElement(By.xpath(ADDEMPLOYEE));
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	be.click();
}

public static void employeeFName (WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	WebElement be= driver.findElement(By.xpath(ADDEMPLOYEE_FNAME));
	be.click();
	be.sendKeys("Neko");
}

public static void employeeLName (WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	WebElement be= driver.findElement(By.xpath(ADDEMPLOYEE_LNAME));
	be.click();
	be.sendKeys("Nekic");
}



public static void prviZaposleni(WebDriver driver,String ime1, String prezime1) throws InterruptedException {
	WebElement we= driver.findElement(By.xpath(ADDEMPLOYEE_FNAME));
	we.click();
	we.sendKeys(ime1);
	Thread.sleep(2000);
	WebElement be= driver.findElement(By.xpath(ADDEMPLOYEE_LNAME));
	be.click();
	be.sendKeys(prezime1);

	WebElement ae= driver.findElement(By.xpath(ADDEMPLOYEE_POSITION));
	ae.click();
	ae.sendKeys(Keys.ARROW_DOWN);		//if it works, dont fix it
	ae.sendKeys(Keys.ARROW_DOWN);
	ae.sendKeys(Keys.ARROW_DOWN);
	ae.sendKeys(Keys.ARROW_DOWN);
	ae.sendKeys(Keys.ENTER);
	}

public static void drugiZaposleni(WebDriver driver,String ime1, String prezime1) throws InterruptedException {
	WebElement we= driver.findElement(By.xpath(ADDEMPLOYEE_2_FNAME));
	we.click();
	we.sendKeys(ime1);
	Thread.sleep(2000);
	WebElement be= driver.findElement(By.xpath(ADDEMPLOYEE_2_LNAME));
	be.click();
	be.sendKeys(prezime1);
	WebElement ae= driver.findElement(By.xpath(ADDEMPLOYEE_2_POSITION));
	ae.click();
	ae.sendKeys(Keys.ARROW_DOWN);		//if it works, dont fix it
	ae.sendKeys(Keys.ARROW_DOWN);
	ae.sendKeys(Keys.ENTER);
	
	}

public static void treciZaposleni(WebDriver driver,String ime1, String prezime1) throws InterruptedException {
	WebElement we= driver.findElement(By.xpath(ADDEMPLOYEE_3_FNAME));
	we.click();
	we.sendKeys(ime1);
	Thread.sleep(2000);
	WebElement be= driver.findElement(By.xpath(ADDEMPLOYEE_3_LNAME));
	be.click();
	be.sendKeys(prezime1);
	WebElement ae= driver.findElement(By.xpath(ADDEMPLOYEE_3_POSITION));
	ae.click();
	ae.sendKeys(Keys.ARROW_DOWN);		
	ae.sendKeys(Keys.ENTER);
	
	}
public static void cetvrtiZaposleni(WebDriver driver,String ime1, String prezime1) throws InterruptedException {
	WebElement we= driver.findElement(By.xpath(ADDEMPLOYEE_4_FNAME));
	we.click();
	we.sendKeys(ime1);
	Thread.sleep(2000);
	WebElement be= driver.findElement(By.xpath(ADDEMPLOYEE_4_LNAME));
	be.click();
	be.sendKeys(prezime1);
	WebElement ae= driver.findElement(By.xpath(ADDEMPLOYEE_4_POSITION));
	//Sta ovde ne radi?
	ae.click();
	ae.sendKeys(Keys.ARROW_DOWN);		//if it works, dont fix it
	ae.sendKeys(Keys.ARROW_DOWN);
	ae.sendKeys(Keys.ARROW_DOWN);
	ae.sendKeys(Keys.ARROW_DOWN);
	ae.sendKeys(Keys.ENTER);
	
	}

public static void petiZaposleni(WebDriver driver,String ime1, String prezime1) throws InterruptedException {
	WebElement we= driver.findElement(By.xpath(ADDEMPLOYEE_5_FNAME));
	we.click();
	we.sendKeys(ime1);
	Thread.sleep(2000);
	WebElement be= driver.findElement(By.xpath(ADDEMPLOYEE_5_LNAME));
	be.click();
	be.sendKeys(prezime1);
	WebElement ae= driver.findElement(By.xpath(ADDEMPLOYEE_5_POSITION));
	ae.click();
	Thread.sleep(2000);
	ae.click();
	ae.sendKeys(Keys.ARROW_DOWN);		//if it works, dont fix it
	ae.sendKeys(Keys.ARROW_DOWN);
	ae.sendKeys(Keys.ARROW_DOWN);
	ae.sendKeys(Keys.ARROW_DOWN);
	ae.sendKeys(Keys.ENTER);
	
	}
public static void employeePosition (WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	WebElement ae= driver.findElement(By.xpath(ADDEMPLOYEE_POSITION));
	ae.click();
	ae.sendKeys(Keys.ARROW_DOWN);		//if it works, dont fix it
	ae.sendKeys(Keys.ARROW_DOWN);
	ae.sendKeys(Keys.ARROW_DOWN);
	ae.sendKeys(Keys.ARROW_DOWN);
	ae.sendKeys(Keys.ENTER);
	
}

public static void employeeContinue (WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	WebElement be= driver.findElement(By.xpath(ADDEMPLOYEE_CONTINUE));
	be.click();
}

public static void employee (WebDriver driver) {
	WebElement be;
			driver.findElement(By.xpath(EMPLOYEE)).click();
}

public static void employeeSpam (WebDriver driver) {
	WebElement be;
		driver.findElement(By.xpath(EMPLOYEE_SPAM)).click();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS) ;
}


public static void employeeEdit (WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	WebElement be= driver.findElement(By.xpath(EMPLOYEE_EDIT));
	be.click();
}

public static void employeeNovoIme (WebDriver driver) throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	WebElement be= driver.findElement(By.xpath(EMPLOYEE_PRKILI));
	be.click();
	Thread.sleep(2000);
	be.clear();				//Sve obrise
	Thread.sleep(2000);
	be.sendKeys("lindalina");
}
	public static void employeeSave (WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		WebElement be= driver.findElement(By.xpath(EMPLOYEE_SAVE));
		be.click();
	}

}
