package ReusableClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class ReUsable_annotation_class {

    public static WebDriver driver;

    @BeforeSuite
    public void setTheDriver() throws IOException {
        driver = ReUsableMethods.setDriver();
    }//end of before suite

    @AfterSuite
    public void quiteSession(){
        driver.quit();
    }//end of after suite



}//end of java class
