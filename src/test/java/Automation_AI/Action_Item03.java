package Automation_AI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Action_Item03 {
    public static void main(String[] args) throws InterruptedException {

        //set the zipcodes as variables for dynamic array
        String[] zipcodes = new String[3];
        zipcodes[0] = "11204";
        zipcodes[1] = "11214";
        zipcodes[2] = "11101";

        //set up webdriver manager to handle dynamic browser versions
        WebDriverManager.chromedriver().setup();
        //Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        //options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);

        //using for loop to iterate through these zipcodes
        for (int i = 0; i < zipcodes.length; i++) {

            //navigate to weight watchers.com
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop");

            //sleep statement
            Thread.sleep(3000);

            //click on the studio link using find Elements concept
            driver.findElements(By.xpath("//*[@class='toggleButton-2ikVW']")).get(1).click();
            //webelement for search field
            WebElement searfie = driver.findElement(By.xpath("//*[@id='location-search']"));
            //clear zipcodes in search field
            searfie.clear();
            //enter the zipcodes
            searfie.sendKeys(zipcodes[i]);

            //sleep statement
            Thread.sleep(2000);

            //hit submit
            searfie.submit();

            //sleep statement
            Thread.sleep(3000);

            if (i == 0) {
                driver.findElements(By.xpath("//*[@class='linkContainer-1NkqM']")).get(0).click();
            }
            if (i == 1) {
                driver.findElements(By.xpath("//*[@class='linkContainer-1NkqM']")).get(1).click();
            }
            if (i == 2) {
                driver.findElements(By.xpath("//*[@class='linkContainer-1NkqM']")).get(2).click();
            }//end of conditional statement

            //sleep statement
            Thread.sleep(3000);

            //capture and print the addresses from the zipcodes
            driver.findElement(By.xpath("//*[@class='infoContainer-12kv1']"));
            String result = driver.findElement(By.xpath("//*[@class='infoContainer-12kv1']")).getText();
            String[] aresult = result.split("Studio reopened");
            System.out.println(aresult[0]);

            //sleep statement
            Thread.sleep(3000);

            //scroll down using javascript executor to almost at the bottom of the page where it shows hours capture and print it
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll(0,920)");
            String result1 = driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-1RfmF']")).getText();
            System.out.println(result1);

        }// end of for loop statement

        driver.quit();

    }//end of main method
}//end of Java Class




