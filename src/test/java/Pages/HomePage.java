package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

@FindBy(id="add-to-cart-sauce-labs-backpack")
    public WebElement botonCarrito;

    @FindBy(className = "shopping_cart_badge")
    public WebElement badgeCarrito;

    @FindBy(className = "product_sort_container")
    public WebElement comboBox;

//metodos

    public void clickProducto(String nombreProducto) {
        String xpathBoton = "//div[text()='" + nombreProducto + "']/ancestor::div[@class='inventory_item_description']//button";
        driver.findElement(By.xpath(xpathBoton)).click();
    }

    public void clickCarrito(){
        botonCarrito.click();
    }

    public String obtenerTextoCarrito() {
        return badgeCarrito.getText();
    }


    public void selectDelista(String Value){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("product_sort_container")));

        Select dropDown = new Select(driver.findElement(By.className("product_sort_container")));
        dropDown.selectByValue(Value);
    }

    public String nombreLista(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("item_5_title_link")));
        return comboBox.getText();
    }

}
