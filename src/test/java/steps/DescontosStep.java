package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;

public class DescontosStep extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @Dado("que estou no site da Qazando")
    public void que_estou_no_site_da_qazando() {
        homePage.acessarAplicacao();
    }

    @Quando("preencho meu endereco de email")
    public void preencho_meu_endereco_de_email() throws InterruptedException {
        homePage.scrollDown();
        homePage.preencherEmail();
    }

    @Quando("clico no botao ganhar cupom")
    public void clico_no_botao_ganhar_cupom() {
        homePage.clicarBotao();
    }

    @Entao("vejo o codigo de desconto")
    public void vejo_o_codigo_de_desconto() {
        homePage.verificarDesconto();
    }

}
