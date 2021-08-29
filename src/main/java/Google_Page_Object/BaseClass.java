package Google_Page_Object;


import ReusableClasses.ReUsable_annotation_class_htmlreport;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends ReUsable_annotation_class_htmlreport {
    public BaseClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor class

    //create static reference for google home page
    public static HomePage homePage(){
        HomePage homePage = new HomePage(driver);
        return  homePage;
    }//end of googleHomePage method

    //create static reference for search result page
    public static SearchResultPage searchResultPage(){
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        return  searchResultPage;
    }//end of search result page method


}//end of class
