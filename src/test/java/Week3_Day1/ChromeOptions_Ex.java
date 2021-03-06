package Week3_Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_Ex {
    public static void main(String[] args) {

        //set the property and path to your chromedriver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        //set the conditions for chromeoptions before the webdriver is defined
        ChromeOptions options = new ChromeOptions();
        //set arguments to maximize the driver and make it incognito
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //define the webdriver
        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://www.bing.com");
       // driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop");


    }//end of main method
}//end of java class
