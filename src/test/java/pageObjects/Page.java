package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static util.Webconnector.getDriver;

public abstract class Page {

    public void waitForTheElementToBeClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void click(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }
}