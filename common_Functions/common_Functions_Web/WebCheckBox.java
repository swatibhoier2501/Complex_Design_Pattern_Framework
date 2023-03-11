package common_Functions_Web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebCheckBox {

	//Below method is used to De-select a Checkbox, if it is selected already
		public static void deSelectCheckbox(WebElement element, ExtentTest logger) {
			try {
	            if (element.isSelected()) {
	            	//De-select the checkbox
	                element.click();
	                logger.log(LogStatus.PASS, element+ " Selected succesfully.");
	    		} else {
	            	System.out.println("Checkbox: "+element+"is already deselected");
	            	
	            }
	        } catch (Exception e) {
	        	System.out.println("Unable to deselect checkbox: "+element);
	        	logger.log(LogStatus.FAIL, element+ " not Selected.");
	        }
	    }	
		//Below method is used to Select a Checkbox, if it is not selected already
		public static void selectCheckBox(WebElement element,String value,ExtentTest logger) {
			try {
	            if (element.isSelected()) {
	               System.out.println("Checkbox: " + element + "is already selected");
	               logger.log(LogStatus.PASS, element+ " Selected succesfully.");
	            } else {
	            	// Select the checkbox
	                element.click();
	            }
	        } catch (Exception e) {
	        	System.out.println("Unable to select the checkbox: " + element);
	        	logger.log(LogStatus.FAIL, element+ " not Selected.");
	        }
			
		}
		public void selectCheckBoxfromList(WebElement element, String valueToSelect) {
			List<WebElement> allOptions = element.findElements(By.tagName("input"));
			for (WebElement option : allOptions) {
				   System.out.println("Option value "+option.getText());
				        if (valueToSelect.equals(option.getText())) {
				            option.click();
				            break;
				        }
				    }
		
		
	}
		public static void select_Check_Box(List<WebElement> checkboxes, String[] data, ExtentTest logger) {
		for(WebElement checkBox:checkboxes) {
				String checkBoxType=checkBox.getAttribute("value");
				System.out.println(checkBoxType);
				for(int i=0;i<data.length;i++) {
					if(checkBoxType.contains(data[i])) {  //select only array value
						if(!checkBox.isSelected()) {
							checkBox.click();
							logger.log(LogStatus.PASS, data[i]+ " Checked succesfully.");
						}
					}else {
						System.out.println(data[i] + "alredy selected");
					}
					
				}
				}
				
			}
		public static void CheckBox(List<WebElement> webElement, String value, ExtentTest logger) {
			for(WebElement checkBox:webElement) {
					String checkBoxType=checkBox.getAttribute("value");
				 for(int i=0;i<value.length();i++) {
					if(checkBoxType.contains(value))
							if(!checkBox.isSelected()) {
								checkBox.click();
								logger.log(LogStatus.PASS, value+ " Checked succesfully.");
							
						}else {
							System.out.println(value + "alredy selected");
						}
						
					}
					
				}
		
		}
			


	 }


