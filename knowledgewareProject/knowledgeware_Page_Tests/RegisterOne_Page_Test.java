package knowledgeware_Page_Tests;

import java.io.IOException;
import java.lang.reflect.Method;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import common_Component.BaseClass;
import common_Component.Reporter;
import dataSource.PropertyReader;
import knowledgeware_Page_Actions.RegisterOne_Page_Action;
import knowledgeware_Page_Actions.RegisterFive_Page_Action;
import knowledgeware_Page_Actions.RegisterFour_Page_Action;
import knowledgeware_Page_Actions.RegisterThree_Page_Action;
import knowledgeware_Page_Actions.RegisterTwo_Page_Action;

public class RegisterOne_Page_Test extends BaseClass {
	@Test
	public void KnowledgewareRegistration(Method method) throws IOException {
		try {
			RegisterOne_Page_Action regOnePA = new RegisterOne_Page_Action(driver, logger);
			regOnePA.registrationProcess(PropertyReader.getKeyValue("pageOneTitle"), 
					PropertyReader.getKeyValue("user"),
					PropertyReader.getKeyValue("pass"), 
					PropertyReader.getKeyValue("confpass"));
			RegisterTwo_Page_Action regTwoPA = new RegisterTwo_Page_Action(driver, logger);
			regTwoPA.registationProcessPageTwo(PropertyReader.getKeyValue("pageTwoTitle"),
					PropertyReader.getKeyValue("fName"), 
					PropertyReader.getKeyValue("lname"),
					PropertyReader.getKeyValue("bDate"), 
					PropertyReader.getKeyValue("bMonth"),
					PropertyReader.getKeyValue("bYear"), 
					PropertyReader.getKeyValue("gmail"),
					PropertyReader.getKeyValue("mobile"), 
					PropertyReader.getKeyValue("male"));
			RegisterThree_Page_Action regThreePA = new RegisterThree_Page_Action(driver, logger);
			regThreePA.registationProcessPageThree(PropertyReader.getKeyValue("pageThreeTitle"),
					PropertyReader.getKeyValue("address"), 
					PropertyReader.getKeyValue("city"),
					PropertyReader.getKeyValue("pincode"),
					PropertyReader.getKeyValue("state"),
					PropertyReader.getKeyValue("country"));

			RegisterFour_Page_Action regFourPA = new RegisterFour_Page_Action(driver, logger);
			regFourPA.registrationProcessPageFour(PropertyReader.getKeyValue("pagefourTitle"),
					                              PropertyReader.getMultipleValue("hobbie"));
		
			RegisterFive_Page_Action regFivePA = new RegisterFive_Page_Action(driver, logger);

			regFivePA.registrationProcessPageFive("Welcome to Selenium Automation Testing");

			logger.log(LogStatus.PASS,
					logger.addScreenCapture(Reporter.takeScreenShot(driver, method)) + " Test Succesfully passed");

		} catch (Exception e) {
			logger.log(LogStatus.FAIL,
					logger.addScreenCapture(Reporter.takeScreenShot(driver, method)) + e.toString().substring(1, 300));
		}
	}

}
