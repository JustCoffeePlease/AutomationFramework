import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class WebElementMethods {

    @Test
    public void clWork() throws InterruptedException {
        File file = new File("C:/Users/Алексей/IdeaProjects/AutomationFramework/src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        WebDriver gDriver = new ChromeDriver();

        gDriver.navigate().to("https://www.google.com/");

        WebElement searchField = gDriver.findElement(By.className("gLFyf"));

        searchField.click();
        searchField.sendKeys("selenium java");
        searchField.sendKeys(Keys.RETURN);

        //sleeping for a 30 sec -> BAD PRACTICE
//        Thread.sleep(3000);

        // //div[@class='yuRUbf']//h3
        WebElement resultRow = gDriver.findElement(By.xpath("//div[@class='yuRUbf']//h3"));
        System.out.println(resultRow.getText()); // using getText()
        System.out.println(resultRow.getAttribute("class")); // using getAttribute()

        gDriver.quit();
    }
}
