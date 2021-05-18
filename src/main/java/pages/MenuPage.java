package pages;

import org.openqa.selenium.WebDriver;

public class MenuPage extends BaseGitHubLink{
    public MenuPage(WebDriver driver){
        super(driver);
    }
    public void openMenuPage(){
        driver.get("http://the-internet.herokuapp.com/");
    }
}
