package knowledgeware_Page_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Functions_Web.WebBrowser;
import common_Functions_Web.WebDropDown;
import common_Functions_Web.WebRadioButton;
import common_Functions_Web.WebTextBox;
import knowledgeware_Page_Locators.RegisterTwo_Page_Locator;

public class RegisterTwo_Page_Action {
	public WebDriver driver = null;
	public ExtentTest logger = null;
	public RegisterTwo_Page_Locator regOnePL = null;
	
	public RegisterTwo_Page_Action(WebDriver driver, ExtentTest logger){
		this.driver = driver;
		this.logger = logger;
		regOnePL = new RegisterTwo_Page_Locator(driver);
	}
	public boolean validatePageTitleSecond(String expectedTitle){
		return WebBrowser.titleVerification(driver, expectedTitle,logger);
	}
	public void enterFirstName(String fName){
		WebElement firstName = regOnePL.getFirstName();
		WebTextBox.sendInput(firstName, fName, logger);
	}
	
	public void enterLastName(String lName){
		WebElement lastName = regOnePL.getLastName();
		WebTextBox.sendInput(lastName, lName, logger);
	}
	
	public void enterBirthDate(String bDate){
		WebElement birthDate = regOnePL.getBirthDay();
		WebDropDown.selectByVisibleText(birthDate, bDate, logger);
	}
	
	public void enterBirthMonth(String bMonth){
		WebElement birthMonth = regOnePL.getBirthMonth();
		WebDropDown.selectByVisibleText(birthMonth, bMonth, logger);
	}
	public void enterBirthYear(String bYear){
		WebElement birthYear = regOnePL.getBirthYear();
		WebDropDown.selectByVisibleText(birthYear, bYear, logger);
	}
	public void enterEmailId(String email){
		WebElement emailId = regOnePL.getEmailId();
		WebTextBox.sendInput(emailId, email, logger);
	}
	public void enterMobileNo(String mobileNo){
		WebElement mobNo = regOnePL.getMobileNo();
		WebTextBox.sendInput(mobNo, mobileNo, logger);
	}
	public void enterGender(String gender){
		WebElement genderval = regOnePL.getGender();
		WebRadioButton.radioClick(genderval, logger);
	}
	public void clickNext(){
		WebElement genderval = regOnePL.getNextButton();
		WebTextBox.click(genderval, logger);
	}
	
	public void registationProcessPageTwo(String title, String fName, String lName,String bDate, String bMonth, String bYear,String emailId, String mobileNo, String gender){
		if(validatePageTitleSecond(title)){
			enterFirstName(fName);
			enterLastName(lName);
			enterBirthDate(bDate);
			enterBirthMonth(bMonth);
			enterBirthYear(bYear);
			enterEmailId(emailId);
			enterMobileNo(mobileNo);
			enterGender(gender);
			clickNext();
		}else{
			logger.log(LogStatus.FAIL, "Title does not match for registation page one");
		}
	}
}
