/*

package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DemoGoogleStepByStep {

    WebDriver driver = null;

    //ABRIR EL SELENIUM DRIVER
    @Given("Ir a google")
    public void IrAGoogle() {
        //PARA HACER EL PATH RELATIVO
        String projectPath = System.getProperty("user.dir");
        System.out.print("Estas en google");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
    }

    @When("ir a la pagina de google")
    public void IrPaginaGoogle() {
        driver.navigate().to("https://www.google.com/");
    }

    @Then("Escribir en la caja de busqueda")
    public void escribirAlgo() throws InterruptedException {
        String texto = "Animales";
        driver.findElement(By.name("q")).sendKeys(texto);
        Thread.sleep(2000);
    }

    @And("Presinar enter")
    public void presionarEnter() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    @Then("Verificar que aparesca algo en la busqueda")
    public void verificarContenido() {
        driver.getPageSource().contains("Online Courses");
        driver.close();
        driver.quit();
    }


}

*/
