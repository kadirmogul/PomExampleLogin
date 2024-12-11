import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By usernameTextLocator=By.id("username");
    private By userPasswordTextLocator=By.id("password");
    private By buttonClickLocator=By.id("submit");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void enterUserName(String username){
        driver.findElement(usernameTextLocator).sendKeys(username);
    }
    public void enterUserPassword(String password){
        driver.findElement(userPasswordTextLocator).sendKeys(password);
    }
    public void submitButtonClick(){
        driver.findElement(buttonClickLocator).click();
    }
}
