import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class SearchTest {

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

        // Добавление локатора
        WebElement searchField = googleDriver.findElement(By.name("q"));
        WebElement googleApps = googleDriver.findElement(By.className("gb_Tc"));
        // Локатор возвращает две строки, которые записываются в лист
        List<WebElement> feelingLucky = googleDriver.findElements(By.xpath("//*[@class='RNmpXc'] | //*[text()='0ahUKEwiRl6ruvJ_7AhUk_SoKHfHkCHEQ19QECA4']"));
//        WebElement googleApps = googleDriver.findElement(By.cssSelector("a[aria-label='Приложения Google']"));
//        WebElement googleApps = googleDriver.findElement(By.cssSelector("div#dbwa a"));

        //Поиск поисковика и нажатие кнопки
        searchField.click();
        //Поиск значка "Google приложения" и нажатие
        googleApps.click();
        //Поиск значка "Мне повезет" и нажатие
        feelingLucky.get(1).click();
        //Закрытие браузера
        googleDriver.quit();
    }


}
