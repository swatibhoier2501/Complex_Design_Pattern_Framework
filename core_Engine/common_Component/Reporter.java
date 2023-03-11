package common_Component;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reporter {

	public static String takeScreenShot(WebDriver driver, Method methodName) throws IOException{
		TakesScreenshot takeSS = (TakesScreenshot) driver;

		File sourceOutputFile = takeSS.getScreenshotAs(OutputType.FILE);
		File Dest = new File("./Screenshot/"+methodName.getName()+".png");
		FileUtils.copyFile(sourceOutputFile, new File("./Screenshot/"+methodName.getName()+".png"));
		String errflpath = Dest.getAbsolutePath();
		return errflpath;
	}

}
