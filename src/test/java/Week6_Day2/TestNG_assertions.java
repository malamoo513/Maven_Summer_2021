package Week6_Day2;

import ReusableClasses.ReUsableMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class TestNG_assertions {

    WebDriver driver;

    @BeforeSuite
    public void setDriver() throws IOException {
        driver = ReUsableMethods.setDriver();
    }//end of test
    @Test
    public void testScenario() throws InterruptedException {
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2500);
        //verify the title says 'Google' using hard assert
        //Assert.assertEquals("google",driver.getTitle());

        //soft Assert is more beneficial
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("google",driver.getTitle());
        //click on Sign in
        ReUsableMethods.clickMethod(driver,"//*[text()='Sign in']","Sign In Button");

        //verifying the title using if else condition
        String actualTitle = driver.getTitle();
        if(actualTitle.equals("Google")){
            System.out.println("Title matches");
        } else {
            System.out.println("Title doesn't match " + actualTitle);
        }//end of get title condition




        //need to call assertAll command to capture the exception at the end
        softAssert.assertAll();
    }//end of test







}//end of java class
