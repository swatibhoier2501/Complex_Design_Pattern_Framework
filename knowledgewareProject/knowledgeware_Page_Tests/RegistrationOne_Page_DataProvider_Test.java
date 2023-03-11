package knowledgeware_Page_Tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import common_Component.BaseClass;
import common_Component.Reporter;
import knowledgeware_Page_Actions.RegisterOne_Page_Action;
import knowledgeware_Page_Actions.RegisterFive_Page_Action;
import knowledgeware_Page_Actions.RegisterFour_Page_Action;
import knowledgeware_Page_Actions.RegisterThree_Page_Action;
import knowledgeware_Page_Actions.RegisterTwo_Page_Action;

public class RegistrationOne_Page_DataProvider_Test extends BaseClass{
	@Test(dataProvider = "registerPage1",priority=1)
	public void KnowledgewareRegistration(Method method,String pgtTitle,String user,String pass,
			String confpass,String pageTwoTitle,
			String fName,String lname,String bDate,String bMonth,String bYear,String gmail,String
			mobile,String male,String pageThreeTitle,String address,String city,String pincode,String 
			state,String country,String pagefourTitle,String hobbie) throws IOException {
		try {   
			RegisterOne_Page_Action regOnePA = new RegisterOne_Page_Action(driver, logger);
			regOnePA.registrationProcess(pgtTitle,user,pass,confpass);
			RegisterTwo_Page_Action regTwoPA = new RegisterTwo_Page_Action(driver, logger);
			regTwoPA.registationProcessPageTwo(pageTwoTitle,fName,lname,bDate,bMonth,bYear,gmail,mobile,male);
			RegisterThree_Page_Action regThreePA = new RegisterThree_Page_Action(driver, logger);
			regThreePA.registationProcessPageThree(pageThreeTitle,address,city,pincode,state,country);
			RegisterFour_Page_Action regFourPA = new RegisterFour_Page_Action(driver, logger);
			regFourPA.registrationProcessPageFour(pagefourTitle,hobbie);
			RegisterFive_Page_Action regFivePA = new RegisterFive_Page_Action(driver, logger);
			regFivePA.registrationProcessPageFive("Welcome to Selenium Automation Testing");

			//logger.log(LogStatus.PASS,
			logger.addScreenCapture(Reporter.takeScreenShot(driver, method) + " Test Succesfully passed");

		} catch (Exception e) {
		logger.log(LogStatus.FAIL,
				logger.addScreenCapture(Reporter.takeScreenShot(driver, method)) + e.toString().substring(1, 300));
		}
	}
	}
