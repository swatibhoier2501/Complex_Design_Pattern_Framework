package knowledgeware_Page_Locators;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterFour_Page_Locator {
	WebDriver driver=null;
	public RegisterFour_Page_Locator(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> Hobby;
	public List<WebElement> hobby() {
		return allHobby;
		
	}
	
	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> allHobby;
	public List<WebElement> gethobby() {
		return allHobby;
		
	}
	
	@FindBy(linkText = "NEXT")
	private WebElement next;
	public WebElement getnext() {
		return next;
	}


}
