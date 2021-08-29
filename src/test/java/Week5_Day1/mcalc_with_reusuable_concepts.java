package Week5_Day1;

import ReusableClasses.ReUsableMethods;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class mcalc_with_reusuable_concepts {
    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = ReUsableMethods.setDriver();

//navigate to mlcalc
        driver.navigate().to("https://www.mlcalc.com");
        Thread.sleep(2500);
//clear and enter a purchase price
        ReUsableMethods.sendKeysMethod(driver,"//*[@id='ma']","400000","Purchase Price");
//clear and enter down payment
        ReUsableMethods.sendKeysMethod(driver,"//*[@id='dp']","25","Down Payment");




    }//end of main method
}//end of java class
