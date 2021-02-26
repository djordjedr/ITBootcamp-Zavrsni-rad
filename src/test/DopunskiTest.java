package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objekti.Humanity;
import objekti.Prva1Strana;
import objekti.ShiftPlaning;

public class DopunskiTest {
	
	WebDriver driver;
	 InputStream inp;
	 XSSFWorkbook wb;
	 Sheet sheet;
	
	//private static WebDriver driver;
	 
	 public void dodajPrvogZaposlenog() {
		 
	 }
	
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
	///////////////////////
	@Test (priority=2)

	public void dodajZaposlenog1() throws InterruptedException {
	
	
	File f=new File ("MrData.xlsx");
	try {
		inp = new FileInputStream(f);			// Citanje iz fajla
		wb = new XSSFWorkbook(inp);
		Sheet sheet = wb.getSheetAt(0);			// Dohvata sheet
		Row row1 = sheet.getRow(0); 	// Dohvata red
		Cell c1=row1.getCell(0);
		Cell c2=row1.getCell(1);
		
		String ime1=c1.toString();
		String prezime1=c2.toString();
		
		driver.navigate().to(ShiftPlaning.URL);
		ShiftPlaning.prozori(driver, ShiftPlaning.SHIFT_PLANING);
		Thread.sleep(2000);
		ShiftPlaning.addEmployee(driver);
		Thread.sleep(2000);
		ShiftPlaning.prviZaposleni(driver, ime1, prezime1);
		Thread.sleep(2000);
	}
	catch (IOException  e) {
		e.printStackTrace();
	}
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "Neko Nekic" + "')]"));
		Assert.assertTrue(list.size() > 0);		//nalazi string na stranici
	}
	
	@Test (priority=3)

	public void dodajZaposlenog2() throws InterruptedException {
	File f=new File ("MrData.xlsx");
	try {
		inp = new FileInputStream(f);			// Citanje iz fajla
		wb = new XSSFWorkbook(inp);
		Sheet sheet = wb.getSheetAt(0);			// Dohvata sheet
		Row row1 = sheet.getRow(1); 	// Dohvata red
		Cell c1=row1.getCell(0);
		Cell c2=row1.getCell(1);
		
		String ime1=c1.toString();
		String prezime1=c2.toString();
		System.out.println(ime1);
		System.out.println(prezime1);
		
		ShiftPlaning.drugiZaposleni(driver, ime1, prezime1);
		Thread.sleep(2000);
	}
	catch (IOException  e) {
		e.printStackTrace();
	}
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "Neko Nekic" + "')]"));
		Assert.assertTrue(list.size() > 0);		//nalazi string na stranici
	}
	
	@Test (priority=4)

	public void dodajZaposlenog3() throws InterruptedException {
	
	
	File f=new File ("MrData.xlsx");
	try {
		inp = new FileInputStream(f);			// Citanje iz fajla
		wb = new XSSFWorkbook(inp);
		Sheet sheet = wb.getSheetAt(0);			// Dohvata sheet
		Row row1 = sheet.getRow(2); 	// Dohvata red
		Cell c1=row1.getCell(0);
		Cell c2=row1.getCell(1);
		
		String ime1=c1.toString();
		String prezime1=c2.toString();
		System.out.println(ime1);
		System.out.println(prezime1);
		
		ShiftPlaning.treciZaposleni(driver, ime1, prezime1);
		Thread.sleep(2000);

	}
	catch (IOException  e) {
		e.printStackTrace();
	}
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "Neko Nekic" + "')]"));
		Assert.assertTrue(list.size() > 0);		//nalazi string na stranici
	}
	
	@Test (priority=5)

	public void dodajZaposlenog4() throws InterruptedException {
	
	
	File f=new File ("MrData.xlsx");
	try {
		inp = new FileInputStream(f);			// Citanje iz fajla
		wb = new XSSFWorkbook(inp);
		Sheet sheet = wb.getSheetAt(0);			// Dohvata sheet
		Row row1 = sheet.getRow(3); 	// Dohvata red
		Cell c1=row1.getCell(0);
		Cell c2=row1.getCell(1);
		
		String ime1=c1.toString();
		String prezime1=c2.toString();
		System.out.println(ime1);
		System.out.println(prezime1);
		
		ShiftPlaning.cetvrtiZaposleni(driver, ime1, prezime1);
		Thread.sleep(2000);
	}
	catch (IOException  e) {
		e.printStackTrace();
	}
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "Neko Nekic" + "')]"));
		Assert.assertTrue(list.size() > 0);		//nalazi string na stranici
	}
	
	@Test (priority=6)

	public void dodajZaposlenog5() throws InterruptedException {
	
	
	File f=new File ("MrData.xlsx");
	try {
		inp = new FileInputStream(f);			// Citanje iz fajla
		wb = new XSSFWorkbook(inp);
		Sheet sheet = wb.getSheetAt(0);			// Dohvata sheet
		Row row1 = sheet.getRow(4); 	// Dohvata red
		Cell c1=row1.getCell(0);
		Cell c2=row1.getCell(1);
		
		String ime1=c1.toString();
		String prezime1=c2.toString();
		System.out.println(ime1);
		System.out.println(prezime1);
		
		ShiftPlaning.petiZaposleni(driver, ime1, prezime1);
		Thread.sleep(2000);
	}
	catch (IOException  e) {
		e.printStackTrace();
	}
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "Neko Nekic" + "')]"));
		Assert.assertTrue(list.size() > 0);		//nalazi string na stranici
	}
	
	
}
