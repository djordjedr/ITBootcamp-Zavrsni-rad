package test;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objekti.Humanity;
import objekti.Login;
import objekti.Prva1Strana;
import objekti.ShiftPlaning;

public class PrviTest {
	
private static final String REPORTS = null;
private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test (priority=1)
	
	public void test1RegBtn() {
		driver.navigate().to(Prva1Strana.URL);
		Prva1Strana.zatvoriCookies(driver);
		Prva1Strana.maksimizuj(driver);
		Prva1Strana.unesi1Ime(driver);
		Prva1Strana.unesi1Email(driver);
		Prva1Strana.klikni1Dugme(driver);
	//Druga strana
		Humanity.kompanija(driver);
		Humanity.industrija(driver);
		Humanity.role(driver);
		Humanity.phone(driver);
		Humanity.password(driver);
		Humanity.confPassword(driver);
		Humanity.submit(driver);
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ShiftPlaning.click(driver);
		
		String actual = driver.getTitle();
		//System.out.println("STVARNI NAZIV JE "+ actual);
		String expected= "ShiftPlanning - Humanity";
		Assert.assertEquals(actual, expected);
		
		
	}
	/*
	@Test (priority=2)
	
	public void test2RegBtn() {
		driver.navigate().to(Prva1Strana.URL);
		
		Prva1Strana.klikni2Dugme(driver);
		Prva1Strana.unesi2Ime(driver);
		Prva1Strana.unesi2Email(driver);
		Prva1Strana.klikni2submit(driver);
		//Druga strana
				Humanity.kompanija(driver);
				Humanity.industrija(driver);
				Humanity.role(driver);
				Humanity.phone(driver);
				Humanity.password(driver);
				Humanity.confPassword(driver);
				Humanity.submit(driver);
				
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				ShiftPlaning.click(driver);
				
				String actual = driver.getTitle();
				//System.out.println("STVARNI NAZIV JE "+ actual);
				String expected= "ShiftPlanning - Humanity";
				Assert.assertEquals(actual, expected);
	}

	

@Test (priority=3)
	
	public void test3RegBtn() {
		driver.navigate().to(Prva1Strana.URL);
		
		Prva1Strana.about(driver);
		Prva1Strana.aboutus(driver);
		
	
		//screenshot
		try {
			Prva1Strana.takeSnapShot(driver, "c://bootcampVezbanje//test.png") ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String actual = driver.getCurrentUrl();
		String expected= "https://www.humanity.com/about";
		Assert.assertEquals(actual, expected);
		
	}
	*/
	
	
@Test (priority=5)
/////////////////////////////
public void postojeciKorisnik() throws AWTException {


	driver.navigate().to(ShiftPlaning.URL);
	Login.logout(driver);
	driver.navigate().to(ShiftPlaning.URL);
	Login.dashboard(driver);
	Prva1Strana.maksimizuj(driver);
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	String actual = driver.getTitle();
	System.out.println("STVARNI NAZIV JE "+ actual);
	String expected= "Dashboard - Dashboard - Humanity";
	Assert.assertEquals(actual, expected);
}


@Test (priority=6)

public void dashboard() throws InterruptedException {
	driver.navigate().to(ShiftPlaning.URL);
	
	ShiftPlaning.prozori(driver, ShiftPlaning.DASHBOARD);
	
	String actual = driver.getTitle();
	String expected= "Dashboard - Dashboard - Humanity";
	Assert.assertEquals(actual, expected);
	Thread.sleep(3000);
}

@Test (priority=7)

public void shiftPlaning() throws InterruptedException {
	driver.navigate().to(ShiftPlaning.URL);
	
	ShiftPlaning.prozori(driver, ShiftPlaning.SHIFT_PLANING);
	
	String actual = driver.getTitle();
	String expected= "ShiftPlanning - Humanity";
	Assert.assertEquals(actual, expected);
	Thread.sleep(3000);
}

@Test (priority=8)

public void timeClock() throws InterruptedException {
	driver.navigate().to(ShiftPlaning.URL);
	
	ShiftPlaning.prozori(driver, ShiftPlaning.TIMECLOCK);
	
	String actual = driver.getTitle();
	String expected= "Timeclock - Overview - Humanity";
	Assert.assertEquals(actual, expected);
	Thread.sleep(3000);
}

@Test (priority=9)

public void leave() throws InterruptedException {
	driver.navigate().to(ShiftPlaning.URL);
	
	ShiftPlaning.prozori(driver, ShiftPlaning.LEAVE);
	
	String actual = driver.getTitle();
	//System.out.println(actual);
	String expected= "Leave - Vacation - Humanity";
	Assert.assertEquals(actual, expected);
	Thread.sleep(3000);
}

@Test (priority=10)

public void training() throws InterruptedException {
	driver.navigate().to(ShiftPlaning.URL);
	
	ShiftPlaning.prozori(driver, ShiftPlaning.TRANING);
	String actual = driver.getTitle();
	String expected= "Training - Overview - Humanity";
	Assert.assertEquals(actual, expected);
	Thread.sleep(3000);
}

@Test (priority=11)

public void staff() throws InterruptedException {
	driver.navigate().to(ShiftPlaning.URL);
	
	ShiftPlaning.prozori(driver, ShiftPlaning.STAFF);
	//ShiftPlaning.staff(driver);
	
	String actual = driver.getTitle();
	//System.out.println(actual);
	String expected= "Staff - Humanity";
	Assert.assertEquals(actual, expected);
	Thread.sleep(3000);
}

@Test (priority=12)

public void availability() throws InterruptedException {
	driver.navigate().to(ShiftPlaning.URL);
	
	ShiftPlaning.prozori(driver, ShiftPlaning.AVAILIBILITY);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
	String actual = driver.getTitle();
	String expected= "Humanity";
	Assert.assertEquals(actual, expected);
	Thread.sleep(8000);
}

@Test (priority=13)

public void Payrol() throws InterruptedException {
	driver.navigate().to(ShiftPlaning.URL);
	
	ShiftPlaning.prozori(driver, ShiftPlaning.PAYROLL);
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
	String actual = driver.getTitle();
	
	//System.out.println(actual);
	String expected= "Payroll - Scheduled-hours - Humanity";
	Assert.assertEquals(actual, expected);
	Thread.sleep(8000);
	
}

@Test (priority=14)

public void Reports() throws InterruptedException {
driver.navigate().to(ShiftPlaning.URL);
	
ShiftPlaning.prozori(driver, ShiftPlaning.REPORTS);
String actual = driver.getTitle();
	
	//System.out.println(actual);
	String expected= "Reports - Reports Home - Humanity";
	Assert.assertEquals(actual, expected);
	Thread.sleep(3000);
}

@Test (priority=15)
//////////////////////////
public void dodajZaposlenog() throws InterruptedException {
driver.navigate().to(ShiftPlaning.URL);
	
	ShiftPlaning.prozori(driver, ShiftPlaning.SHIFT_PLANING);
	Thread.sleep(2000);
	ShiftPlaning.addEmployee(driver);
	Thread.sleep(2000);
	ShiftPlaning.employeeSpam(driver);
	Thread.sleep(2000);
	ShiftPlaning.employeeFName(driver);
	Thread.sleep(2000);
	ShiftPlaning.employeeLName(driver);
	Thread.sleep(2000);
	ShiftPlaning.employeePosition(driver);
	Thread.sleep(2000);
	ShiftPlaning.employeeContinue(driver);
	Thread.sleep(2000);
	
	List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "Neko Nekic" + "')]"));
	Assert.assertTrue(list.size() > 0);			//nalazi string na stranici
	
}

@Test (priority=16)
//////////////////////////
public void izmeniZaposlenog() throws InterruptedException {
driver.navigate().to(ShiftPlaning.URL);
		ShiftPlaning.employee(driver);
		Thread.sleep(3000);
		ShiftPlaning.employeeEdit(driver);
		Thread.sleep(2000);
		ShiftPlaning.employeeNovoIme(driver);
		Thread.sleep(2000);
		ShiftPlaning.employeeSave(driver);
		driver.navigate().to(ShiftPlaning.URL);
		
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "lindalina Prvicevic" + "')]"));
		Assert.assertTrue(list.size() > 0);			//nalazi string na stranici
		
}

}