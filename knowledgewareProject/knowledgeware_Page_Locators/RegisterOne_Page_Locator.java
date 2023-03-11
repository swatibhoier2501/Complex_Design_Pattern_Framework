package knowledgeware_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterOne_Page_Locator {
	WebDriver driver = null;
	public RegisterOne_Page_Locator(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//WebElement userName = driver.findElement(By.name("name"));
	@FindBy(name ="name") 
	private WebElement userName;
	
	public WebElement getUserName(){
		return userName;
	}
	
	@FindBy(name ="password") 
	private WebElement password;
	
	public WebElement getPassword(){
		return password;
	}
	
	@FindBy(name ="confirmpassword") 
	private WebElement confirmPassword;
	
	public WebElement getConfirmPassword(){
		return confirmPassword;
	}
	@FindBy(linkText ="LOGIN") 
	private WebElement loginlink1;
	
	public WebElement clkLogin(){
		return loginlink1;
	}

	

	
}
