import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.File;

public abstract class ABaseTest {

    protected WebDriver gDriver;
    protected WebDriver mDriver;

    private String path = "https://www.google.com/";

    // Выполняется один раз
    @BeforeClass
    public void setUp() {

        File chromeFile = new File("C:/Users/Алексей/IdeaProjects/AutomationFramework/src/test/resources/chromedriver.exe");
//        File edgeFile = new File("C:/Users/Алексей/IdeaProjects/AutomationFramework/src/test/resources/edgedriver_win64/msedgedriver.exe");

        System.setProperty("webdriver.chrome.driver", chromeFile.getAbsolutePath());
//        System.setProperty("webdriver.edge.driver", edgeFile.getAbsolutePath());

        gDriver = new ChromeDriver();
//        mDriver = new EdgeDriver();

        gDriver.manage().window().maximize();
//        mDriver.manage().window().maximize();

        gDriver.get(path);
//        mDriver.get(path);

    }

    // Выполняется один раз
    @AfterClass
    public void tearDown(){

        gDriver.quit();
//        mDriver.quit();
    }

    // Выполнение зависит от количества методов
    @AfterMethod
    public void goBack(){
        gDriver.navigate().back();
//        mDriver.navigate().back();
    }

    @DataProvider(name = "dataProvider")
    // Всегда возвращает Object
    public Object[][] dataProviderMethod() {
        return new Object[][]{{"selenium java"},{"selenium python"}};
        // Один раз запустится тест с "selenium java", следующий раз запустится тест с "selenium python"
    }
}
