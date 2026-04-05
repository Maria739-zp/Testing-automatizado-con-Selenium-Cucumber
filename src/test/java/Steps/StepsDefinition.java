package Steps;

import Pages.BasePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepsDefinition {

    BasePage base = new BasePage();
    LoginPage login;

    @Given("que el usuario ingresa a {string}")
    public void navegarA(String url) {
        base.navegarA(url);
        login = new LoginPage(BasePage.driver);
        //login.navegarA(url);
    }

    @When("ingresa el usuario {string}")
    public void ingresarUsuario(String usuario) {
        login.ingresarUsuario(usuario);
    }

    @And("ingresa contraseña {string}")
    public void ingresarPassword(String password) {
        login.ingresarPassword(password);
        System.out.println("Entre al ingresar contraseña");
    }

    @And("hace click en login")
    public void clickElemento() {
        login.clickElemento();
    }

    @Then("podrá acceder a la pagina")
    public void cierre() {
        base.cierre();
    }

//PRUEBA USUARIO ERRADO

    @Given("que el usuario se dirije a {string}")
    public void irA(String url) {
        base.navegarA(url);
        login = new LoginPage(BasePage.driver);
    }

    @When("coloca el usuario {string}")
    public void ingresarUsuarioErrado(String usuarioErrado) {
        login.ingresarUsuario(usuarioErrado);
    }

    @And("coloca contraseña {string}")
    public void ingresoContraseñaBloqueada(String pass) {
        login.ingresarPassword(pass);
    }

    @And("hace click en boton login")
    public void click() {
        login.clickElemento();
    }

    @Then("el sistema lanza un mensaje de error {string}")
    public void verificarIngreso(String mensajeEsperado) {
        String mensajeRecibido = login.verificarIngreso();

        Assert.assertEquals("El mensaje de error en pantalla no coincide", mensajeEsperado, mensajeRecibido);
        System.out.println("¡Exito!");
        base.cierre();
    }

}