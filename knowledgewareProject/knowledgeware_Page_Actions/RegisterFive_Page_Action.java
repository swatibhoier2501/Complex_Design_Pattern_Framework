package knowledgeware_Page_Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.relevantcodes.extentreports.ExtentTest;
import common_Functions_Web.WebElementCommon;
import knowledgeware_Page_Locators.RegisterFive_Page_Locator;
public class RegisterFive_Page_Action {
	WebDriver driver=null;
	public ExtentTest logger=null;
	public RegisterFive_Page_Locator regFivePL=null;
	public RegisterFive_Page_Action(WebDriver driver,ExtentTest logger) {
		regFivePL=new RegisterFive_Page_Locator(driver);
		
	}
	
	public void verifyPage(String masgVal) {
		WebElement msg=regFivePL.geth1();
		String msgtitle=WebElementCommon.getAttributText(msg);
		if(msgtitle.contains(msgtitle)) {
			System.out.println("registration complete sucessufully");
		}
	}
	   public void registrationProcessPageFive(String masgVal) {
            verifyPage(masgVal);
		
	}


	


}
