package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class HomePage {
	WebDriver driver;
	private ElementUtils elementUtils;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtils=new ElementUtils(driver);
		
	}
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccountDropMenu;
	
	@FindBy(linkText="Login")
	private WebElement loginOption;
	
	@FindBy(linkText="Register")
	private WebElement registerOption;
	
	@FindBy(name="search")
	private WebElement searchField;
	
	@FindBy(xpath="//button[contains(@class,'btn btn-default btn-lg')]")
	private WebElement clickSearchbutton;
	
	public void clickOnMyAccount() {
		elementUtils.clickonElement(myAccountDropMenu, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public LoginPage selectLoginOption() {
		elementUtils.clickonElement(loginOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new LoginPage(driver);
	}
	 
	public RegisterPage selectRgisterOption() {
		elementUtils.clickonElement(registerOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new RegisterPage(driver);
	}
	
	public void EnterSearchField(String ProductText) {
		elementUtils.typeTextIntoElement(searchField, ProductText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		}
	
	public SearchResultPage clickOnSearchbutton() {
		elementUtils.clickonElement(clickSearchbutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new SearchResultPage(driver);
	}

}
