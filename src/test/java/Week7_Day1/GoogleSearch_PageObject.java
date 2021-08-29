package Week7_Day1;

import Google_Page_Object.BaseClass;
import ReusableClasses.ReUsable_annotation_class_htmlreport;
import org.testng.annotations.Test;

public class GoogleSearch_PageObject extends ReUsable_annotation_class_htmlreport {

    @Test
    public void SearchSomethingOnGoogleHome() throws InterruptedException {
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2500);
        BaseClass.homePage().searchAKeyword("Cars");
        BaseClass.homePage().googleSearchSubmit();
    }//end of test 1

    @Test(dependsOnMethods = "SearchSomethingOnGoogleHome")
    public void GetSearchNumber() throws InterruptedException {
        Thread.sleep(2500);
        BaseClass.searchResultPage().getSearchNumber();
    }//end of test 2









}//end of class
