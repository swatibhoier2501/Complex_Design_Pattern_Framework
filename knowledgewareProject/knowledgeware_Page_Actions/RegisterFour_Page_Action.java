package knowledgeware_Page_Actions;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import common_Functions_Web.WebBrowser;
import common_Functions_Web.WebCheckBox;
import common_Functions_Web.WebTextBox;
import knowledgeware_Page_Locators.RegisterFour_Page_Locator;

public class RegisterFour_Page_Action {
	WebDriver driver = null;
	public ExtentTest logger=null;
	public RegisterFour_Page_Locator regFourPL=null;
	public RegisterFour_Page_Action(WebDriver driver,ExtentTest logger) {

	
		this.driver=driver;
		this.logger=logger;
		regFourPL=new RegisterFour_Page_Locator(driver);
		
	}
	public boolean validatePageTitle(String expectedTitle){
		return WebBrowser.titleVerification(driver, expectedTitle,logger);
	}
	public void selectHobbies(String[] hobbies) {
		WebCheckBox.select_Check_Box(regFourPL.gethobby(),hobbies,logger);
		
	}
	public void selectHobbies(String hobbies) {
		WebCheckBox.CheckBox(regFourPL.hobby(),hobbies,logger);
		
	}
	
	
	public void clknext(){
		WebTextBox.click(regFourPL.getnext(), logger);
	}
	
	 
	public void registrationProcessPageFour(String title,String[] Hobbies) {
		if(validatePageTitle(title)) {
			selectHobbies(Hobbies);
			
			clknext();
		}
	}
	public void registrationProcessPageFour(String title,String Hobbies) {
		if(validatePageTitle(title)) {
			selectHobbies(Hobbies);
			
			clknext();
		}
	}
		
		
		
	
	

}
