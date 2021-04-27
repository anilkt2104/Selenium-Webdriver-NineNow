package utilities.ninenow;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;


public class Listeners {
	
	public void TakeScreenShot(WebDriver driver, String testCaseID) throws IOException 
	{

		File directory = new File(String.valueOf("./target/screenshots"));
		if(!directory.exists()){
            directory.mkdir();
		}
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(directory+"/"+testCaseID+".jpg");
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}

	
	public void ScrollDownThePage(WebDriver driver, int scroolHeight) throws IOException 
	{		
		if (scroolHeight==0)
		{
	    //This will scroll the web page till end.		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}
		else
		{
		    //This will scroll the web page till end.		
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,"+scroolHeight+")");
		}		

	}	
	
}
