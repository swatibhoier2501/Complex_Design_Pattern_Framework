package common_Functions_Web;

import org.openqa.selenium.WebDriver;

public class WebFrame {

	/**
	 * This method is to Switch to an default iframe
	 * @param driver
	 * @param attributeValue-This is the unique attribute of the frame to be switched
	 */
	public void switchToDefaultFrame(WebDriver driver) {
		try {
			driver.switchTo().defaultContent();
			
		} catch (Exception Ex) {
			System.out.println("Exception occured");
		}
	}

}
