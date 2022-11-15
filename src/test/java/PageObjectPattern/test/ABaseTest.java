package PageObjectPattern.test;

import org.openqa.selenium.WebDriver;

public abstract class ABaseTest {
    // помещаются аанотации @Before... , @After...

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }
}
