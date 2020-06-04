package tests;

import reports.ReportiumTestListener;
import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.CapabilityLoader;
import utilities.testmodeller.TestModellerLogger;

//http://perfectolatest.cloud.testinsights.io/app/#!/model-engine/guid/7a811439-2749-41f5-a7c3-6df6ee5786bf
//@Listeners({TestNGListener.class})
//@TestModellerSuite(id = 3, profileId = 100004)
public class PerfectoFreeTrailRegistrationTest_DefaultProfile extends TestBase
{
   
    @Test  (groups= {"cfa3112a-901e-4876-b88b-2044bf18cf9a","PerfectoFreeTrailRegistrationTest","PerfectoFreeTrailRegistrationTest - Default Profile"})
    @TestModellerPath(guid = "cfa3112a-901e-4876-b88b-2044bf18cf9a")
    public void GoToUrlClickFreeTrialMovetoFirstnamePositiveEnterFirstNamePositiveEnterLastNamePositiveEnterPh1()
    {
        
        pages.Mobile_App_Testing_Free_Trial_Perfecto _pagesMobile_App_Testing_Free_Trial_Perfecto = new pages.Mobile_App_Testing_Free_Trial_Perfecto(CapabilityLoader.getDriver());
    TestModellerLogger.SetLastNodeGuid("ac6b07d0-e442-4a6a-8013-dd23d75f610b");
    _pagesMobile_App_Testing_Free_Trial_Perfecto.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7039440e-cfeb-41c0-bee8-7699e90e68d8");
    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_Free_Trial();
    


    TestModellerLogger.SetLastNodeGuid("7830f64f-c574-49e9-89e3-845b6842f3b5");
    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_First_Name("Lola");
    

    TestModellerLogger.SetLastNodeGuid("a89232e9-4c8e-4417-a644-1652b71c62fb");
    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Last_Name("DuBuque");
    

    TestModellerLogger.SetLastNodeGuid("7c9db93d-6195-4a55-9f7e-a7c29cd08e8b");
    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Phone("1-226-491-6916");
    

    TestModellerLogger.SetLastNodeGuid("efa931c8-1a29-4248-bd8c-899db8fff98d");
    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Work_Email("");
    

    TestModellerLogger.SetLastNodeGuid("83bb3c45-fe63-4edd-a47e-55fadced0d94");
    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Company("Ondricka and Sons");
    

    TestModellerLogger.SetLastNodeGuid("666a0c0d-23f8-4fd5-86be-0500aae56fef");
    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_START_FREE_TRIAL();
    

    }

    @Test  (groups= {"9a67a661-931c-4244-8778-03b6ed477cc0","PerfectoFreeTrailRegistrationTest","PerfectoFreeTrailRegistrationTest - Default Profile"})
    @TestModellerPath(guid = "9a67a661-931c-4244-8778-03b6ed477cc0")
    public void GoToUrlClickFreeTrialMovetoFirstnamePositiveEnterFirstNamePositiveEnterLastNamePositiveEnterPh2()
    {
        
        pages.Mobile_App_Testing_Free_Trial_Perfecto _pagesMobile_App_Testing_Free_Trial_Perfecto = new pages.Mobile_App_Testing_Free_Trial_Perfecto(CapabilityLoader.getDriver());
    TestModellerLogger.SetLastNodeGuid("ac6b07d0-e442-4a6a-8013-dd23d75f610b");
    _pagesMobile_App_Testing_Free_Trial_Perfecto.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7039440e-cfeb-41c0-bee8-7699e90e68d8");
    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_Free_Trial();
     

    TestModellerLogger.SetLastNodeGuid("7830f64f-c574-49e9-89e3-845b6842f3b5");
    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_First_Name("Madge");
    

    TestModellerLogger.SetLastNodeGuid("a89232e9-4c8e-4417-a644-1652b71c62fb");
    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Last_Name("Miller");
    

    TestModellerLogger.SetLastNodeGuid("7c9db93d-6195-4a55-9f7e-a7c29cd08e8b");
    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Phone("638.815.5476 x265");
    

    TestModellerLogger.SetLastNodeGuid("efa931c8-1a29-4248-bd8c-899db8fff98d");
    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Work_Email("");
    

    TestModellerLogger.SetLastNodeGuid("e2904503-b2e2-470f-98b4-ee1c68bb9e80");
    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Company("");
    

    TestModellerLogger.SetLastNodeGuid("666a0c0d-23f8-4fd5-86be-0500aae56fef");
    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_START_FREE_TRIAL();
    

    }

//    @Test  (groups= {"580fb02b-22d4-4a51-ab7b-c7785677fd92","PerfectoFreeTrailRegistrationTest","PerfectoFreeTrailRegistrationTest - Default Profile"})
//    @TestModellerPath(guid = "580fb02b-22d4-4a51-ab7b-c7785677fd92")
//    public void GoToUrlClickFreeTrialMovetoFirstnamePositiveEnterFirstNamePositiveEnterLastNamePositiveEnterPh3()
//    {
//        
//        pages.Mobile_App_Testing_Free_Trial_Perfecto _pagesMobile_App_Testing_Free_Trial_Perfecto = new pages.Mobile_App_Testing_Free_Trial_Perfecto(CapabilityLoader.getDriver());
//    TestModellerLogger.SetLastNodeGuid("ac6b07d0-e442-4a6a-8013-dd23d75f610b");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7039440e-cfeb-41c0-bee8-7699e90e68d8");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_Free_Trial();
//    
//    TestModellerLogger.SetLastNodeGuid("7830f64f-c574-49e9-89e3-845b6842f3b5");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_First_Name("Stephen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a89232e9-4c8e-4417-a644-1652b71c62fb");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Last_Name("Bode");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7c9db93d-6195-4a55-9f7e-a7c29cd08e8b");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Phone("467.585.4418 x269");
//    
//
//    TestModellerLogger.SetLastNodeGuid("efa931c8-1a29-4248-bd8c-899db8fff98d");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Work_Email("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("e2904503-b2e2-470f-98b4-ee1c68bb9e80");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Company("#!_ @");
//    
//
//    TestModellerLogger.SetLastNodeGuid("666a0c0d-23f8-4fd5-86be-0500aae56fef");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_START_FREE_TRIAL();
//    
//
//    }
//
//    @Test  (groups= {"9089ef10-e8de-4558-9ebd-01eda52c25c7","PerfectoFreeTrailRegistrationTest","PerfectoFreeTrailRegistrationTest - Default Profile"})
//    @TestModellerPath(guid = "9089ef10-e8de-4558-9ebd-01eda52c25c7")
//    public void GoToUrlClickFreeTrialMovetoFirstnamePositiveEnterFirstNamePositiveEnterLastNameNegativeEnterPh4()
//    {
//        
//        pages.Mobile_App_Testing_Free_Trial_Perfecto _pagesMobile_App_Testing_Free_Trial_Perfecto = new pages.Mobile_App_Testing_Free_Trial_Perfecto(CapabilityLoader.getDriver());
//    TestModellerLogger.SetLastNodeGuid("ac6b07d0-e442-4a6a-8013-dd23d75f610b");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7039440e-cfeb-41c0-bee8-7699e90e68d8");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_Free_Trial();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7830f64f-c574-49e9-89e3-845b6842f3b5");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_First_Name("Wava");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a89232e9-4c8e-4417-a644-1652b71c62fb");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Last_Name("Hettinger");
//    
//
//    TestModellerLogger.SetLastNodeGuid("06327144-66d1-4135-8f56-6f0f14705c16");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Phone("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("efa931c8-1a29-4248-bd8c-899db8fff98d");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Work_Email("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("83bb3c45-fe63-4edd-a47e-55fadced0d94");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Company("Glover - Windler");
//    
//
//    TestModellerLogger.SetLastNodeGuid("666a0c0d-23f8-4fd5-86be-0500aae56fef");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_START_FREE_TRIAL();
//    
//
//    }
//
//    @Test  (groups= {"be8e1a36-0501-42d2-a417-bde3a52ea8cf","PerfectoFreeTrailRegistrationTest","PerfectoFreeTrailRegistrationTest - Default Profile"})
//    @TestModellerPath(guid = "be8e1a36-0501-42d2-a417-bde3a52ea8cf")
//    public void GoToUrlClickFreeTrialMovetoFirstnamePositiveEnterFirstNamePositiveEnterLastNameNegativeEnterPh5()
//    {
//        
//        pages.Mobile_App_Testing_Free_Trial_Perfecto _pagesMobile_App_Testing_Free_Trial_Perfecto = new pages.Mobile_App_Testing_Free_Trial_Perfecto(CapabilityLoader.getDriver());
//    TestModellerLogger.SetLastNodeGuid("ac6b07d0-e442-4a6a-8013-dd23d75f610b");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7039440e-cfeb-41c0-bee8-7699e90e68d8");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_Free_Trial();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7830f64f-c574-49e9-89e3-845b6842f3b5");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_First_Name("Marco");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a89232e9-4c8e-4417-a644-1652b71c62fb");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Last_Name("Osinski");
//    
//
//    TestModellerLogger.SetLastNodeGuid("06327144-66d1-4135-8f56-6f0f14705c16");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Phone("#!_ @");
//    
//
//    TestModellerLogger.SetLastNodeGuid("efa931c8-1a29-4248-bd8c-899db8fff98d");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Work_Email("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("83bb3c45-fe63-4edd-a47e-55fadced0d94");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Company("Pouros - Adams");
//    
//
//    TestModellerLogger.SetLastNodeGuid("666a0c0d-23f8-4fd5-86be-0500aae56fef");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_START_FREE_TRIAL();
//    
//
//    }
//
//    @Test  (groups= {"b0b0ba0b-e49f-4006-b8cb-e7c3fab8f646","PerfectoFreeTrailRegistrationTest","PerfectoFreeTrailRegistrationTest - Default Profile"})
//    @TestModellerPath(guid = "b0b0ba0b-e49f-4006-b8cb-e7c3fab8f646")
//    public void GoToUrlClickFreeTrialMovetoFirstnamePositiveEnterFirstNameNegativeEnterLastNamePositiveEnterPh6()
//    {
//        
//        pages.Mobile_App_Testing_Free_Trial_Perfecto _pagesMobile_App_Testing_Free_Trial_Perfecto = new pages.Mobile_App_Testing_Free_Trial_Perfecto(CapabilityLoader.getDriver());
//    TestModellerLogger.SetLastNodeGuid("ac6b07d0-e442-4a6a-8013-dd23d75f610b");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7039440e-cfeb-41c0-bee8-7699e90e68d8");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_Free_Trial();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7830f64f-c574-49e9-89e3-845b6842f3b5");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_First_Name("Robbie");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9ef532cc-d6ea-42c0-ab47-f15cc96358ae");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Last_Name("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7c9db93d-6195-4a55-9f7e-a7c29cd08e8b");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Phone("278.290.8891 x340");
//    
//
//    TestModellerLogger.SetLastNodeGuid("efa931c8-1a29-4248-bd8c-899db8fff98d");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Work_Email("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("83bb3c45-fe63-4edd-a47e-55fadced0d94");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Company("Adams, Kertzmann and Okuneva");
//    
//
//    TestModellerLogger.SetLastNodeGuid("666a0c0d-23f8-4fd5-86be-0500aae56fef");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_START_FREE_TRIAL();
//    
//
//    }
//
//    @Test  (groups= {"15341c85-5678-450d-9902-86da8e7d6528","PerfectoFreeTrailRegistrationTest","PerfectoFreeTrailRegistrationTest - Default Profile"})
//    @TestModellerPath(guid = "15341c85-5678-450d-9902-86da8e7d6528")
//    public void GoToUrlClickFreeTrialMovetoFirstnamePositiveEnterFirstNameNegativeEnterLastNamePositiveEnterPh7()
//    {
//        
//        pages.Mobile_App_Testing_Free_Trial_Perfecto _pagesMobile_App_Testing_Free_Trial_Perfecto = new pages.Mobile_App_Testing_Free_Trial_Perfecto(CapabilityLoader.getDriver());
//    TestModellerLogger.SetLastNodeGuid("ac6b07d0-e442-4a6a-8013-dd23d75f610b");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7039440e-cfeb-41c0-bee8-7699e90e68d8");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_Free_Trial();
//   
//
//    TestModellerLogger.SetLastNodeGuid("7830f64f-c574-49e9-89e3-845b6842f3b5");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_First_Name("Leland");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9ef532cc-d6ea-42c0-ab47-f15cc96358ae");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Last_Name("#!_ @");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7c9db93d-6195-4a55-9f7e-a7c29cd08e8b");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Phone("235-649-8003");
//    
//
//    TestModellerLogger.SetLastNodeGuid("efa931c8-1a29-4248-bd8c-899db8fff98d");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Work_Email("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("83bb3c45-fe63-4edd-a47e-55fadced0d94");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Company("Ortiz and Sons");
//    
//
//    TestModellerLogger.SetLastNodeGuid("666a0c0d-23f8-4fd5-86be-0500aae56fef");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_START_FREE_TRIAL();
//    
//
//    }
//
//    @Test  (groups= {"24114a1f-e748-4777-8515-1e3b264bae08","PerfectoFreeTrailRegistrationTest","PerfectoFreeTrailRegistrationTest - Default Profile"})
//    @TestModellerPath(guid = "24114a1f-e748-4777-8515-1e3b264bae08")
//    public void GoToUrlClickFreeTrialMovetoFirstnameNegativeEnterFirstNamePositiveEnterLastNamePositiveEnterPh8()
//    {
//        
//        pages.Mobile_App_Testing_Free_Trial_Perfecto _pagesMobile_App_Testing_Free_Trial_Perfecto = new pages.Mobile_App_Testing_Free_Trial_Perfecto(CapabilityLoader.getDriver());
//    TestModellerLogger.SetLastNodeGuid("ac6b07d0-e442-4a6a-8013-dd23d75f610b");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7039440e-cfeb-41c0-bee8-7699e90e68d8");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_Free_Trial();
//   
//
//    TestModellerLogger.SetLastNodeGuid("bdb75dc6-9653-4d0f-a938-15835f705556");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_First_Name("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a89232e9-4c8e-4417-a644-1652b71c62fb");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Last_Name("Bartoletti");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7c9db93d-6195-4a55-9f7e-a7c29cd08e8b");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Phone("285-940-7655");
//    
//
//    TestModellerLogger.SetLastNodeGuid("efa931c8-1a29-4248-bd8c-899db8fff98d");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Work_Email("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("83bb3c45-fe63-4edd-a47e-55fadced0d94");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Company("Tillman - Schultz");
//    
//
//    TestModellerLogger.SetLastNodeGuid("666a0c0d-23f8-4fd5-86be-0500aae56fef");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_START_FREE_TRIAL();
//    
//
//    }
//
//    @Test  (groups= {"0db86476-34be-442a-920f-18806248a4b9","PerfectoFreeTrailRegistrationTest","PerfectoFreeTrailRegistrationTest - Default Profile"})
//    @TestModellerPath(guid = "0db86476-34be-442a-920f-18806248a4b9")
//    public void GoToUrlClickFreeTrialMovetoFirstnameNegativeEnterFirstNamePositiveEnterLastNamePositiveEnterPh9()
//    {
//        
//        pages.Mobile_App_Testing_Free_Trial_Perfecto _pagesMobile_App_Testing_Free_Trial_Perfecto = new pages.Mobile_App_Testing_Free_Trial_Perfecto(CapabilityLoader.getDriver());
//    TestModellerLogger.SetLastNodeGuid("ac6b07d0-e442-4a6a-8013-dd23d75f610b");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7039440e-cfeb-41c0-bee8-7699e90e68d8");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_Free_Trial();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bdb75dc6-9653-4d0f-a938-15835f705556");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_First_Name("#!_ @");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a89232e9-4c8e-4417-a644-1652b71c62fb");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Last_Name("Bartell");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7c9db93d-6195-4a55-9f7e-a7c29cd08e8b");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Phone("1-737-489-3090");
//    
//
//    TestModellerLogger.SetLastNodeGuid("efa931c8-1a29-4248-bd8c-899db8fff98d");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Work_Email("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("83bb3c45-fe63-4edd-a47e-55fadced0d94");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Enter_Company("Parker Inc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("666a0c0d-23f8-4fd5-86be-0500aae56fef");
//    _pagesMobile_App_Testing_Free_Trial_Perfecto.Click_START_FREE_TRIAL();
//    
//
//    }

}
