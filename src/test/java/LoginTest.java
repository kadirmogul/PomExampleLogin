import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest(){
        driver.get("https://practicetestautomation.com/practice-test-login/");
        loginPage.enterUserName("student");
        loginPage.enterUserPassword("Password123");
        loginPage.submitButtonClick();
    }
}
