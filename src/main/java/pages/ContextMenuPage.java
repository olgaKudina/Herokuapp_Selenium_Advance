package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ContextMenuPage extends BaseGitHubLink {
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }
    public void openContextMenuPage(){
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@href=\"/context_menu\"]")).click();
    }
    public void doubleClickOnBox(){
        Actions action = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.xpath("//*[@id='hot-spot']"));
        action.contextClick(elementLocator).perform();
    }
    public String findElementOnPopup(){
        driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        return alertMessage;
    }
    public void closeAlertPopup(){
        driver.switchTo().alert().accept();
    }
}
