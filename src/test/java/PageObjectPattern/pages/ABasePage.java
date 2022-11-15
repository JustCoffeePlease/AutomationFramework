package PageObjectPattern.pages;

import PageObjectPattern.test.ABaseTest;
import org.openqa.selenium.WebDriver;

public abstract class ABasePage {
    // ABasePage - Абстрактная страница, куда выносятся общие методы,
    // которые реализуются на других страницах

    protected WebDriver driver;

    public ABasePage(){

        this.driver = ABaseTest.getDriver();
    }
}
