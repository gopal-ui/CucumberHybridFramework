package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class RegisterPage {
	WebDriver driver;
	private ElementUtils elementUtils;
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils=new ElementUtils(driver);
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstNameField;
	
	@FindBy(id="input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id="input-email")
	private WebElement emailField;
	
	@FindBy(id="input-telephone")
	private WebElement telephoneField;
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(id="input-confirm")
	private WebElement confirmPasswordField;
	
	@FindBy(name="agree")
	private WebElement privacyPolicyOption;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement ContinueButtonOption;
	
	@FindBy(xpath="//input[@name='newsletter'][@value='1']")
	private WebElement YesForNewsletter;
	
	
	@FindBy(xpath="//div[contains(@class,'alert alert-danger alert-dismissible')]")
	private WebElement WarningMessageAboutDuplicateEmail;
	
	@FindBy(xpath="//input[@id='input-firstname']/following-sibling::div")
	private WebElement FirstNameWarning;
	
	@FindBy(xpath="//input[@id='input-lastname']/following-sibling::div")
	private WebElement LastNameWarning;
	
	@FindBy(xpath="//input[@id='input-email']/following-sibling::div")
	private WebElement EmailWarning;
	
	@FindBy(xpath="//input[@id='input-telephone']/following-sibling::div")
	private WebElement TelephoneWarning;
	
	@FindBy(xpath="//input[@id='input-password']/following-sibling::div")
	private WebElement PasswordWarning;
	
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	private WebElement PrivacyPolicyWarning;
	
	public void enterFirstNameField(String firstNameText) {
		elementUtils.typeTextIntoElement(firstNameField, firstNameText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	
		
	}
	
	public void enterLastNameField(String lastNameText) {
		elementUtils.typeTextIntoElement(lastNameField, lastNameText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public void enterEmailField(String emailText) {
		elementUtils.typeTextIntoElement(emailField, emailText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public void entertelephoneField(String telephoneText) {
		elementUtils.typeTextIntoElement(telephoneField, telephoneText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public void entepasswordField(String passwordFieldText) {
		elementUtils.typeTextIntoElement(passwordField, passwordFieldText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public void enteconfirmPasswordField(String confirmPasswordFieldText) {
		elementUtils.typeTextIntoElement(confirmPasswordField, confirmPasswordFieldText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		}
	public void SelectPrivacyPolicy() {
		elementUtils.clickonElement(privacyPolicyOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		}
	public AccountSuccessPage SelectContinueButtonOption() {
		elementUtils.clickonElement(ContinueButtonOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new AccountSuccessPage(driver);
	}
	public void SelectYesForNewsletter() {
		elementUtils.clickonElement(YesForNewsletter, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		}
	
	public String getWarningMessageAboutDuplicateEmail() {
		return elementUtils.getTextFromElement(WarningMessageAboutDuplicateEmail, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public String getFirstNameWarning() {
		return elementUtils.getTextFromElement(FirstNameWarning, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	public String getLastNameWarning() {
		return elementUtils.getTextFromElement(LastNameWarning, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	public String getEmailWarning() {
		return elementUtils.getTextFromElement(EmailWarning, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	public String getTelephoneWarning() {
		return elementUtils.getTextFromElement(TelephoneWarning, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	public String getPasswordWarning() {
		return elementUtils.getTextFromElement(PasswordWarning, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	public String getPrivacyPolicyWarning() {
		return elementUtils.getTextFromElement(PrivacyPolicyWarning, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
}
