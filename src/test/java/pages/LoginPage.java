package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement campoUsuario;

    @FindBy(id = "password")
    private WebElement campoContraseña;

    @FindBy(id = "login-button")
    private WebElement botonLogin;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void ingresarUsuario(String usuario) {
        campoUsuario.clear();
        campoUsuario.sendKeys(usuario);
    }

    public void ingresarContraseña(String contraseña) {
        campoContraseña.clear();
        campoContraseña.sendKeys(contraseña);
    }

    public void clickIngresar() {
        botonLogin.click();
    }
}