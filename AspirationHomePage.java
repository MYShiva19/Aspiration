package StepDefinations;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePageSpendAndSave;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class AspirationHomePage{
	
	WebDriver driver = null;
	HomePageSpendAndSave homePage;
	
	@Given("^User Enters the Aspiration Home Page URL$")
    public void user_enters_the_aspiration_home_page_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "//Users/yogashivamathivanan//Selenium2021//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.aspiration.com/");
		homePage = new HomePageSpendAndSave(driver);
        
    }
	
	@And("^User clicks on Spend & Save tab$")
    public void user_clicks_on_spend_save_tab() throws Throwable {
		homePage.clickSpendAndSave();
    	
    }

    @Then("^User validates the Aspiration and Aspiration Plust Product is Visible$")
    public void user_validates_the_aspiration_and_aspiration_plust_product_is_visible() throws Throwable {
    	System.out.println(homePage.getTextGetAspiration());
    	Assert.assertEquals("GET ASPIRATION", homePage.getTextGetAspiration());
    	System.out.println(homePage.getTextGetAspirationPlus());
    	Assert.assertEquals("GET ASPIRATION PLUS", homePage.getTextGetAspirationPlus());
    	
    	
    	
    	
    }

    @Then("^User clicks on Get Aspiration Link and validate email signUp popup$")
    public void user_clicks_on_get_aspiration_link_and_validate_email_signup_popup() throws Throwable {
    	homePage.clickGetAspiration();
    	Assert.assertEquals(true, homePage.emailSignUpGetAspirationIsDisplayed());
    	System.out.println("Email Displayed");
    }

    @Then("^User clicks on Get Aspiration Plus Link and validate email signUp popup with yearly and Monthly Plan$")
    public void user_clicks_on_get_aspiration_plus_link_and_validate_email_signup_popup_with_yearly_and_monthly_plan() throws Throwable {
    	homePage.clickGetAspirationPlus();
    	Assert.assertEquals("Yearly % Savings", homePage.getAspirationPlusPlanYearly());
    	Assert.assertEquals("$ paid once yearly", homePage.getAspirationPlusPlanYearlyMoney());
    	Assert.assertEquals("Monthly", homePage.getAspirationPlusPlanMonthly());
    	Assert.assertEquals("$ paid monthly", homePage.getAspirationPlusPlanMonthlyMoney());
    	
    }

    

}
