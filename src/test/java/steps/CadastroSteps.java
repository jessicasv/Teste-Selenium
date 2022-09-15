package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CadastroPage;
import pages.LoginPage;
import runner.RunCucumberTest;
import support.Utils;


public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage(driver);

    String nome = "Jessica";
    String sobrenome = "SV";

    @Quando("preencho o formulario de cadastro")
    public void preencho_o_formulario_de_cadastro() {
        cadastroPage.selectTitle(1);
        cadastroPage.preencheNome(nome);
        cadastroPage.preencheSobrenome(sobrenome);
        cadastroPage.preencheSenha("senhaSegura123%");
        cadastroPage.selecionaDtNasc(10, 10, "2000");
        cadastroPage.preencheEndereco("Rua Legal");
        cadastroPage.preencheCidade("San Juan");
        cadastroPage.selecionaEstado("Puerto Rico");
        cadastroPage.preencheZip("00604");
        cadastroPage.selecionaPais("United States");
        cadastroPage.preencheCelular("11233214567");
        cadastroPage.preencheEmailAlternativo("@mail.com");
    }
    @Quando("clico em registrar")
    public void clico_em_registrar() {
        cadastroPage.clickBotaoSubmit();

    }
    @Entao("vejo cadastro realizado com sucesso")
    public void vejo_cadastro_realizado_com_sucesso() {
        cadastroPage.validaCadastro(nome, sobrenome);

    }
}
