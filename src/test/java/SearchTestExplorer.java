import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.io.File;

public class SearchTestExplorer {

    @Test
    public void openIExpInIEDriverServerTest() {

        File file = new File("C:/Users/Алексей/IdeaProjects/AutomationFramework/src/test/resources/IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", file.getAbsolutePath());

        WebDriver driver = new InternetExplorerDriver();

        driver.get("https://www.youtube.com/");
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
