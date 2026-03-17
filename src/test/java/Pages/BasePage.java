package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class BasePage {

    public static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public BasePage(WebDriver driver){
        BasePage.driver =driver;
    }

    public BasePage() {
    }

    public static void navegarA(String url){
        driver.get("https://www.saucedemo.com/");
    }


    //crea un webelement llamado find, que recibe un parametro localizador
    // luego retorna una espera hasta que se cumola la condicion de que este presente el elemento
    //en este caso lo busca por spath

   // private WebElement Find(String localizador){
       // return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(localizador)));
   // }

    //public void clickElemento(String localizador){
      //  Find(localizador).click();
    //}

    public void cierre() {
        if (driver != null) {
            driver.quit();
        }
    }

}


