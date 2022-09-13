package pages;

import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarTelaLogin() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        esperarElementoEstarPresente();
    }
}
