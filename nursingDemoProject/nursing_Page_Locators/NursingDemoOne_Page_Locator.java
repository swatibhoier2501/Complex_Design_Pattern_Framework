package nursing_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NursingDemoOne_Page_Locator {
	WebDriver driver = null;
	public NursingDemoOne_Page_Locator(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//WebElement userName = driver.findElement(By.name("name"));
	@FindBy(id ="Username") 
	private WebElement userName;
	public WebElement getUserName(){
		return userName;
	}
	
	@FindBy(id ="Password") 
	private WebElement password;
	public WebElement getPassword(){
	return password;
	}
	
	@FindBy(xpath ="//input[@value='Login']") 
	private WebElement login;
	public WebElement clickLogin(){
	return login;
	}
//Added new link Employee Management
@FindBy(xpath="//span[@class='text-light-blue']")
	private WebElement empmanagement;
	public WebElement getEmpolyeeManagement()
	{
		return empmanagement;
	}

	
}
