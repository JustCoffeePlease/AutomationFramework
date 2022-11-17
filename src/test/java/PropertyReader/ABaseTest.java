package PropertyReader;

import DriverFactory.DriverFactory;
import StepsPattern.steps.SearchSteps;
import org.openqa.selenium.WebDriver;

public class ABaseTest {

    private static WebDriver driver;
    SearchSteps steps;

    public void setUp() {

        driver = DriverFactory.getDriver(PropertyReader.getBrowser());

        driver.get(PropertyReader.getBaseUrl());

        steps = new SearchSteps();
    }

}
