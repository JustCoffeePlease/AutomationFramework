package utils;

import com.sun.jdi.PrimitiveValue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;

public class DriverFactory {

    private static WebDriver driver;
    private final static String DRIVER_PATH = "C:/Users/Алексей/IdeaProjects/AutomationFramework/src/test/resources/";

    public static WebDriver getDriver(Browser browser) {
        File file;

        switch (browser) {

            case CHROME:
                file = new File(DRIVER_PATH + "chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

                driver = new ChromeDriver();

                break;

            case IE:

                file = new File(DRIVER_PATH + "IEDriverServer.exe");
                System.setProperty("webdriver.ie.driver", file.getAbsolutePath());

                driver = new InternetExplorerDriver();
                break;

            case ME:

                file = new File(DRIVER_PATH + "edgedriver_win64/msedgedriver.exe");
                System.setProperty("webdriver.me.driver", file.getAbsolutePath());

                driver = new EdgeDriver();
                break;

//            default:

        }

        return driver;
    }
}
