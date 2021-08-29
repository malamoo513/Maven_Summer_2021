package Automation_AI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class Action_Item04 {
    public static void main(String[] args) throws InterruptedException {

        //set up webdriver manager to handle dynamic browser versions
        WebDriverManager.chromedriver().setup();
        //Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);

        //arraylist for first name
        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("Robert");
        firstName.add("David");
        firstName.add("Dan");
        //arraylist for last name
        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Kiyosaki");
        lastName.add("Goggins");
        lastName.add("Pena");
        //arraylist for DOB
        ArrayList<String> dob = new ArrayList<>();
        dob.add("04/08/1947");
        dob.add("02/17/1975");
        dob.add("08/10/1945");
        //arraylist for zipcode
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("75020");
        zipCode.add("73344");
        zipCode.add("75022");
        //arraylist for planID
        ArrayList<String> planId = new ArrayList<>();
        planId.add("4081947");
        planId.add("2171975");
        planId.add("8101945");

        //iterate through the array list
        for (int i = 0; i < firstName.size(); i++) {

            //navigate to United Healthcare website
            driver.navigate().to("https://uhc.com/");

            //sleep statement
            Thread.sleep(2500);

            //click on "find a doctor" using mouse actions
            Actions mouseMove = new Actions(driver);
            try {
                System.out.println("Clicking on find a doctor");
                WebElement findDoctor = driver.findElement(By.xpath("//a[text()='Find a doctor']"));
                mouseMove.moveToElement(findDoctor).click().perform();
            } catch (Exception err) {
                System.out.println(" Unable to click on find a doctor button" + err);
            }//end of send tab exception

            //sleep statement
            Thread.sleep(2500);

//choose Medicare plan from the sign in dropdown using click value by text
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll(0,500)");
            try {
                System.out.println("Clicking on the dropdown");
                driver.findElement(By.xpath("//*[@class='jump-menu__content-wrapper color-greyDark weight-regular']")).click();
            } catch (Exception err) {
                System.out.println(" Unable to click on the dropdown" + err);
            }//end of send tab exception

            //sleep statement
            Thread.sleep(2500);

            try {
                System.out.println("Clicking on medicare plan");
                driver.findElements(By.xpath("//*[@class='jump-menu__link-items p-2 m-0 display-block weight-bold']")).get(1).click();
            } catch (Exception err) {
                System.out.println(" Unable to click on medicare plan " + err);
            }//end of send tab exception

            //sleep statement
            Thread.sleep(2500);

            //switch to the new tab
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));

            //sleep statement
            Thread.sleep(2500);

            //click on "register now"
            try {
                System.out.println("Clicking on register now");
                driver.findElement(By.xpath("//*[@class='uhc-tempo-button uhc-tempo-button--secondary uhc-tempo-button--link']")).click();
            } catch (Exception err) {
                System.out.println(" Unable to register now" + err);
            }//end of send tab exception

            //sleep statement
            Thread.sleep(1500);

            //enter first name
            try {
                System.out.println("Entering first name");
                WebElement ent_firstName = driver.findElement(By.xpath("//*[@id='piFirstName']"));
                ent_firstName.clear();
                ent_firstName.sendKeys(firstName.get(i));
            } catch (Exception err) {
                System.out.println(" Unable to enter first name " + err);
            }//end of send tab exception

            //sleep statement
            Thread.sleep(1700);

            //enter last name
            try {
                System.out.println("Entering last name");
                WebElement ent_lastName = driver.findElement(By.xpath("//*[@id='piLastName']"));
                ent_lastName.clear();
                ent_lastName.sendKeys(lastName.get(i));
            } catch (Exception err) {
                System.out.println(" Unable to enter last name " + err);
            }//end of send tab exception

            //sleep statement
            Thread.sleep(1700);

            //enter dob
            try {
                System.out.println("Entering dob");
                WebElement ent_dob = driver.findElement(By.xpath("//*[@id='piDoB']"));
                ent_dob.clear();
                ent_dob.sendKeys(dob.get(i));
            } catch (Exception err) {
                System.out.println(" Unable to enter dob " + err);
            }//end of send tab exception

            //sleep statement
            Thread.sleep(1700);

            //enter zipcode
            try {
                System.out.println("Entering zipcode");
                WebElement ent_zipcode = driver.findElement(By.xpath("//*[@id='piZipCode']"));
                ent_zipcode.clear();
                ent_zipcode.sendKeys(zipCode.get(i));
            } catch (Exception err) {
                System.out.println(" Unable to enter zipcode " + err);
            }//end of send tab exception

            //sleep statement
            Thread.sleep(1700);

        //enter plan id
            try {
                System.out.println("Entering plan id");
                WebElement ent_planid = driver.findElement(By.xpath("//*[@id='piMemberId4Mnr']"));
                ent_planid.clear();
                ent_planid.sendKeys(planId.get(i));
            } catch (Exception err) {
                System.out.println(" Unable to enter plan id " + err);
            }//end of send tab exception

            //sleep statement
            Thread.sleep(1700);

            //click continue
            try {
                System.out.println("Clicking on continue");
                driver.findElement(By.xpath("//*[@class='ng-binding']")).click();
            } catch (Exception err) {
                System.out.println(" Unable to click on continue " + err);
            }//end of send tab exception

            //sleep statement
            Thread.sleep(1700);

            //capture the error message and print it out
            try {
                System.out.println("Capturing and printing error message");
            driver.findElement(By.xpath("//*[@class='ng-scope']"));
            String result = driver.findElement(By.xpath("//*[@id='pageErrors']")).getText();
            System.out.println(result);
            } catch (Exception err) {
                System.out.println(" Unable to capture and print error message " + err);
            }//end of send tab exception

            //sleep statement
            Thread.sleep(1700);

            //close the current tab
            driver.close();

            //switch back to previous tab
            driver.switchTo().window(tabs.get(0));

            //sleep statement
            Thread.sleep(2500);

        }//end of loop

        driver.quit();

    }//end of Main method
}//end of Java Class

