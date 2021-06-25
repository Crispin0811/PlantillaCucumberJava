package StepDefinitions;

import io.cucumber.java.en.*;

public class DemoSteps {

    @Given("El usuario esta en login")
    public void demoMethodd() {
        System.out.print("ok");
    }
    @Then("Se muestra la pagina principal y se verifica el nombre de usuario")
    public void demoMethod2(){
        System.out.print("falla");
    }
}
