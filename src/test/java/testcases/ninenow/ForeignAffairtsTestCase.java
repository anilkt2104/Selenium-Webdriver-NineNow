package testcases.ninenow;

import objectRepository.ninenow.ForeignAffairtsPage;
import utilities.ninenow.Listeners;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForeignAffairtsTestCase {

	@Test (priority = 2, description="Validating Priority Prompt")
	private void CapabilityEdgeFunction() throws IOException, InterruptedException
	{			
		BrowserSetting bs = new BrowserSetting();
		WebDriver driver = bs.BrowserSettings();
		
		ForeignAffairtsPage capaEdge = new ForeignAffairtsPage(driver);
		Listeners utils = new Listeners();	
		String subPromptClass = capaEdge.subscriptionPrompt().getAttribute("class");	
		
		//Validate if the Subscription Prompt Appears
		Assert.assertEquals(subPromptClass, "Y7Y5d _1SN2c", "Step-02: Subscription Prompt Found On The Capability Edge Page");
	
		//Take the screenshot
		utils.TakeScreenShot(driver, "Step-02_CapabilityEdgePage");	
	
		//Scroll Down the Page
		utils.ScrollDownThePage(driver, 0);
        
		//Take the screenshot
		utils.TakeScreenShot(driver, "Step-03_CapabilityEdgePage");	
		
		//Calculate if prompt closes within 10 seconds
		boolean subPromptStatus = capaEdge.IsSubPromptClosed(subPromptClass);
		
		//Step-04 - Validate that the prompt closes within 10 seconds
		Assert.assertEquals(subPromptStatus, true, "Step-05: Subscription Prompt Closed Within 10 Seconds");	
	
		//Take the screenshot
		utils.TakeScreenShot(driver, "Step-06_CapabilityEdgePage");		
		driver.close();
	}

	
}
