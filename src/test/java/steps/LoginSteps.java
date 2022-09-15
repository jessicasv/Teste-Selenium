package steps;

import io.cucumber.java.pt.Dado;
import pages.LoginPage;
import runner.RunCucumberTest;
import support.Utils;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage(driver);

    @Dado("que estou na tela de login")
    public void que_estou_na_tela_de_login() {
        loginPage.acessarTelaLogin();

    }

    @Dado("acesso a tela de cadastro de usuario")
    public void acesso_a_tela_de_cadastro_de_usuario() {
        loginPage.preencherCampoEmail();
        loginPage.clicarBotaoCriarConta();

    }
}
