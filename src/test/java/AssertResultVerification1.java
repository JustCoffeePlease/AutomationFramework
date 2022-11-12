import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class AssertResultVerification1 {

    @Test
    public void clWork() throws InterruptedException {
        File file = new File("C:/Users/Алексей/IdeaProjects/AutomationFramework/src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        WebDriver gDriver = new ChromeDriver();

        gDriver.navigate().to("https://www.google.com/");

        WebElement searchField = gDriver.findElement(By.className("gLFyf"));

        searchField.click();
        searchField.sendKeys("selenium webdriver");
        searchField.sendKeys(Keys.RETURN);

        //sleeping for a 3sec -> BAD PRACTICE
        Thread.sleep(3000);

        // //div[@class='yuRUbf']//h3
        WebElement resultRow = gDriver.findElement(By.xpath("//div[@class='yuRUbf']//*[@class='LC20lb MBeuO DKV0Md']"));

        Assert.assertTrue(resultRow.isDisplayed(), "Element has not been displayed!");
        Assert.assertEquals(resultRow.getText(), "WebDriver - Selenium", "Wrong text has been displayed!");
        Assert.assertEquals(resultRow.getAttribute("class"), "LC20lb MBeuO DKV0Md", "Wrong attribute text!");

        gDriver.quit();
    }
}
