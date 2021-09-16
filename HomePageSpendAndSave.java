package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageSpendAndSave {
	WebDriver driver;
	By spendAndSaveButton = By.xpath("//a[@href = 'https://www.aspiration.com/our-products']");
	By getAspiration = By.xpath("//button[@ng-click = 'getAspirationOriginal()']");
	By getAspirationPlus = By.xpath("//button[@ng-click = 'getAspirationPlus()']");
	By aspirationSignUpEmail = By.xpath("//input[@id='join-waitlist-input']");
	By aspirationPlusYearly = By.xpath("//div[@class='modal-content']/div/div[2]/div[1]/h3");
	By aspirationPlusYearlyMoney = By.xpath("//div[@class='modal-content']/div/div[2]/div[1]/p");
	By aspirationPlusMonthly = By.xpath("//div[@class='modal-content']/div/div[2]/div[2]/h3");
	By aspirationPlusMonthlyMoney = By.xpath("//div[@class='modal-content']/div/div[2]/div[2]/p");
	
	
	//div[@class='modal-content']/div/div[2]/div[2]/h3
	
	
	
	public HomePageSpendAndSave(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSpendAndSave() {
		driver.findElement(spendAndSaveButton).click();
	}
	
	public void clickGetAspiration() {
		driver.findElement(getAspiration).click();
	}
	
	public boolean emailSignUpGetAspirationIsDisplayed() {
		return driver.findElement(aspirationSignUpEmail).isDisplayed();
	}
	
	public String getTextGetAspiration() {
		return driver.findElement(getAspiration).getText();
	}
	
	public void clickGetAspirationPlus() {
		driver.findElement(getAspirationPlus).click();
	}
	
	public String getTextGetAspirationPlus() {
		return driver.findElement(getAspirationPlus).getText();
	}
	
	public String getAspirationPlusPlanYearly() {
		return driver.findElement(aspirationPlusYearly).getText();
		
	}
	
	public String getAspirationPlusPlanYearlyMoney() {
		return driver.findElement(aspirationPlusYearlyMoney).getText();
		
	}
	
	public String getAspirationPlusPlanMonthly() {
		return driver.findElement(aspirationPlusMonthly).getText();
		
	}
	
	public String getAspirationPlusPlanMonthlyMoney() {
		return driver.findElement(aspirationPlusMonthlyMoney).getText();
		
	}

}
