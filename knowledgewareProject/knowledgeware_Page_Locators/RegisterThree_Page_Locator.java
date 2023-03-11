package knowledgeware_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterThree_Page_Locator {
	WebDriver driver = null;
	public RegisterThree_Page_Locator(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="Address")
	private WebElement adress;
	public WebElement getadress() {
		return adress;
	}
	@FindBy(name="City")
	private WebElement city;
	public WebElement getcity() {
		return city;
	}
	@FindBy(name="Pin_Code")
	private WebElement pincode;;
	public WebElement getpincode() {
		return pincode;
	}
	@FindBy(name="State")
	private WebElement state;
	public WebElement getstate() {
		return state;
	}
	@FindBy(tagName ="select")
	private WebElement country;
	public WebElement getcountry() {
		return country;
	}
	@FindBy(xpath ="//a[normalize-space()='NEXT']")
	private WebElement next;
	public WebElement getnext() {
		return next;
	}
	
	
}
