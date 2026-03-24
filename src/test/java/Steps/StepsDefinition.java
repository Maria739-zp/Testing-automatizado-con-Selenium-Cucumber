package Steps;

import Pages.BasePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefinition {

    BasePage base = new BasePage();
    LoginPage login;

    @Given("que el usuario ingresa a {string}")
            public void navegarA(String url){
            base.navegarA(url);
        login = new LoginPage(BasePage.driver);
        //login.navegarA(url);
    }

    @When("ingresa el usuario {string}")
    public void ingresarUsuario(String usuario){
        login.ingresarUsuario(usuario);
    }

    @And("ingresa contraseña {string}")
    public void ingresarPassword(String password){
        login.ingresarPassword(password);
        System.out.println("Entre al ingresar contraseña");
    }

    @And("hace click en login")
    public void clickElemento(){
        login.clickElemento();
    }

    @Then("podrá acceder a la pagina")
    public void cierre(){
        base.cierre();
    }
}
