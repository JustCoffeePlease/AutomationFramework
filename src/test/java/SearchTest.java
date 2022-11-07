import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.io.File;

public class SearchTest {

    @Test
    public void openGoogleComInChromeTest() {
        //Файл, который указывает расположение chromedriver.exe
        File googleFile = new File("C:/Users/Алексей/IdeaProjects/AutomationFramework/src/test/resources/chromedriver.exe");
        //Запись в переменных окружения instance указанного файла
        System.setProperty("webdriver.chrome.driver", googleFile.getAbsolutePath());
        //Обявление instance webdriver
        WebDriver googleDriver = new ChromeDriver();
        //Переход на URL
        googleDriver.navigate().to("https://www.google.com/");
//        driver.get("https://www.google.com/");
//        driver.get("https://www.youtube.com/");
//        driver.navigate().refresh();
        //Возвращаем название страницы
        System.out.println(googleDriver.getTitle());
        //Закрытие браузера
        googleDriver.quit();
    }

/*    @Test
    public void openIExpInIEDriverServerTest() {
        File file = new File("C:/Users/Алексей/IdeaProjects/AutomationFramework/src/test/resources/IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.youtube.com/");
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        driver.quit();
    }*/
}
