package Automation_AI;

import ReusableClasses.ReUsableMethods;
import ReusableClasses.ReUsable_annotation_class;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Action_Item06 extends ReUsable_annotation_class {

    //declare the global variables outside the annotation methods
    Workbook readableFile;
    WritableWorkbook writableFile;
    WritableSheet writableSheet;
    int rowCount;

    //precondition for Aetna
    @BeforeSuite
    public void setTheDriverAndWorkbook() throws IOException, BiffException {
        //locate the readable file path
        readableFile = Workbook.getWorkbook(new File("src/main/resources/Action_ItemAetna.xls"));
        //create a writable file
        writableFile = Workbook.createWorkbook(new File("src/main/resources/Action_ItemAetna_Results.xls"), readableFile);
        //accessing the excel sheet from the workbook
        writableSheet = writableFile.getSheet(0);
        //row count will return all the rows which is not empty
        rowCount = writableSheet.getRows();

    }//end of before suite

    @Test
    public void AetnaIteration() throws InterruptedException, WriteException {
        for (int i = 1; i < 2; i++) {
            String zipCode = writableSheet.getCell(0, i).getContents();
            String miles = writableSheet.getCell(1, i).getContents();
            //String doctorLocation = writableSheet.getCell(2, i).getContents();

//go to aetna.com and verify the title is Health Insurance Plans
            driver.navigate().to("http://aetna.com/");
            Thread.sleep(2500);
            ReUsableMethods.verifyPageTitle(driver, "Health Insurance Plans | Aetna");
            //click on Shop for a plan
            ReUsableMethods.clickMethod(driver, "//*[text()='Shop for a plan']", "shop for a plan");
            //hoover on Medicare
            ReUsableMethods.mouseHover1(driver, "//*[text()='Medicare']", "medicare");
            //click on Find a Doctor
            ReUsableMethods.clickMethod(driver, "//*[text()='Find a doctor ']", "find doctor");
            Thread.sleep(2500);
            //click on 2021 medicare plans you purchase yourself
            ReUsableMethods.clickMethod(driver, "//*[@class='primaryPurple BtnWidth mgbutton w400']", "medicare plan self purchase");
//enter a zipcode
            ReUsableMethods.sendKeysMethod(driver, "//*[@id='medZip']", zipCode, "zipcode field");
            Thread.sleep(1500);
//click on zipcode
            ReUsableMethods.clickMethod(driver, "//*[text()='" + zipCode + "']", "clickZipCode");
            Thread.sleep(2000);
            //on the slider bar select a mile
            ReUsableMethods.sliderSendKeysMethod(driver, "//*[@class='rz-pointer rz-pointer-min']", 25, miles, "zipcode");
            //click on skip plan selection
            ReUsableMethods.clickMethod(driver, "//*[text()='Skip plan selection*']", "skip plan selection");
            //click on medical doctors & specialist
            Thread.sleep(1500);
            ReUsableMethods.clickMethod(driver, "//*[@class ='mobileMarAdj anchorTagGuided']", "click medical doctors & specialist");
            //click on all primary care physicians
            Thread.sleep(1500);
            ReUsableMethods.clickMethod(driver, "//*[@class='search-block image-block-purple']", " click all pcp");
            //click all primary care physicians
            ReUsableMethods.clickMethod(driver, "//*[@class='result-description focusForIE']", " click all pcp");
            //capture the first result and send it back to excel doctorLocation column
            String doctorLocation = ReUsableMethods.getText(driver, "//*[@class='mobileFont14px dataGridPadding']", "capture doctor location");
            System.out.println();
            Label label = new Label(2, i, doctorLocation);
            writableSheet.addCell(label);
            //delete cookies
            driver.manage().deleteAllCookies();
        }//end of loop
    }//end of @test

    @AfterSuite
    public void writeExcelAndQuitDriver() throws IOException, WriteException {
        writableFile.write();
        writableFile.close();
    }//end of @aftersuite

}//end of java class
