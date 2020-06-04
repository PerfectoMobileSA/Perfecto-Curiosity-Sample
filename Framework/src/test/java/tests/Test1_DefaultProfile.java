package tests;

import reports.ReportiumTestListener;
import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.CapabilityLoader;
import utilities.testmodeller.TestModellerLogger;

//http://perfectolatest.cloud.testinsights.io/app/#!/model-engine/guid/c4e61d3e-66d1-4b1e-9349-29c0a9e1ca62
//@Listeners({TestNGListener.class})
@TestModellerSuite(id = 1, profileId = 100003)
public class Test1_DefaultProfile extends TestBase
{
	@Test  (groups= {"64f1195a-ba3d-4911-8b4a-e0bbf293a200","Test1","Test1 - Default Profile"})
	@TestModellerPath(guid = "64f1195a-ba3d-4911-8b4a-e0bbf293a200")
	public void GoToUrlClickSigninPositiveEnterUsernameoremailaddressPositiveEnterPasswordForgotpassword1()
	{

		pages.Sign_in_to_GitHub_GitHub _pagesSign_in_to_GitHub_GitHub = new pages.Sign_in_to_GitHub_GitHub(CapabilityLoader.getDriver());
		TestModellerLogger.SetLastNodeGuid("b9b346f5-a8e1-43a4-aae5-2095123f5ff6");
		_pagesSign_in_to_GitHub_GitHub.GoToUrl();


		TestModellerLogger.SetLastNodeGuid("bf2ce268-7329-43c3-b930-a30a2e3b52ed");
		_pagesSign_in_to_GitHub_GitHub.Click__Sign_in_();


		TestModellerLogger.SetLastNodeGuid("2b4780d5-cafd-4ede-a8fe-6b51d18dfb49");
		_pagesSign_in_to_GitHub_GitHub.Enter__Username_or_email_address_("127 Maggio Ferry, East Elainaburgh, Northern Mariana Islands");


		TestModellerLogger.SetLastNodeGuid("142a6a59-e0e4-4b73-9923-7a748e3a783a");
		_pagesSign_in_to_GitHub_GitHub.Enter__Password_Forgot_password_("jcgMS_b4y6");


	}

	@Test  (groups= {"17eecc84-4964-462e-b332-60f0e1d101ef","Test1","Test1 - Default Profile"})
	@TestModellerPath(guid = "17eecc84-4964-462e-b332-60f0e1d101ef")
	public void GoToUrlClickSigninPositiveEnterUsernameoremailaddressNegativeEnterPasswordForgotpassword2()
	{

		pages.Sign_in_to_GitHub_GitHub _pagesSign_in_to_GitHub_GitHub = new pages.Sign_in_to_GitHub_GitHub(CapabilityLoader.getDriver());
		TestModellerLogger.SetLastNodeGuid("b9b346f5-a8e1-43a4-aae5-2095123f5ff6");
		_pagesSign_in_to_GitHub_GitHub.GoToUrl();


		TestModellerLogger.SetLastNodeGuid("bf2ce268-7329-43c3-b930-a30a2e3b52ed");
		_pagesSign_in_to_GitHub_GitHub.Click__Sign_in_();


		TestModellerLogger.SetLastNodeGuid("2b4780d5-cafd-4ede-a8fe-6b51d18dfb49");
		_pagesSign_in_to_GitHub_GitHub.Enter__Username_or_email_address_("9414 Margret Harbors, Laurettaton, United Arab Emirates");


		TestModellerLogger.SetLastNodeGuid("83e3a3fb-8a31-4030-aff0-8196c10a3276");
		_pagesSign_in_to_GitHub_GitHub.Enter__Password_Forgot_password_("#!_ @");


	}

	    @Test  (groups= {"fd9f6539-f2bc-4521-ac79-1bef18dd078b","Test1","Test1 - Default Profile"})
	    @TestModellerPath(guid = "fd9f6539-f2bc-4521-ac79-1bef18dd078b")
	    public void GoToUrlClickSigninNegativeEnterUsernameoremailaddressPositiveEnterPasswordForgotpassword3()
	    {
	        
	        pages.Sign_in_to_GitHub_GitHub _pagesSign_in_to_GitHub_GitHub = new pages.Sign_in_to_GitHub_GitHub(CapabilityLoader.getDriver());
	    TestModellerLogger.SetLastNodeGuid("b9b346f5-a8e1-43a4-aae5-2095123f5ff6");
	    _pagesSign_in_to_GitHub_GitHub.GoToUrl();
	    
	
	    TestModellerLogger.SetLastNodeGuid("bf2ce268-7329-43c3-b930-a30a2e3b52ed");
	    _pagesSign_in_to_GitHub_GitHub.Click__Sign_in_();
	    
	
	    TestModellerLogger.SetLastNodeGuid("6bd91059-546e-41e5-87af-da2dce14eaf0");
	    _pagesSign_in_to_GitHub_GitHub.Enter__Username_or_email_address_("");
	    
	
	    TestModellerLogger.SetLastNodeGuid("142a6a59-e0e4-4b73-9923-7a748e3a783a");
	    _pagesSign_in_to_GitHub_GitHub.Enter__Password_Forgot_password_("VkYMx6O1R5");
	    
	
	    }
	
	    @Test  (groups= {"5cabb8b5-0aca-4063-969f-4a97d5a3a0a2","Test1","Test1 - Default Profile"})
	    @TestModellerPath(guid = "5cabb8b5-0aca-4063-969f-4a97d5a3a0a2")
	    public void GoToUrlClickSigninNegativeEnterUsernameoremailaddressPositiveEnterPasswordForgotpassword4()
	    {
	        
	        pages.Sign_in_to_GitHub_GitHub _pagesSign_in_to_GitHub_GitHub = new pages.Sign_in_to_GitHub_GitHub(CapabilityLoader.getDriver());
	    TestModellerLogger.SetLastNodeGuid("b9b346f5-a8e1-43a4-aae5-2095123f5ff6");
	    _pagesSign_in_to_GitHub_GitHub.GoToUrl();
	    
	
	    TestModellerLogger.SetLastNodeGuid("bf2ce268-7329-43c3-b930-a30a2e3b52ed");
	    _pagesSign_in_to_GitHub_GitHub.Click__Sign_in_();
	    
	
	    TestModellerLogger.SetLastNodeGuid("6bd91059-546e-41e5-87af-da2dce14eaf0");
	    _pagesSign_in_to_GitHub_GitHub.Enter__Username_or_email_address_("#!_ @");
	    
	
	    TestModellerLogger.SetLastNodeGuid("142a6a59-e0e4-4b73-9923-7a748e3a783a");
	    _pagesSign_in_to_GitHub_GitHub.Enter__Password_Forgot_password_("cCjwOGjK6K");
	    
	
	    }

}
