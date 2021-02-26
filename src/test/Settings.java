package test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objekti.Humanity;
import objekti.Login;
import objekti.Prva1Strana;
import objekti.ShiftPlaning;




public class Settings {
	
	
	WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}


	@Test (priority=1)

	public void postojeciKorisnik() {
		driver.navigate().to(ShiftPlaning.URL);
		Login.dashboard(driver);
		Prva1Strana.maksimizuj(driver);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String actual = driver.getTitle();
		System.out.println("STVARNI NAZIV JE "+ actual);
		String expected= "Dashboard - Dashboard - Humanity";
		Assert.assertEquals(actual, expected);
	}
	

	@Test (priority=2)
	public void settings() throws InterruptedException, AWTException {
		driver.navigate().to("https://kompanija213.humanity.com/app/admin/settings/");
		ShiftPlaning.settings(driver);
		ShiftPlaning.settingsLanguage(driver);
		
		
		
		ShiftPlaning.skrolDole(driver);
		ShiftPlaning.settingsNotifikacije(driver,ShiftPlaning.SETTINGS_NOTIFIKACIJE1); 
		ShiftPlaning.settingsNotifikacije(driver,ShiftPlaning.SETTINGS_NOTIFIKACIJE2);
		ShiftPlaning.settingsNotifikacije(driver,ShiftPlaning.SETTINGS_NOTIFIKACIJE3);
		ShiftPlaning.settingsNotifikacije(driver,ShiftPlaning.SETTINGS_NOTIFIKACIJE4);
		ShiftPlaning.settingsNotifikacije(driver,ShiftPlaning.SETTINGS_NOTIFIKACIJE5);
		
		
		ShiftPlaning.skrolDole(driver);
		
		ShiftPlaning.settingsNotifikacije(driver,ShiftPlaning.SETTINGS_NOTIFIKACIJE6);
		ShiftPlaning.settingsNotifikacije(driver,ShiftPlaning.SETTINGS_NOTIFIKACIJE7);
		ShiftPlaning.settingsNotifikacije(driver,ShiftPlaning.SETTINGS_NOTIFIKACIJE8);
		ShiftPlaning.settingsNotifikacije(driver,ShiftPlaning.SETTINGS_NOTIFIKACIJE9);
		 
		 ShiftPlaning.skrolDole(driver);
		 
		 ShiftPlaning.settingsNotifikacije(driver,ShiftPlaning.SETTINGS_NOTIFIKACIJE10);
		 ShiftPlaning.settingsNotifikacije(driver,ShiftPlaning.SETTINGS_NOTIFIKACIJE11);
		 ShiftPlaning.settingsNotifikacije(driver,ShiftPlaning.SETTINGS_NOTIFIKACIJE12);
		
		 
		 ShiftPlaning.settingsSave(driver);
		
	}
}
	

