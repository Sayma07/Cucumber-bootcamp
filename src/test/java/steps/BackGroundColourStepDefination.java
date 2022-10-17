package steps;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BackGroundClolorCahngePage;
import pages.BrowserFactory;

public class BackGroundColourStepDefination extends BrowserFactory{
	
BackGroundClolorCahngePage backgroundColorchange;


@Given("^User should be on Techfios Login Page$")
public void user_should_be_on_Techfios_Login_Page() throws Throwable {
	init();

	  driver.get("http://techfios.com/test/101/");
	backgroundColorchange=PageFactory.initElements(driver, BackGroundClolorCahngePage.class);
	Thread.sleep(4000);
	
	
}@Given("^Set SkyBlue Background button exists$")
public void set_SkyBlue_Background_button_exists() throws Throwable {
	System.out.println("Q01");
	backgroundColorchange.skyBlueBoxExistAndValidation();
}

@When("^I click on the button$")
public void i_click_on_the_button() throws Throwable {
	System.out.println("Q02 Click the Button");
	backgroundColorchange.skyBlueBoxClick();
	
}

@Then("^the background color will change to sky blue$")
public void the_background_color_will_change_to_sky_blue() throws Throwable {
    Assert.assertEquals("Set SkyBlue Background", backgroundColorchange.validation1());
    System.out.println("Q03"+"Color Has Change from white to Blue");
	
}

@Given("^Set SkyWhite Background button exists$")
public void set_SkyWhite_Background_button_exists() throws Throwable {
	
	Thread.sleep(2000);
	
	backgroundColorchange.skywhiteBoxExist();
System.out.println(" Q04 SkyWhite Button Displaying");
}

@When("^I click in the SkyWhite button$")
public void i_click_in_the_SkyWhite_button() throws Throwable {
	backgroundColorchange.skyWhiteBoxClick(); 
System.out.println("Q5 Clicking the button");

}

@Then("^the background color will change to white$")
public void the_background_color_will_change_to_white() throws Throwable {
    
Assert.assertEquals("Set White Background", backgroundColorchange.validation2());
System.out.println("06 now background colour is white");

}


}
