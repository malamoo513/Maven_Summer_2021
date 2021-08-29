package Google_Page_Object;


import ReusableClasses.ReUsable_Methods_With_Logger;
import ReusableClasses.ReUsable_annotation_class_htmlreport;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends ReUsable_annotation_class_htmlreport {
    ExtentTest logger;
    public SearchResultPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = ReUsable_annotation_class_htmlreport.logger;
    }//end of constructor class

    //set up all the web element xpath locators you need for this page
    @FindBy(xpath = "//*[@id='result-stat']")
    WebElement searchResultText;

    //method to capture the search result and print out only the search number
    public void getSearchNumber(){
       String results = ReUsable_Methods_With_Logger.getText(driver,searchResultText,"Search Result",logger);
       String[] arrayResults = results.split(" ");
       System.out.println("My Search number is " + arrayResults[1]);
       logger.log(LogStatus.INFO,"My Search number is " + arrayResults[1]);
    }//end of get search number




}//end of class
