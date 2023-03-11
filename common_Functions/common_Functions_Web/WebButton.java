package common_Functions_Web;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebButton {
	public static void click(WebElement button,ExtentTest logger) {
		if (WebElementCommon.isClickable(button)) {
			button.click();
			logger.log(LogStatus.PASS, "Tab Clicked Succesfully.");
		}
		logger.log(LogStatus.FAIL, " Unable to Clicked Successfully");
	}

	public static void clicked(WebElement button,ExtentTest logger) {
		if (WebElementCommon.isClickable(button)) {
			button.click();
			
		}
	}
	public static void clickingOnWebElement(WebDriver driver, WebElement element, long waitTimeInSeconds) {
		WebDriverWait webWait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
		WebElement elements = null;
		elements = webWait.until(ExpectedConditions.elementToBeClickable(element));
		elements.click();

	}

}
