package objekti;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Humanity {
	
	public static final String URL="https://www.humanity.com/wizard-setup2/";
	private static final String CNAME_XPATH="//*[@id=\"root\"]/div/div/form/div[1]/div/div[1]/div/div/input";
	private static final String INDUSTRY_XPATH="/html/body/div/div/div/form/div[1]/div/div[2]/div/div/span";
	private static final String ROLE_XPATH="//*[@id=\"root\"]/div/div/form/div[1]/div/div[3]/div/div/span";
	private static final String PHONE_XPATH="//*[@id=\"root\"]/div/div/form/div[1]/div/div[4]/div/input";
	private static final String PASSWORD_XPATH="//*[@id=\"root\"]/div/div/form/div[1]/div/div[5]/div/input";
	private static final String CONFPASSWORD_XPATH="//*[@id=\"root\"]/div/div/form/div[1]/div/div[6]/div/input";
	private static final String SUBMIT_XPATH="//*[@id=\"root\"]/div/div/form/div[2]/span/input";
	public static final String PASSWORD="135790";
	

	
	public static void kompanija(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		WebElement ae= driver.findElement(By.xpath(CNAME_XPATH));
		ae.click();
		ae.sendKeys("Kompanija");
		
	}
	
	public static void industrija(WebDriver driver) {
		WebElement ae= driver.findElement(By.xpath(INDUSTRY_XPATH));
		ae.click();
		ae.sendKeys(Keys.ARROW_DOWN);
		ae.sendKeys(Keys.ARROW_DOWN);
		ae.sendKeys(Keys.ARROW_DOWN);
		ae.sendKeys(Keys.ARROW_DOWN);
		ae.sendKeys(Keys.ENTER);
		/*
		Select dropdown=new  Select(driver.findElement(By.xpath(CNAME_XPATH))); //ne radi selekcija na ovom sajtu
		dropdown.selectByVisibleText("Education");
		*/
	}
	
	public static void role (WebDriver driver) {
		
		WebElement ae= driver.findElement(By.xpath(ROLE_XPATH));
		ae.click();
		ae.sendKeys(Keys.ARROW_DOWN);		//if it works, dont fix it
		ae.sendKeys(Keys.ARROW_DOWN);
		ae.sendKeys(Keys.ARROW_DOWN);
		ae.sendKeys(Keys.ARROW_DOWN);
		ae.sendKeys(Keys.ARROW_DOWN);
		ae.sendKeys(Keys.ARROW_DOWN);
		ae.sendKeys(Keys.ENTER);
	}
	
public static void phone (WebDriver driver) {
		
		WebElement ae= driver.findElement(By.xpath(PHONE_XPATH));
		ae.click();
		ae.sendKeys("1234567");		
	}

public static void password (WebDriver driver) {
	
	WebElement ae= driver.findElement(By.xpath(PASSWORD_XPATH));
	ae.click();
	ae.sendKeys(PASSWORD);		
}

public static void confPassword (WebDriver driver) {
	
	WebElement ae= driver.findElement(By.xpath(CONFPASSWORD_XPATH));
	ae.click();
	ae.sendKeys("135790");		
}

public static void submit (WebDriver driver) {
	
	WebElement ae= driver.findElement(By.xpath(SUBMIT_XPATH));
	ae.click();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		
}

}
