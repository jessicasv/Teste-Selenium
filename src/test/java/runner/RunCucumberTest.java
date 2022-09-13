package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"steps"},
        features = "src/test/resources/features",
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/cucumber/"},
        stepNotifications = true,
        tags = "@cadastro-sucesso"
)

public class RunCucumberTest {

   public static WebDriver driver;
   @BeforeClass
    public static void start() {
       driver = new ChromeDriver();
       System.out.println("Iniciado");

    }
    @AfterClass
    public static void stop() {

       driver.quit();
    }
}
