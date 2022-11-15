package PageObjectPattern.pages;

import PageObjectPattern.test.ABaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class ABasePage {
    // ABasePage - Абстрактная страница, куда выносятся общие методы,
    // которые реализуются на других страницах

    protected WebDriver driver;

    public ABasePage(){

        this.driver = ABaseTest.getDriver();
//        this.driver = ABaseTest.getDriver();
//        PageFactory.initElements(driver, this);
    }
}
