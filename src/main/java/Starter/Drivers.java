package Starter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Drivers {
    WebDriver driver;
    @BeforeTest
    @Parameters("browserName")
    public void DriverClass(String Browser) {


        if(Browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\BrowserDrivers\\geckodriver.exe");


            driver = new FirefoxDriver();

        }
        else if(Browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\BrowserDrivers\\chromedriver.exe");


            driver = new ChromeDriver();

        }
        else if(Browser.equalsIgnoreCase("IE")){
            System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\BrowserDrivers\\msedgedriver.exe");



            driver = new EdgeDriver();

        }


        driver.get("https://www.carwale.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



    }
}
