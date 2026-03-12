package pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public WebDriver driver;


    public void iniciar() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void cierre() {
        if (driver != null) {
            driver.quit();
        }
    }
}