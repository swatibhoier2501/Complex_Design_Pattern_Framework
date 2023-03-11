package knowledgeware_Page_Tests;



import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import common_Component.BaseClass;
import common_Component.Reporter;
import knowledgeware_Page_Actions.RegisterOne_Page_Action;
import knowledgeware_Page_Actions.RegisterFive_Page_Action;
import knowledgeware_Page_Actions.RegisterFour_Page_Action;
import knowledgeware_Page_Actions.RegisterThree_Page_Action;
import knowledgeware_Page_Actions.RegisterTwo_Page_Action;

public class Register_One_Page_XML_DataProvider extends BaseClass {

	@Test
	@Parameters({"pageOneTitle","user","pass","confPass","pageTwoTitle","firstName","lastName","birthday","birthmonth","birthyear",
		"emailid","mobileNo","gender","pageThreeTitle","add","city","pinCode","stateName","country","pageFourTitle","hobby","pageFiveTitle","pageLable"})
	public void registrationTestByParameter(Method method,String title,String user,String pass,String confPass,
			String title2,String firstName, String lastName,String birthDay,String birthMonth,String birthYear,String email,String mobileNumber,String gender,
			String title3,String address, String city,String pinCode, String state, String country,String title4,String hobby,String title5
			) throws IOException {
		
		try {
			RegisterOne_Page_Action regOneAction = new RegisterOne_Page_Action(driver, logger);
			        regOneAction.registrationProcess(title,user,pass,confPass);
			
	        
			RegisterTwo_Page_Action regTwoAction = new RegisterTwo_Page_Action(driver, logger);
	               regTwoAction.registationProcessPageTwo(title2,firstName, lastName, birthDay, birthMonth, birthYear, email, mobileNumber,gender); 

	        RegisterThree_Page_Action regThreeAction = new RegisterThree_Page_Action(driver, logger);
	               regThreeAction.registationProcessPageThree(title3, address, city, pinCode, state, country);

	               
	        RegisterFour_Page_Action regFourAction = new RegisterFour_Page_Action(driver, logger);
	               regFourAction.registrationProcessPageFour(title4,hobby);

	        RegisterFive_Page_Action regFiveAction = new RegisterFive_Page_Action(driver, logger);
	                    regFiveAction.registrationProcessPageFive(title5);


			logger.log(LogStatus.PASS,logger.addScreenCapture(Reporter.takeScreenShot(driver, method))+ " Test Succesfully passed");
		} catch (Exception e) {
			logger.log(LogStatus.FAIL,logger.addScreenCapture(Reporter.takeScreenShot(driver, method))+ e.toString().substring(1, 300));
		}

	}

}
