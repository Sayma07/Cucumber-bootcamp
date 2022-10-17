package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class BackGroundClolorCahngePage {

	WebDriver driver;

	public BackGroundClolorCahngePage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")
	WebElement skyBlueBackGroundBox;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]")
	WebElement skyWhiteBackGroundBox;

	
	
	
	
	
	public void skyBlueBoxClick() {
		skyBlueBackGroundBox.click();

	}
	
	
	public void skyWhiteBoxClick() {
		skyWhiteBackGroundBox.click();
	}
	
	
	public String validation1() {
		
		String boxContain1 = skyBlueBackGroundBox.getText();

		return boxContain1;
		
	}
	
	public void  skyBlueBoxExistAndValidation() {

	

		if (skyBlueBackGroundBox.isDisplayed()) {
			System.out.println("SkyBlue box is exist");
		} else {
			System.out.println("box not exist");
		}
		
	}

	
	public void skywhiteBoxExist() {

boolean skyWhiteButtonExist=skyWhiteBackGroundBox.isDisplayed();
		System.out.println(skyWhiteButtonExist);
	
	}

		

		
	
		
		public  String validation2() {
			
	String	BoxContain2=skyWhiteBackGroundBox.getText();
		System.out.println(BoxContain2);
		
		
		
		return BoxContain2;
	}

}
