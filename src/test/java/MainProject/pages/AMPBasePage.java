package MainProject.pages;

import org.openqa.selenium.WebDriver;

import static MainProject.tests.AMPBaseTest.getDriver;

public abstract class AMPBasePage {

    WebDriver driver;

    public AMPBasePage() {
        this.driver = getDriver();
    }
}
