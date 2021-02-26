package objekti;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	private static final String EMAIL_XPATH="//*[@id=\"email\"]";
	private static final String PASSWORD_XPATH="//*[@id=\"password\"]";
	private static final String LOGIN_XPATH="/html/body/div[1]/div[2]/div/form[1]/div[3]/div/button[1]";
	public static final String POTVRDA_POSTOJECIK="https://kompanija71.humanity.com/app/dashboard/";
	private static final String LOGOUT_STRELICA="//*[@id=\"wrap_us_menu\"]/i";
	private static final String LOGOUT="//*[@id=\"userm\"]/div/div[5]/a";
	private static final String LOGOUT_SPAM1="//*[@id=\"walkme-balloon-456078\"]/div/div[1]/div[2]/div/div[1]";
	private static final String LOGOUT_SPAM2="//*[@id=\"intercom-container\"]/div/span/div/div/div/span";
	private static final String LOGOUT_SPAM0="//*[@id=\"walkme-balloon-462027\"]/div/div[1]/div[2]/div/div[2]/div/a";
	
	
public static void logout (WebDriver driver) throws AWTException{
		
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
	WebElement ae= driver.findElement(By.xpath(LOGOUT_SPAM0));
	ae.click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		WebElement ae= driver.findElement(By.xpath(LOGOUT_SPAM1));
		ae.click();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Robot robot;											//kontrolisanje misa
		
		robot = new Robot();
		
		int x=267;
		int y=335;
		robot.mouseMove(x,y); 
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
		//ae.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement ae=driver.findElement(By.xpath(LOGOUT_STRELICA));
		ae.click();
		ae.findElement(By.xpath(LOGOUT));
		ae.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	public static void dashboard (WebDriver driver) {
		
		WebElement ae= driver.findElement(By.xpath(EMAIL_XPATH));
		ae.click();
		ae.sendKeys("adgaoocamp@mail.com");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ae.findElement(By.xpath(PASSWORD_XPATH)).sendKeys("135790");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ae.findElement(By.xpath(LOGIN_XPATH)).click();
	}
}
