package Steps;

import Pages.BasePage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.*;

public class StepsHome extends BasePage {

    BasePage base = new BasePage();
    HomePage home;
    LoginPage login;

/*
    @Given("que el usuario ya ha iniciado sesión y se encuentra en la pagina home")
    public void iniciarSesion() {
        base.iniciar();
        login = new LoginPage(BasePage.driver);
        base.navegarA("https://www.saucedemo.com/");
        login.ingresarUsuario("standard_user");
        login.ingresarPassword("secret_sauce");
        login.clickElemento();
        home = new HomePage(BasePage.driver);
    }

 */

    @Given("el usuario hace clic en el producto {string}")
    public void el_usuario_hace_clic_en_el_producto(String nombreProducto) {
        System.out.println("Entre");
        home = new HomePage(BasePage.driver);
        home.clickProducto(nombreProducto);
    }


    @When("selecciona la opción para ese producto")
    public void clickCarrito(){
        System.out.print("el producto ya fue agregado al carrito");
    }

    @Then("el icono del carrito debe mostrar {string} unidad")
    public void verificarCarrito(String cantidadEsperada) {
        String cantidadActual = home.obtenerTextoCarrito();

        if (!cantidadActual.equals(cantidadEsperada)) {
            throw new AssertionError("¡Falló! Se esperaba " + cantidadEsperada + " pero hay " + cantidadActual);
        }
        System.out.println("Validación exitosa: El producto está en el carrito.");
        base.cierre();
    }



}
