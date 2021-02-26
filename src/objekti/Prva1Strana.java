package objekti;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.commons.collections4.FactoryUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prva1Strana {

	public static final String URL="https://www.humanity.com/";
	private static final String ISKLJUCI="//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	private static final String FULLNAME="//*[@id=\"top-form\"]/div/div[1]/input";
	private static final String EMAIL="//*[@id=\"top-form\"]/div/div[2]/input";
	private static final String FREETRIAL="//*[@id=\"free-trial-link-01\"]";
	private static final String FREETRIAL2="//*[@id=\"navbarSupportedContent\"]/div/a[3]";
	private static final String START2FREETRIAL="//*[@id=\"popup-free-trial-link\"]";
	
	private static final String FULLNAME2="//*[@id=\"popup-form\"]/div[1]/input";
	private static final String EMAIL2="//*[@id=\"popup-form\"]/div[2]/input";
	private static final String ABOUT="//*[@id=\"navbarSupportedContent\"]/ul/li[6]";
	private static final String ABOUTUS="//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a/p[1]";
	private static final String MAIL=randomEmail();
	public static final String MAIL2=randomEmail();
	
	public static String randomEmail() {
		return "random-"+ UUID.randomUUID().toString()+"@gmail.com";
	}
	
	public static void zatvoriCookies(WebDriver driver) {
		WebElement ae= driver.findElement(By.xpath(ISKLJUCI));
		ae.click();
	}
	
	public static void maksimizuj(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
		public static void unesi1Ime(WebDriver driver) {
		WebElement we= driver.findElement(By.xpath(FULLNAME));
		we.click();
		we.sendKeys("Prki Prvicevic");
		}
		
		public static void unesi1Email(WebDriver driver) {
		
		WebElement be= driver.findElement(By.xpath(EMAIL));
		be.click();
		be.sendKeys(MAIL);
		}
		
		public static void klikni1Dugme(WebDriver driver) {
		WebElement ce= driver.findElement(By.xpath(FREETRIAL));
		ce.click();
		}
		
		public static void unesi2Ime(WebDriver driver) {
			WebElement we= driver.findElement(By.xpath(FULLNAME2));
			we.click();
			we.sendKeys("Drugi Drugic");
			}
			
			public static void unesi2Email(WebDriver driver) {
			
			WebElement be= driver.findElement(By.xpath(EMAIL2));
			be.click();
			be.sendKeys(MAIL2);
			}
			
			public static void klikni2Dugme(WebDriver driver) {
			WebElement ce= driver.findElement(By.xpath(FREETRIAL2));
			ce.click();
			}
			
			public static void klikni2submit(WebDriver driver) {
				WebElement ce= driver.findElement(By.xpath(START2FREETRIAL));
				ce.click();
				}
			
			
			public static void about(WebDriver driver) {
				WebElement ce= driver.findElement(By.xpath(ABOUT));
				ce.click();
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
				
			}
			
			public static void aboutus(WebDriver driver) {
				WebElement ce= driver.findElement(By.xpath(ABOUTUS));
				
				ce.click();
			}
			
			
			public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		        
		        TakesScreenshot scrShot =((TakesScreenshot)webdriver);		//Convert web driver object to TakeScreenshot
		       
		                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);		 //Call getScreenshotAs method to create image file
		          
		                File DestFile=new File(fileWithPath);					  //Move image file to new destination
		               
		               FileUtils.copyFile(SrcFile, DestFile);						 //Copy file at destination

		               
		                File src= ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);         
		                try {             
		                  FileUtils.copyFile(src, new File("path of the file"));         
		                } catch (IOException e) {                         
		                  e.printStackTrace();         
		                } 
		               
		    }
		    
}
