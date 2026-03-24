package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    public WebElement campoUsuario;

    @FindBy(id = "password")
    public WebElement campoPass;

    @FindBy(id = "login-button")
    public WebElement campoBoton;

    public void ingresarUsuario(String usuario) {
        campoUsuario.clear();
        campoUsuario.sendKeys(usuario);
    }

    public void ingresarPassword(String password) {
        campoPass.clear();
        campoPass.sendKeys(password);
    }

    public void clickElemento(){
        campoBoton.click();
    }
    /*private String clickElemento = "login-button";

    @Override
    public void clickElemento(String localizador) {
        super.clickElemento(localizador);
    */
}
