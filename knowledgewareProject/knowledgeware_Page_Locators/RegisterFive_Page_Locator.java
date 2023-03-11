package knowledgeware_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterFive_Page_Locator {
	WebDriver driver=null;
	public RegisterFive_Page_Locator(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
      @FindBy(xpath = "//h1[normalize-space()='Welcome to Selenium Automation Testing']")
      private WebElement verify;
       public WebElement geth1() {
	   return verify;
}


}
