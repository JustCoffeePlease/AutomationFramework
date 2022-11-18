package MainProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static MainProject.tests.AMPBaseTest.getDriver;

public abstract class AMPBasePage {

    WebDriver driver;

    public AMPBasePage() {
        this.driver = getDriver();
        // При использовании FindBy, объекты searchField(class MPSearchPage) и resultRowElement(MPSearchResultPage)
        // Создаются слишком рано. При запуске Main в таком виде вернутся ошибки тестирования
        // Чтобы этого избежать необходимо использовать Driver Factory
        PageFactory.initElements(driver, this);
        // Передаем driver и this (instance того класса, который вызывает метод initElements)
    }
}
