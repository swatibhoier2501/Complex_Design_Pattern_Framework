package knowledgeware_Page_Actions;

import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import common_Functions_Web.WebBrowser;
import common_Functions_Web.WebDropDown;
import common_Functions_Web.WebTextBox;
import knowledgeware_Page_Locators.RegisterThree_Page_Locator;
public class RegisterThree_Page_Action {
	public WebDriver driver = null;
	public ExtentTest logger = null;
	public RegisterThree_Page_Locator regThreePL = null;
	
	public RegisterThree_Page_Action(WebDriver driver, ExtentTest logger){
		this.driver = driver;
		this.logger = logger;
		regThreePL = new RegisterThree_Page_Locator(driver);
	}
	public boolean validatePageTitlethird(String expectedTitle){
		return WebBrowser.titleVerification(driver, expectedTitle,logger);
	}
	public void enteradress(String address) {
		WebTextBox.sendInput(regThreePL.getadress(), address, logger);
	}
	public void entercity(String city) {
		WebTextBox.sendInput(regThreePL.getcity(), city, logger);
	}
	public void enterpincode(String pincode) {
		WebTextBox.sendInput(regThreePL.getpincode(), pincode, logger);
	}
	public void enterstate(String state) {
		WebTextBox.sendInput(regThreePL.getstate(), state, logger);
	}
	public void selectindex(String select) {
		WebDropDown.selectByVisibleText(regThreePL.getcountry(),select,logger);
		
	}
	public void clknext(){
		WebTextBox.click(regThreePL.getnext(), logger);
	}
	
	 

    public void registationProcessPageThree(String title,String address, String city,String pincode,String state ,String country) {
    	if(validatePageTitlethird(title)) {
    		
	         enteradress(address);
	         entercity(city);
	         enterpincode(pincode);
	         enterstate (state);
	         selectindex(country);
	         clknext();
	         
    	}else{
			logger.log(LogStatus.FAIL, "Title does not match for registation page one");
		}
	}


}
