package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DescontosStep {

    WebDriver driver = new ChromeDriver();
    @Dado("que estou no site da Qazando")
    public void que_estou_no_site_da_qazando() {
        driver.manage().window().maximize();
        driver.get("https://qazando.com.br/curso.html");
    }

    @Quando("preencho meu endereco de email")
    public void preencho_meu_endereco_de_email() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);

        driver.findElement(By.id("email")).sendKeys("teste@email.com");
    }

    @Quando("clico no botao ganhar cupom")
    public void clico_no_botao_ganhar_cupom() {
        driver.findElement(By.id("button")).click();
    }

    @Entao("vejo o codigo de desconto")
    public void vejo_o_codigo_de_desconto() {
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        System.out.println(texto_cupom);

        driver.quit();
    }


}
