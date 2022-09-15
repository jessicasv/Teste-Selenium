package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class CadastroPage extends Utils {

    WebDriver driver;

    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    private By titleM = By.id("uniform-id_gender1");
    private By titleF = By.id("uniform-id_gender2");
    private By first_name_field = By.id("customer_firstname");
    private By last_name_field = By.id("customer_lastname");
    private static By password_field = By.id("passwd");
    private By campo_dia = By.id("days");
    private By campo_mes = By.id("months");
    private By campo_ano = By.id("years");
    private By campo_endereco = By.id("address1");
    private By campo_cidade = By.id("city");
    private By campo_estado = By.id("id_state");
    private By campo_zip = By.id("postcode");

    private By campo_pais = By.id("id_country");
    private By campo_celular = By.id("phone_mobile");
    private By campo_amailAlternativo = By.id("alias");
    private By botao_submit = By.id("submitAccount");


    public void selectTitle(Integer value){
        esperarElementoEstarPresente(titleM, 20);
        if (value == 1){
            driver.findElement(titleM).click();
        } else if (value == 2){
            driver.findElement(titleF).click();
        }
    }

    public void preencheNome(String nome){

        driver.findElement(first_name_field).sendKeys(nome);
    }

    public void preencheSobrenome(String sobrenome){

        driver.findElement(last_name_field).sendKeys(sobrenome);
    }

    public void preencheSenha(String senha){

        driver.findElement(password_field).sendKeys(senha);
    }

    public void selecionaDtNasc(Integer dia, Integer mes, String ano){
        Select selecionar_dia = new Select(driver.findElement(campo_dia));
        selecionar_dia.selectByIndex(dia);

        Select selecionar_mes = new Select(driver.findElement(campo_mes));
        selecionar_mes.selectByIndex(mes);

        Select selecionar_ano = new Select(driver.findElement(campo_ano));
        selecionar_ano.selectByValue(ano);
    }

    public void preencheEndereco(String endereco) {
        driver.findElement(campo_endereco).sendKeys(endereco);
    }

    public void preencheCidade(String cidade) {
        driver.findElement(campo_cidade).sendKeys(cidade);
    }

    public void selecionaEstado(String estado) {
        Select selecionar_estado = new Select(driver.findElement(campo_estado));
        selecionar_estado.selectByVisibleText(estado);
    }

    public void preencheZip(String zip) {
        driver.findElement(campo_zip).sendKeys(zip);
    }

    public void selecionaPais(String pais) {
        Select selecionar_pais = new Select(driver.findElement(campo_pais));
        selecionar_pais.selectByVisibleText(pais);
    }

    public void preencheCelular(String celular) {
        driver.findElement(campo_celular).sendKeys(celular);
    }

    public void preencheEmailAlternativo(String emailAlternativo) {
        driver.findElement(campo_amailAlternativo).sendKeys(emailAlternativo);
      //  driver.findElement(campo_amailAlternativo).sendKeys(gerarEmailAleatorio());gerou certinho mas o site deu com o placeholder, preciso procurar como corrigir
    }

    public void clickBotaoSubmit() {
        driver.findElement(botao_submit).click();
    }

    public void validaCadastro(String nome, String sobrenome) {
        esperarElementoEstarPresente(By.className("myaccount-link-list"), 10);
        String resultado_atual = driver.findElement(By.xpath("//a[@title='View my customer account']")).getText();
        Assert.assertEquals(nome + " " + sobrenome, resultado_atual);
    }


}
