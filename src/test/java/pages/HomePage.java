package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class HomePage extends Utils {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() {
        driver.manage().window().maximize();
        driver.get("https://qazando.com.br/curso.html");
        esperarElementoEstarPresente(By.id("btn-ver-cursos"), 10);
        Assert.assertEquals("Não acessou a aplicação!",true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);
    }

    public void preencherEmail() {
        driver.findElement(By.id("email")).sendKeys("teste@email.com");
    }

    public void clicarBotao() {
        driver.findElement(By.id("button")).click();
    }

    public void verificarDesconto() {
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("Cupom incorreto","QAZANDO15OFF", texto_cupom);
    }

    }

