package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class DynamicControlsPage extends BaseGitHubLink {
    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }


    public void openDynamicControlsPage() {
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@href=\"/dynamic_controls\"]")).click();
    }

    public void selectCheckBoxAndRemove() {
        driver.findElement(By.xpath("//*[@type='checkbox']")).click();
        driver.findElement(By.xpath("//*[text()='Remove']")).click();
    }

    public void waitForMessageDisplayedCheckboxGone() {
        WebElement element = driver.findElement(By.id("message"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElement(element, "It's gone!"));
    }

    public void checkboxIsNotDisplayed() {
        int numberOfElements = driver.findElements(By.xpath("//*[@type='checkbox']")).size();
        Assert.assertEquals(numberOfElements, 0);
    }

    public void inputIsDisabled() {
        driver.findElement(By.xpath("//*[@type='text']")).isDisplayed();
    }

    public void clickEnableButton() {
        driver.findElement(By.xpath("//*[text()='Enable']")).click();
    }

    public void waitForTextDisplayedEnabledButton() {
        WebElement element = driver.findElement(By.id("message"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElement(element, "It's enabled!"));
    }
    public void inputIsEnabled(){
        driver.findElement(By.xpath("//*[@type='text']")).isEnabled();
    }
}