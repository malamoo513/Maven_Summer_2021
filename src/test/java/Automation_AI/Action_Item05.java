package Automation_AI;

import ReusableClasses.ReUsableMethods;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Action_Item05 {
    public static void main(String[] args) throws BiffException, IOException, InterruptedException, WriteException {

//get workbook readable file
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/expressExceldataDriven.xls"));
        //make a copy of workbook readable file into a workbook writeable file
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/expressExceldataDriven_results.xls"), readableFile);
        //accessing the excel sheet from the workbook
        WritableSheet writableSheet = writableFile.getSheet(0);
//return row count
        int rowCount = writableSheet.getRows();

//set the driver
        WebDriver driver = ReUsableMethods.setDriver();

        //for loop to iterate through the test data from excel
       for(int i = 1; i < rowCount; i++) {

         String size = writableSheet.getCell(0,i).getContents();
          String quantity = writableSheet.getCell(1,i).getContents();
        String firstName = writableSheet.getCell(2, i).getContents();
         String lastName = writableSheet.getCell(3, i).getContents();
         String email = writableSheet.getCell(4, i).getContents();
        String phoneNumber = writableSheet.getCell(5, i).getContents();
           String address = writableSheet.getCell(6, i).getContents();
           String postalCode = writableSheet.getCell(7, i).getContents();
          String city = writableSheet.getCell(8, i).getContents();
           String state = writableSheet.getCell(9, i).getContents();
         String deliveryOption = writableSheet.getCell(10, i).getContents();

        //navigate to express.com
        driver.navigate().to("http://express.com/");

        //sleep statement
        Thread.sleep(2000);

        //close pop up
        ReUsableMethods.clickMethod(driver, "//*[@id='closeModal']", "closePopUp");

//hover on men's tab
        ReUsableMethods.mouseHover(driver, "//*[@class='MegaMenu_primaryNav__3G5fm']", 1, "mensTab");

        Thread.sleep(2000);

        //click on polos
        ReUsableMethods.clickMethodByIndex(driver, "//*[contains(text(),'Polos')]", 1, "Polos");

        Thread.sleep(2000);

        //scroll to men's polo
        ReUsableMethods.scrolling(driver, "scrollBy(0, 750)");

//click on first polo
        ReUsableMethods.clickMethod(driver, "//*[@class='cdS1D9eKI7bXTMHp5xeAA']", "first polo");

        Thread.sleep(2000);

        ReUsableMethods.scrolling(driver, "scrollBy(0, 160)");



        //delete cookies
        driver.manage().deleteAllCookies();

        }//end of loop

        //write back to excel
        writableFile.write();

        //close the file
        writableFile.close();

        driver.quit();

    }//end of main method
}//end of Java Class



