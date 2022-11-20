package MainStepsProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static MainStepsProject.test.AMSBaseTest.getDriver;


public abstract class AMSBasePage {

    WebDriver driver;

    public AMSBasePage() {
        this.driver = getDriver();

        PageFactory.initElements(driver, this);

    }
}
