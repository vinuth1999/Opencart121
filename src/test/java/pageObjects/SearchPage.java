package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[normalize-space()='MacBook']")
	WebElement text;
	
	@FindBy(xpath = "//div[@class='row']//h4")
	List<WebElement> ProductNames;
	
	
	public boolean ProductisDisplayed(String val)
	{
	
	if(val.equalsIgnoreCase("Mac"))
		{
		for(WebElement names:ProductNames)
		{
			if(names.getText().equalsIgnoreCase(val))
			{
				return true;
			}
		
		}
				
	
		}
	return false;
	
	
	}
	
		
		
}
