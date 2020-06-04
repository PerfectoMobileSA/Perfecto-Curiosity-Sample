package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import utilities.reports.ReportiumReportManager;

// http://perfectolatest.cloud.testinsights.io/app/#!/module-collection/guid/86e36d75-3fdc-4966-b11c-f8de8a2b4613
//@TestModellerModule(guid = "86e36d75-3fdc-4966-b11c-f8de8a2b4613")
public class Sign_in_to_GitHub_GitHub extends BasePage
{
	public Sign_in_to_GitHub_GitHub (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Sign_in_Elem = By.xpath("//A[@class='HeaderMenu-link no-underline mr-3']");

	private By _Sign_up_Elem = By.xpath("//A[@class='HeaderMenu-link d-inline-block no-underline border border-gray-dark rounded-1 px-2 py-1']");

	private By UsernameElem = By.xpath("//*[@id=\"user[login]\"]");

	private By EmailElem = By.xpath("//*[@id=\"user[email]\"]");

	private By PasswordElem = By.xpath("//*[@id=\"user[password]\"]");

	private By Sign_up_for_GitHubElem = By.xpath("//BUTTON[@class='btn-mktg btn-primary-mktg btn-large-mktg f4 btn-block my-3']");

	private By _Username_or_email_address_Elem = By.xpath("//*[@id=\"login_field\"]");

	private By _Password_Forgot_password_Elem = By.xpath("//*[@id=\"password\"]");

	private By Sign_inElem = By.xpath("//INPUT[@name='commit']");

	private By _Elem = By.cssSelector("BUTTON[aria-label=\"Dismiss this message\"]:nth-of-type(1)");


	
	public void GoToUrl()
	{
        ReportiumReportManager.getReportiumClient().stepStart("GoToUrl");

		m_Driver.get("https://github.com/");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://github.com/");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://github.com/");

        ReportiumReportManager.getReportiumClient().stepEnd("GoToUrl");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://github.com/session";

        if (!currentUrl.equals("https://github.com/session")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  Sign in 
     * @name Click  Sign in 
     */
	public void Click__Sign_in_()
	{
        ReportiumReportManager.getReportiumClient().stepStart("Click__Sign_in_");

        
		WebElement elem = getWebElement(_Sign_in_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Sign_in_", "Click__Sign_in_ failed. Unable to locate object: " + _Sign_in_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Sign_in_", "Click__Sign_in_ failed. Unable to locate object: " + _Sign_in_Elem.toString());

			Assert.fail("Unable to locate object: " + _Sign_in_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Sign_in_");

		TestModellerLogger.PassStep(m_Driver, "Click__Sign_in_");
		
        ReportiumReportManager.getReportiumClient().stepEnd("Click__Sign_in_");
	}

     
	/**
 	 * Click  Sign up 
     * @name Click  Sign up 
     */
	public void Click__Sign_up_()
	{
        ReportiumReportManager.getReportiumClient().stepStart("Click__Sign_up_");

        
		WebElement elem = getWebElement(_Sign_up_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Sign_up_", "Click__Sign_up_ failed. Unable to locate object: " + _Sign_up_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Sign_up_", "Click__Sign_up_ failed. Unable to locate object: " + _Sign_up_Elem.toString());

			Assert.fail("Unable to locate object: " + _Sign_up_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Sign_up_");

		TestModellerLogger.PassStep(m_Driver, "Click__Sign_up_");
		
        ReportiumReportManager.getReportiumClient().stepEnd("Click__Sign_up_");
	}

      
	/**
 	 * Enter Username
     * @name Enter Username
     */
 	public void Enter_Username(String Username)
 	{
        ReportiumReportManager.getReportiumClient().stepStart("Enter_Username");
 	    
 	    
 		WebElement elem = getWebElement(UsernameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Username", "Enter_Username failed. Unable to locate object: " + UsernameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Username", "Enter_Username failed. Unable to locate object: " + UsernameElem.toString());

 			Assert.fail("Unable to locate object: " + UsernameElem.toString());
         }

 		elem.sendKeys(Username);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Username " + Username);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Username " + Username);

        ReportiumReportManager.getReportiumClient().stepEnd("Enter_Username");
 	}

      
	/**
 	 * Enter Email
     * @name Enter Email
     */
 	public void Enter_Email(String Email)
 	{
        ReportiumReportManager.getReportiumClient().stepStart("Enter_Email");
 	    
 	    
 		WebElement elem = getWebElement(EmailElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Email", "Enter_Email failed. Unable to locate object: " + EmailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Email", "Enter_Email failed. Unable to locate object: " + EmailElem.toString());

 			Assert.fail("Unable to locate object: " + EmailElem.toString());
         }

 		elem.sendKeys(Email);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Email " + Email);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Email " + Email);

        ReportiumReportManager.getReportiumClient().stepEnd("Enter_Email");
 	}

      
	/**
 	 * Enter Password
     * @name Enter Password
     */
 	public void Enter_Password(String Password)
 	{
        ReportiumReportManager.getReportiumClient().stepStart("Enter_Password");
 	    
 	    
 		WebElement elem = getWebElement(PasswordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

 			Assert.fail("Unable to locate object: " + PasswordElem.toString());
         }

 		elem.sendKeys(Password);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Password " + Password);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Password " + Password);

        ReportiumReportManager.getReportiumClient().stepEnd("Enter_Password");
 	}

     
	/**
 	 * Click Sign up for GitHub
     * @name Click Sign up for GitHub
     */
	public void Click_Sign_up_for_GitHub()
	{
        ReportiumReportManager.getReportiumClient().stepStart("Click_Sign_up_for_GitHub");

        
		WebElement elem = getWebElement(Sign_up_for_GitHubElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sign_up_for_GitHub", "Click_Sign_up_for_GitHub failed. Unable to locate object: " + Sign_up_for_GitHubElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sign_up_for_GitHub", "Click_Sign_up_for_GitHub failed. Unable to locate object: " + Sign_up_for_GitHubElem.toString());

			Assert.fail("Unable to locate object: " + Sign_up_for_GitHubElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Sign_up_for_GitHub");

		TestModellerLogger.PassStep(m_Driver, "Click_Sign_up_for_GitHub");
		
        ReportiumReportManager.getReportiumClient().stepEnd("Click_Sign_up_for_GitHub");
	}

      
	/**
 	 * Enter  Username or email address 
     * @name Enter  Username or email address 
     */
 	public void Enter__Username_or_email_address_(String _Username_or_email_address_)
 	{
        ReportiumReportManager.getReportiumClient().stepStart("Enter__Username_or_email_address_");
 	    
 	    
 		WebElement elem = getWebElement(_Username_or_email_address_Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter__Username_or_email_address_", "Enter__Username_or_email_address_ failed. Unable to locate object: " + _Username_or_email_address_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter__Username_or_email_address_", "Enter__Username_or_email_address_ failed. Unable to locate object: " + _Username_or_email_address_Elem.toString());

 			Assert.fail("Unable to locate object: " + _Username_or_email_address_Elem.toString());
         }

 		elem.sendKeys(_Username_or_email_address_);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter__Username_or_email_address_ " + _Username_or_email_address_);

  		TestModellerLogger.PassStep(m_Driver, "Enter__Username_or_email_address_ " + _Username_or_email_address_);

        ReportiumReportManager.getReportiumClient().stepEnd("Enter__Username_or_email_address_");
 	}

      
	/**
 	 * Enter  Password Forgot password? 
     * @name Enter  Password Forgot password? 
     */
 	public void Enter__Password_Forgot_password_(String _Password_Forgot_password_)
 	{
        ReportiumReportManager.getReportiumClient().stepStart("Enter__Password_Forgot_password_");
 	    
 	    
 		WebElement elem = getWebElement(_Password_Forgot_password_Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter__Password_Forgot_password_", "Enter__Password_Forgot_password_ failed. Unable to locate object: " + _Password_Forgot_password_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter__Password_Forgot_password_", "Enter__Password_Forgot_password_ failed. Unable to locate object: " + _Password_Forgot_password_Elem.toString());

 			Assert.fail("Unable to locate object: " + _Password_Forgot_password_Elem.toString());
         }

 		elem.sendKeys(_Password_Forgot_password_);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter__Password_Forgot_password_ " + _Password_Forgot_password_);

  		TestModellerLogger.PassStep(m_Driver, "Enter__Password_Forgot_password_ " + _Password_Forgot_password_);

        ReportiumReportManager.getReportiumClient().stepEnd("Enter__Password_Forgot_password_");
 	}

     
	/**
 	 * Click Sign in
     * @name Click Sign in
     */
	public void Click_Sign_in()
	{
        ReportiumReportManager.getReportiumClient().stepStart("Click_Sign_in");

        
		WebElement elem = getWebElement(Sign_inElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sign_in", "Click_Sign_in failed. Unable to locate object: " + Sign_inElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sign_in", "Click_Sign_in failed. Unable to locate object: " + Sign_inElem.toString());

			Assert.fail("Unable to locate object: " + Sign_inElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Sign_in");

		TestModellerLogger.PassStep(m_Driver, "Click_Sign_in");
		
        ReportiumReportManager.getReportiumClient().stepEnd("Click_Sign_in");
	}

     
	/**
 	 * Click  
     * @name Click  
     */
	public void Click__()
	{
        ReportiumReportManager.getReportiumClient().stepStart("Click__");

        
		WebElement elem = getWebElement(_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

			Assert.fail("Unable to locate object: " + _Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__");

		TestModellerLogger.PassStep(m_Driver, "Click__");
		
        ReportiumReportManager.getReportiumClient().stepEnd("Click__");
	}
}