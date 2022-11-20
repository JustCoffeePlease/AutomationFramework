package MainProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.File;

public abstract class AMPBaseTest {

    public static WebDriver getDriver() {
        return driver;
    }

    private static WebDriver driver;


    private String path = "https://www.google.com/";

    // Выполняется один раз
    @BeforeClass
    public void setUp() {

        File chromeFile = new File("C:/Users/Алексей/IdeaProjects/AutomationFramework/src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFile.getAbsolutePath());

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(path);


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
