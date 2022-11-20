package MainStepsProject.test;

import MainStepsProject.steps.MSSearchSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import utils.Browser;
import utils.DriverFactory;
import utils.PropertyReader;

import java.io.File;
import java.io.IOException;

public abstract class AMSBaseTest {

    public static WebDriver getDriver() {
        return driver;
    }

    private static WebDriver driver;
    MSSearchSteps steps;

    private String path = "https://www.google.com/";

    // Выполняется один раз
    @BeforeClass
    public void setUp() throws IOException {

        driver = DriverFactory.getDriver(Browser.CHROME);
//        driver = DriverFactory.getDriver(PropertyReader.getBrowser());

        driver.manage().window().maximize();
        driver.get(path);
//        driver.get(PropertyReader.getUrl());

        steps = new MSSearchSteps();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @AfterMethod
    public void goBack(){
        driver.navigate().back();
    }

    @DataProvider(name = "dataProvider")
    // Всегда возвращает Object
    public Object[][] dataProviderMethod() {
        return new Object[][]{{"selenium java"},{"selenium python"}};
    }
}
