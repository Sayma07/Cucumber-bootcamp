package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class BrowserFactory {

	
	public static WebDriver driver;
	
	
  public static void   init() {
		
		
		
		  System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	
	}

	
/* public void takeScreenShot(WebDriver driver){
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File SourceFile=ts.getScreenshotAs(OutputType.FILE);
			String currentDirectory=System.getProperty("user.dir");
			
			
			SimpleDateFormat formator=new SimpleDateFormat("MMddyy_HHmmss");
			
			Date date=new Date();
			
			String label=formator.format(date);
			
			try {
				FileUtils.copyFile(SourceFile, new File(currentDirectory+"/screenshot/"+label+".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}

}*/

	public static void tearDown() {
		driver.close();
		driver.quit();
	}

}
