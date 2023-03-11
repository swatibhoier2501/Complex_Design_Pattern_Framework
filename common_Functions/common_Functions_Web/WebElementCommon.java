package common_Functions_Web;

import org.openqa.selenium.WebElement;

public class WebElementCommon {
	public static boolean isPresent(WebElement element) {
		boolean isPre = false;
		if (element.isDisplayed()) {
			isPre = true;
		}
		return isPre;

	}

	public static boolean isClickable(WebElement element){
		boolean isClick=false;
		if(isPresent(element)){
			if(element.isEnabled()){
				isClick=true;
		}
		}
		return isClick;
		
	}

	public static String getAttributText(WebElement label) {
		String text =label.getText();
		return text;
	}
}
