package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webconnector {

    private static WebDriver driver;
    private static String baseURL;

    public static void setDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/ashmodi/Desktop/chromedriver");
        if(driver == null)
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void setBaseURL(){

        baseURL = "https://www.saucedemo.com";
    }

    public static String getBaseURL(){

        return baseURL;
    }

    public static void inializeTests(){
        setDriver();
        setBaseURL();
    }
}
