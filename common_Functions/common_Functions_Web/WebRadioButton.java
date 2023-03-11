package common_Functions_Web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebRadioButton {

	public static void radioClick(WebElement radioval, ExtentTest logger) {
		if(WebElementCommon.isClickable(radioval)){
			radioval.click();
			logger.log(LogStatus.PASS,"Gender clicked successfully");
		}else{
			logger.log(LogStatus.FAIL,"Unable to click on Gender");
		}
		
		
	}
	
	public static void radioBtnClick(WebElement btnClicked) {			
		if(!btnClicked.isSelected()) {
			btnClicked.click();
		}		
	}
  //Selecting Radio Button in Selenium-WebDriver
	public static void selectRadioButton(WebDriver driver, By locator, String value){ 
		List<WebElement> select = driver.findElements(locator);
	
	for (WebElement element : select){
	if (element.getAttribute("value").equalsIgnoreCase(value)){
	element.click();
	}
	}
}

}
