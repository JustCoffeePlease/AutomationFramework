import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AssertResultVerification {

    @Test
    public void assertMethod(){

        File file = new File("C:/Users/Алексей/IdeaProjects/AutomationFramework/src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        WebDriver gDriver = new ChromeDriver();

        gDriver.get("https://www.google.com/");

        WebElement searchField = gDriver.findElement(By.className("gLFyf"));

        searchField.click();
        searchField.sendKeys("selenium webdriver");
        searchField.sendKeys(Keys.RETURN);

        WebElement firstSearchResult = gDriver.findElement(By.xpath("//div[@class='yuRUbf']//*[@class='LC20lb MBeuO DKV0Md']"));
        System.out.println("Title name:" +"\n"+ firstSearchResult.getText());

        boolean val1 = firstSearchResult.getText().toLowerCase().contains("selenium");
        boolean val2 = firstSearchResult.getText().toLowerCase().contains("webdriver");
        boolean valSum = val1 && val2;

        System.out.println(valSum);





    }
}
