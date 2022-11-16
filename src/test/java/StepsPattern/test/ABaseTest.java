package StepsPattern.test;

import StepsPattern.steps.SearchSteps;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public abstract class ABaseTest {

    SearchSteps steps;
    // steps variable can be initialized in some @Before method like below

    @BeforeClass
    public void setUp() {

        // some code here

        steps = new SearchSteps();

    }

}
