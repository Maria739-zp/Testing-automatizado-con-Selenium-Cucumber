package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

    @FindBy(className = "error-message-container")
    public WebElement mensajeError;

    public void ingresarUsuario(String usuario) {
        campoUsuario.clear();
        campoUsuario.sendKeys(usuario);
    }

    public void ingresarPassword(String password) {
        campoPass.clear();
        campoPass.sendKeys(password);
    }

    public void clickElemento(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("login-button")));
        campoBoton.click();
    }

    public String verificarIngreso(){
        return mensajeError.getText();
    }
}
