package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {
    WebDriver driver;

    private static By criar_campo_email = By.id("email_create");
    private By criar_botao_email = By.id("SubmitCreate");

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public void acessarTelaLogin() {
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        esperarElementoEstarPresente(criar_campo_email, 20);
    }

    public void preencherCampoEmail(){

        driver.findElement(criar_campo_email).sendKeys(gerarEmailAleatorio());
    }

    public void clicarBotaoCriarConta(){

        driver.findElement(criar_botao_email).click();
    }
}
