package Google_Page_Object;


import ReusableClasses.ReUsable_Methods_With_Logger;
import ReusableClasses.ReUsable_annotation_class_htmlreport;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends ReUsable_annotation_class_htmlreport {
    ExtentTest logger;
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = ReUsable_annotation_class_htmlreport.logger;
    }//end of constructor class

    //set up all the web element xpath locators you need for this page
    @FindBy(xpath = "//*[@name='q']")
    WebElement searchField;
    @FindBy(xpath = "//*[@name='btnK']")
    WebElement googleSearchButton;

    //method to type on search field
    public void searchAKeyword(String userValue){
        ReUsable_Methods_With_Logger.sendKeysMethod(driver,searchField,userValue,"Search Field",logger);
    }//end of search field method

    //method hitting submit on google search
    public void googleSearchSubmit(){
        ReUsable_Methods_With_Logger.submitMethod(driver,googleSearchButton,"Google Search Button",logger);
    }//end of google search button method





}//end of class
