import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class SearchTest1 {

    @Test
    public void commandLineWork() {

        File file = new File("C:/Users/Алексей/IdeaProjects/AutomationFramework/src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        WebDriver gDriver = new ChromeDriver();

        gDriver.navigate().to("https://www.google.com/");
        //input.gLFyf.gsfi
        WebElement searchField = gDriver.findElement(By.className("gLFyf"));

        //filling in the search field
        searchField.click();
        searchField.sendKeys("bla bla bla");

        //pressing enter
        searchField.sendKeys(Keys.RETURN);

        String report = gDriver.findElement(By.id("result-stats")).getText();
        System.out.println(report);

        //clearing the search field
//        searchField.clear();

        // closing the chrome
        gDriver.quit();

    }
}
