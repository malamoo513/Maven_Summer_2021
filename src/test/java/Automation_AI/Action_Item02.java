package Automation_AI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_Item02 {
    public static void main(String[] args) throws InterruptedException {

        //set the cryptocurrencies as variables for dynamic array
        String[] cryptocurrencies = new String[3];
        cryptocurrencies[0] = "Dogecoin";
        cryptocurrencies[1] = "Cardano";
        cryptocurrencies[2] = "Bitcoin";

        //set the property and path to your chromedriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //define the chrome driver
        WebDriver driver = new ChromeDriver();

        //using for loop to iterate through these values
        for (int i = 0; i < cryptocurrencies.length; i++) {
            //navigate to bing search page
            driver.navigate().to("https://www.bing.com");

            //maximize the browser
            driver.manage().window().maximize();

            //sleep statement
            Thread.sleep(3000);

            //identify the search field and enter a keyword 'dogecoin, cardano, bitcoin'
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cryptocurrencies[i]);

            //hit submit on the search icon
            driver.findElement(By.xpath("//*[@name='search']")).submit();

            //sleep statement
            Thread.sleep(3000);

            //capture the search result and only print out the number
            String result = driver.findElement(By.xpath("//*[@id='b_tween']")).getText();

            //extract out the number from the search result and print it using split
            String[] arrayResult = result.split(" ");

            //print statements
            System.out.println("My search number for major cryptocurrencies  " + cryptocurrencies[i] + " is " + arrayResult[0]);

        }// end of loop

        driver.quit();

    }//end of main method
}//end of java class
