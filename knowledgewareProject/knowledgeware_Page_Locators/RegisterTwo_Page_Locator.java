package knowledgeware_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterTwo_Page_Locator {
	WebDriver driver = null;
	public RegisterTwo_Page_Locator(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//WebElement userName = driver.findElement(By.name("name"));
	@FindBy(xpath ="//input[@name='First_Name']") 
	private WebElement firstName;
	
	public WebElement getFirstName(){
		return firstName;
	}
	
	@FindBy(xpath ="//input[@name='Last_Name']") 
	private WebElement lastName;
	
	public WebElement getLastName(){
		return lastName;
	}
	
	@FindBy(xpath ="//select[@id='Birthday_Day']") 
	private WebElement birthDate;
	
	public WebElement getBirthDay(){
		return birthDate;
	}
	@FindBy(xpath ="//select[@id='Birthday_Month']") 
	private WebElement birthMonth;
	
	public WebElement getBirthMonth(){
		return birthMonth;
	}
	@FindBy(xpath ="//select[@id='Birthday_Year']") 
	private WebElement birthYear;
	
	public WebElement getBirthYear(){
		return birthYear;
	}
	@FindBy(xpath ="//input[@name='Email_Id']") 
	private WebElement emailId;
	
	public WebElement getEmailId(){
		return emailId;
	}
	@FindBy(xpath ="//input[@name='Mobile_Number']") 
	private WebElement mobileNo;
	
	public WebElement getMobileNo(){
		return mobileNo;
	}
	@FindBy(xpath ="//input[@value='Male']") 
	private WebElement gender;
	
	public WebElement getGender(){
		return gender;
	}
	@FindBy(xpath ="//a[text()='NEXT']") 
	private WebElement nextButton;
	
	public WebElement getNextButton(){
		return nextButton;
	}
	
}
