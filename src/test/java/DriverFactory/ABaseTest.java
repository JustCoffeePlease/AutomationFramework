package DriverFactory;

import StepsPattern.steps.SearchSteps;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class ABaseTest {

    private static WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = DriverFactory.getDriver(Browser.CHROME);
        driver.get("https://www.google.com");
        steps = new SearchSteps();
    }
}
