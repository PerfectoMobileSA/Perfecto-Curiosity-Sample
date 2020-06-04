package pages;

import pages.BasePage;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import io.appium.java_client.AppiumDriver;
import utilities.CapabilityLoader;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import utilities.reports.ReportiumReportManager;

// http://perfectolatest.cloud.testinsights.io/app/#!/module-collection/guid/b49b9566-f5db-44b2-ab28-0a6ed7c199ac
@TestModellerModule(guid = "b49b9566-f5db-44b2-ab28-0a6ed7c199ac")
public class Mobile_App_Testing_Free_Trial_Perfecto extends BasePage
{
	public Mobile_App_Testing_Free_Trial_Perfecto (WebDriver driver)
	{
		super(driver);
	}


	
	private By Free_TrialElem = By.xpath("//a[text()='GET STARTED FOR FREE']");

	private By First_NameElem = By.xpath("//*[@id=\"FirstName\"]");

	private By Last_NameElem = By.xpath("//*[@id=\"LastName\"]");

	private By CompanyElem = By.xpath("//*[@id=\"Company\"]");

	private By PhoneElem = By.xpath("//*[@id=\"Phone\"]");

	private By Work_EmailElem = By.xpath("//*[@id=\"Email\"]");

	private By Job_FunctionElem = By.xpath("//*[@id=\"Mobile_Testing_Role__c\"]");

	private By CountryElem = By.xpath("//*[@id=\"Country\"]");

	private By Trial_InterestElem = By.xpath("//*[@id=\"Product_of_Interest__c\"]");

	private By START_FREE_TRIALElem = By.xpath("//BUTTON[@class='mktoButton']");


	
	public void GoToUrl()
	{
        ReportiumReportManager.getReportiumClient().stepStart("GoToUrl");

		m_Driver.get("https://www.perfecto.io/");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://www.perfecto.io/free-trial");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://www.perfecto.io/free-trial");

        ReportiumReportManager.getReportiumClient().stepEnd("GoToUrl");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://www.perfecto.io/free-trial";

        if (!currentUrl.equals("https://www.perfecto.io/free-trial")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Free Trial
     * @name Click Free Trial
     */
	public void Click_Free_Trial()
	{
        ReportiumReportManager.getReportiumClient().stepStart("Click_Free_Trial");

        String firstwindow = CapabilityLoader.getDriver().getWindowHandle();
		WebElement elem = getWebElement(Free_TrialElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Free_Trial", "Click_Free_Trial failed. Unable to locate object: " + Free_TrialElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Free_Trial", "Click_Free_Trial failed. Unable to locate object: " + Free_TrialElem.toString());

			Assert.fail("Unable to locate object: " + Free_TrialElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Free_Trial");

		TestModellerLogger.PassStep(m_Driver, "Click_Free_Trial");
        ReportiumReportManager.getReportiumClient().stepEnd("Click_Free_Trial");
        
        String firstContext = "";
        try {
        	firstContext = ((AppiumDriver)CapabilityLoader.getDriver()).getContext();
			for (Object context : ((AppiumDriver)CapabilityLoader.getDriver()).getContextHandles()) {
				if(context.toString().toLowerCase().contains("visual")) {
					((AppiumDriver)CapabilityLoader.getDriver()).context(context.toString());
					break;
				}
			}
			Map<String, Object> params = new HashMap<>();
			params.put("content", "Allow");
			params.put("threshold", 80);
			((RemoteWebDriver)CapabilityLoader.getDriver()).executeScript("mobile:text:select", params);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				((AppiumDriver)CapabilityLoader.getDriver()).context(firstContext);
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
        for (String iterable_element : CapabilityLoader.getDriver().getWindowHandles()) {
			if(!iterable_element.equals(firstwindow)) {
				CapabilityLoader.getDriver().switchTo().window(iterable_element);
				break;
			}
		}
	}

      
	/**
 	 * Enter *First Name:
     * @name Enter *First Name:
     */
 	public void Enter_First_Name(String First_Name)
 	{
        ReportiumReportManager.getReportiumClient().stepStart("Enter_First_Name");
 	    
        Actions actions = new Actions(CapabilityLoader.getDriver());
        actions.moveToElement(getWebElement(First_NameElem)).perform();
        
 		WebElement elem = getWebElement(First_NameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_First_Name", "Enter_First_Name failed. Unable to locate object: " + First_NameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_First_Name", "Enter_First_Name failed. Unable to locate object: " + First_NameElem.toString());

 			Assert.fail("Unable to locate object: " + First_NameElem.toString());
         }

 		elem.sendKeys(First_Name);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_First_Name " + First_Name);

  		TestModellerLogger.PassStep(m_Driver, "Enter_First_Name " + First_Name);

        ReportiumReportManager.getReportiumClient().stepEnd("Enter_First_Name");
 	}

      
	/**
 	 * Enter *Last Name:
     * @name Enter *Last Name:
     */
 	public void Enter_Last_Name(String Last_Name)
 	{
        ReportiumReportManager.getReportiumClient().stepStart("Enter_Last_Name");
 	    
        Actions actions = new Actions(CapabilityLoader.getDriver());
        actions.moveToElement(getWebElement(Last_NameElem)).perform();
 	    
 		WebElement elem = getWebElement(Last_NameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Last_Name", "Enter_Last_Name failed. Unable to locate object: " + Last_NameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Last_Name", "Enter_Last_Name failed. Unable to locate object: " + Last_NameElem.toString());

 			Assert.fail("Unable to locate object: " + Last_NameElem.toString());
         }

 		elem.sendKeys(Last_Name);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Last_Name " + Last_Name);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Last_Name " + Last_Name);

        ReportiumReportManager.getReportiumClient().stepEnd("Enter_Last_Name");
 	}

      
	/**
 	 * Enter *Company:
     * @name Enter *Company:
     */
 	public void Enter_Company(String Company)
 	{
        ReportiumReportManager.getReportiumClient().stepStart("Enter_Company");
 	    
        Actions actions = new Actions(CapabilityLoader.getDriver());
        actions.moveToElement(getWebElement(CompanyElem)).perform();
 		WebElement elem = getWebElement(CompanyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Company", "Enter_Company failed. Unable to locate object: " + CompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Company", "Enter_Company failed. Unable to locate object: " + CompanyElem.toString());

 			Assert.fail("Unable to locate object: " + CompanyElem.toString());
         }

 		elem.sendKeys(Company);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Company " + Company);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Company " + Company);

        ReportiumReportManager.getReportiumClient().stepEnd("Enter_Company");
 	}

      
	/**
 	 * Enter *Phone:
     * @name Enter *Phone:
     */
 	public void Enter_Phone(String Phone)
 	{
        ReportiumReportManager.getReportiumClient().stepStart("Enter_Phone");
        Actions actions = new Actions(CapabilityLoader.getDriver());
        actions.moveToElement(getWebElement(PhoneElem)).perform();
 	    
 		WebElement elem = getWebElement(PhoneElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Phone", "Enter_Phone failed. Unable to locate object: " + PhoneElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Phone", "Enter_Phone failed. Unable to locate object: " + PhoneElem.toString());

 			Assert.fail("Unable to locate object: " + PhoneElem.toString());
         }

 		elem.sendKeys(Phone);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Phone " + Phone);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Phone " + Phone);

        ReportiumReportManager.getReportiumClient().stepEnd("Enter_Phone");
 	}

      
	/**
 	 * Enter *Work Email:
     * @name Enter *Work Email:
     */
 	public void Enter_Work_Email(String Work_Email)
 	{
        ReportiumReportManager.getReportiumClient().stepStart("Enter_Work_Email");
        Actions actions = new Actions(CapabilityLoader.getDriver());
        actions.moveToElement(getWebElement(Work_EmailElem)).perform();
 	    
 		WebElement elem = getWebElement(Work_EmailElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Work_Email", "Enter_Work_Email failed. Unable to locate object: " + Work_EmailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Work_Email", "Enter_Work_Email failed. Unable to locate object: " + Work_EmailElem.toString());

 			Assert.fail("Unable to locate object: " + Work_EmailElem.toString());
         }

 		elem.sendKeys(Work_Email);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Work_Email " + Work_Email);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Work_Email " + Work_Email);

        ReportiumReportManager.getReportiumClient().stepEnd("Enter_Work_Email");
 	}

    
	/**
 	 * Select *Job Function:
     * @name Select *Job Function:
     */
    public void Select_Job_Function(String Job_Function)
 	{
         ReportiumReportManager.getReportiumClient().stepStart("Select_Job_Function");
         Actions actions = new Actions(CapabilityLoader.getDriver());
         actions.moveToElement(getWebElement(Job_FunctionElem)).perform();
 	    
 		WebElement elem = getWebElement(Job_FunctionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Job_Function", "Select_Job_Function failed. Unable to locate object: " + Job_FunctionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Job_Function", "Select_Job_Function failed. Unable to locate object: " + Job_FunctionElem.toString());

 			Assert.fail("Unable to locate object: " + Job_FunctionElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Job_Function);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Job_Function " + Job_Function);

 		TestModellerLogger.PassStep(m_Driver, "Select_Job_Function " + Job_Function);

        ReportiumReportManager.getReportiumClient().stepEnd("Select_Job_Function");
 	}

    
	/**
 	 * Select *Country:
     * @name Select *Country:
     */
    public void Select_Country(String Country)
 	{
         ReportiumReportManager.getReportiumClient().stepStart("Select_Country");

         Actions actions = new Actions(CapabilityLoader.getDriver());
         actions.moveToElement(getWebElement(CountryElem)).perform();
 		WebElement elem = getWebElement(CountryElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Country", "Select_Country failed. Unable to locate object: " + CountryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Country", "Select_Country failed. Unable to locate object: " + CountryElem.toString());

 			Assert.fail("Unable to locate object: " + CountryElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Country);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Country " + Country);

 		TestModellerLogger.PassStep(m_Driver, "Select_Country " + Country);

        ReportiumReportManager.getReportiumClient().stepEnd("Select_Country");
 	}

    
	/**
 	 * Select *Trial Interest
     * @name Select *Trial Interest
     */
    public void Select_Trial_Interest(String Trial_Interest)
 	{
         ReportiumReportManager.getReportiumClient().stepStart("Select_Trial_Interest");
         Actions actions = new Actions(CapabilityLoader.getDriver());
         actions.moveToElement(getWebElement(Trial_InterestElem)).perform();
 	    
 		WebElement elem = getWebElement(Trial_InterestElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Trial_Interest", "Select_Trial_Interest failed. Unable to locate object: " + Trial_InterestElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Trial_Interest", "Select_Trial_Interest failed. Unable to locate object: " + Trial_InterestElem.toString());

 			Assert.fail("Unable to locate object: " + Trial_InterestElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Trial_Interest);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Trial_Interest " + Trial_Interest);

 		TestModellerLogger.PassStep(m_Driver, "Select_Trial_Interest " + Trial_Interest);

        ReportiumReportManager.getReportiumClient().stepEnd("Select_Trial_Interest");
 	}

     
	/**
 	 * Click START FREE TRIAL
     * @name Click START FREE TRIAL
     */
	public void Click_START_FREE_TRIAL()
	{
        ReportiumReportManager.getReportiumClient().stepStart("Click_START_FREE_TRIAL");

        Actions actions = new Actions(CapabilityLoader.getDriver());
        actions.moveToElement(getWebElement(START_FREE_TRIALElem)).perform();
        
		WebElement elem = getWebElement(START_FREE_TRIALElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_START_FREE_TRIAL", "Click_START_FREE_TRIAL failed. Unable to locate object: " + START_FREE_TRIALElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_START_FREE_TRIAL", "Click_START_FREE_TRIAL failed. Unable to locate object: " + START_FREE_TRIALElem.toString());

			Assert.fail("Unable to locate object: " + START_FREE_TRIALElem.toString());
        }

		((JavascriptExecutor)CapabilityLoader.getDriver()).executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_START_FREE_TRIAL");

		TestModellerLogger.PassStep(m_Driver, "Click_START_FREE_TRIAL");
		
        ReportiumReportManager.getReportiumClient().stepEnd("Click_START_FREE_TRIAL");
	}
}