package Steps;

import io.cucumber.java.en.*;
import pages.BasePage;
import pages.LoginPage;

public class StepsDefinitions {

    // 1. Creamos las instancias de tus clases
    BasePage base = new BasePage();
    LoginPage login;

    @Given("el usuario desea ingresar a {string}")
    public void elUsuarioDeseaIngresarA(String url) {
        base.iniciar();

        // Ahora inicializamos la LoginPage pasándole el driver que creó la base
        login = new LoginPage(base.driver);
        login.navigateTo(url);
    }

    @When("usuario coloca el nombre de usuario {string}")
    public void ingresar(String usuario) {
        login.ingresarUsuario(usuario);
    }


    @And("introduce su contraseña {string}")
    public void ingresarContraseña(String contraseña) {
        login.ingresarContraseña(contraseña);
    }


    @And("presionar el botón login")
    public void clickingresar() {
        login.clickIngresar();
    }


    @Then("el usuario podrá ingresar a la pagina")
    public void elUsuarioPodraIngresarALaPagina() {
        base.cierre();
        }
}


