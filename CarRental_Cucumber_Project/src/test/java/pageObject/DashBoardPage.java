package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class DashBoardPage {
	public static WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		DashBoardPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[1]/a")
	WebElement carRentalPortal;
	@FindBy(xpath = "/html/body/div[2]/nav/ul/li[2]/a")
	WebElement testDashButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/a")
	WebElement testRegButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/h2")
	WebElement testRegHeader;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div/div[2]/div/a")
	WebElement testListVehButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/h2")
	WebElement testManVehHeader;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div/div[3]/div/a")
	WebElement testTotBookButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/h2")
	WebElement testManBookHeader;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div/div[4]/div/a")
	WebElement testListBrandButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/h2")
	WebElement testManBrandHeader;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div/div/div[1]/div/a")
	WebElement testSubscibersButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/h2")
	WebElement testManSubHeader;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/a")
	WebElement testQueriesButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/h2")
	WebElement testManContactHeader;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div/div/div[3]/div/a")
	WebElement testTestimonialButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/h2")
	WebElement testManTestHeader;
	@FindBy(xpath = "/html/body/div[1]/ul/li/a")
	WebElement accountLocator;
	@FindBy(xpath = "/html/body/div[1]/ul/li/ul/li[2]/a")
	WebElement logoutLocator;
	@FindBy(xpath = "/html/body/div[1]/ul/li/ul/li[1]/a")
	WebElement changePassLocator;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/h2")
	WebElement changePassPage;
	@FindBy(name = "password")
	WebElement passwordField;
	@FindBy(name = "newpassword")
	WebElement newpasswordField;
	@FindBy(name = "confirmpassword")
	WebElement confirmpasswordField;
	@FindBy(name = "submit")
	WebElement saveChangesbutton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/div/div/div[2]/form/div[1]")
	WebElement successPassMsg;

	public void checkCarRentalPortal() {
		carRentalPortal.isDisplayed();
	}

	public void dashboardButton() {
		testDashButton.click();
	}

	public void regUserButton() {
		testRegButton.click();
	}

	public void checkRegUser() {
		testRegHeader.isDisplayed();
	}

	public void listVehButton() {
		testListVehButton.click();
	}

	public void checkManVeh() {
		testManVehHeader.isDisplayed();
	}

	public void totalBookButton() {
		testTotBookButton.click();
	}

	public void checkManBook() {
		testManBookHeader.isDisplayed();
	}

	public void listBrandButton() {
		testListBrandButton.click();
	}

	public void checkListBrand() {
		testManBrandHeader.isDisplayed();
	}

	public void subscibersButton() {
		testSubscibersButton.click();
	}

	public void checkSubscibers() {
		testManSubHeader.isDisplayed();
	}

	public void queriesButton() {
		testQueriesButton.click();
	}

	public void checkQueries() {
		testManContactHeader.isDisplayed();
	}

	public void testimonialButton() {
		testTestimonialButton.click();
	}

	public void checktestimonial() {
		testManTestHeader.isDisplayed();
	}

	public void clickAccount() {
		accountLocator.click();
	}

	public void clickLogout() {
		logoutLocator.click();
	}

	public void clickChangePassword() {
		changePassLocator.click();
	}

	public void checkChangePassPage() {
		changePassPage.isDisplayed();
	}

	public void checkPasswordField(String currentpassword) {
		passwordField.sendKeys(currentpassword);
	}

	public void checkNewPassword(String newpassword) {
		newpasswordField.sendKeys(newpassword);
	}

	public void checkConfirmPassword(String confirmpassword) {
		confirmpasswordField.sendKeys(confirmpassword);
	}

	public void clickSaveChanges() {
		saveChangesbutton.click();
	}

	public String getSuccessPassMsg() {
		String msg = successPassMsg.getText();
		return msg;
	}

	public String getValidationMsg() {
		String message = passwordField.getAttribute("validationMessage");
		return message;
	}
}
