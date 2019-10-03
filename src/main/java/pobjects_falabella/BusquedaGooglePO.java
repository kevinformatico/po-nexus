package pobjects_falabella;

import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusquedaGooglePO extends BasePage {

    public BusquedaGooglePO(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "q")
    WebElement cajaBuscador;

    @FindBy(id="idIngresar")
    WebElement btnIngresar;

    public void buscarPalabra(String palabra){
        cajaBuscador.sendKeys(palabra);
        cajaBuscador.submit();
    }

    //agrego comentario
}
