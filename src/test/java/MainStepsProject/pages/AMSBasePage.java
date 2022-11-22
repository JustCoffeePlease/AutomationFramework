package MainStepsProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.tools.Tool;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;
import java.util.List;

import static MainStepsProject.test.AMSBaseTest.getDriver;


public abstract class AMSBasePage {

    WebDriver driver;
    WebDriverWait wait;

    public AMSBasePage() {
        this.driver = getDriver();

        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    boolean isElementFound(By by, int timeout) throws InterruptedException {

        List<WebElement> elements = driver.findElements(by);
        for(int i = 0; (i < timeout) && (elements.size() == 0); i++) {
            Thread.sleep(1000);
            elements = driver.findElements(by);
        }
        return elements.size() > 0;
    }

    void pasteTextToElementFromClipboard(WebElement element, String text){
        // Метод позволяет копировать текст из буфера обмена в фрагмент element

        Toolkit toolkit = Toolkit.getDefaultToolkit();                  //  |
        Clipboard clipboard = toolkit.getSystemClipboard();             //  |   Эта часть кода отвечает за помещение
        StringSelection stringSelection = new StringSelection(text);    //  |   строки в буфер обмена
        clipboard.setContents(stringSelection, null);             //  |

        element.sendKeys(Keys.CONTROL, "v");                 // Метод делает вставку из буфера обмена

    }
}
