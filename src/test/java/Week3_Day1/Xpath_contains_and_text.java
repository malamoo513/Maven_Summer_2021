package Week3_Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_contains_and_text {
    public static void main(String[] args) throws InterruptedException {

        //set up webdriver manager to handle dynamic browser versions
        WebDriverManager.chromedriver().setup();
        //Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);

        //navigating to metlife page
        driver.navigate().to("https://www.metlife.com");
        Thread.sleep(3000);
        //click on solutions
        //when a property value has long value or white space before or after the value then
        //contains command is needed in xpath statement
        driver.findElement(By.xpath("//*[contains(text(),'SOLUTIONS')]")).click();


    }//end of main method
}//end of java class
