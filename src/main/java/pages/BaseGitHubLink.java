package pages;

import org.openqa.selenium.WebDriver;

abstract class BaseGitHubLink {
    WebDriver driver;

    public BaseGitHubLink (WebDriver driver){
        this.driver = driver;
    }
}
