package objectRepository.ninenow;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForeignAffairtsPage {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div[1]")
	WebElement sub_prompt;
	
	public ForeignAffairtsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement subscriptionPrompt() {
		return sub_prompt;
	}
	
	public boolean IsSubPromptClosed(String attributeVal) throws InterruptedException  
	{		
		boolean status = false;		
		for (int second = 0; second<=20; second++) {
			if (subscriptionPrompt().getAttribute("class").contains(attributeVal)){
				Thread.sleep(500);
			}
			else 
			{
				status = true;
				break;
			}
	}
		return status;
	}
		
}
