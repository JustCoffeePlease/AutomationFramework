package other;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

public class AssertResultVerification {

    private WebDriver gDriver;

    @BeforeClass
    public void setUp(){

        File file = new File("C:/Users/Алексей/IdeaProjects/AutomationFramework/src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        gDriver = new ChromeDriver();

        gDriver.manage().window().maximize();

        gDriver.navigate().to("https://www.google.com/");
    }

    @AfterClass
    public void tearDown(){
        gDriver.quit();
    }

    @AfterMethod
    public void goBack(){
        // Возврат на предыдущую страницу
        gDriver.navigate().back();
    }

    @Test
    public void clWork() throws InterruptedException {

        WebElement searchField = gDriver.findElement(By.className("gLFyf"));

        searchField.click();
        searchField.sendKeys("selenium webdriver");
        searchField.sendKeys(Keys.RETURN);

        //sleeping for a 3sec -> BAD PRACTICE
        Thread.sleep(3000);

        // //div[@class='yuRUbf']//h3
        WebElement resultRow = gDriver.findElement(By.xpath("//div[@class='yuRUbf']//*[@class='LC20lb MBeuO DKV0Md']"));

//        Assert.assertTrue(resultRow.isDisplayed(), "Element has not been displayed!");
        Assert.assertEquals(resultRow.getText(), "WebDriver - Selenium", "Wrong text has been displayed!");
//        Assert.assertEquals(resultRow.getAttribute("class"), "LC20lb MBeuO DKV0Md", "Wrong attribute text!");

        //Same asserts but using AssertJ
        Assertions.assertThat(resultRow.isDisplayed()).as("Element has not been displayed!").isTrue();
        Assertions.assertThat(resultRow.getText()).as("Wrong text has been displayed!").isEqualToIgnoringCase("WebDriver - Selenium");
        Assertions.assertThat(resultRow.getAttribute("class")).as("Wrong attribute text!").contains("LC20lb");

//        Assertions.assertThat(resultRow.getAttribute("class")).as("Wrong attribute text!").contains("_LC20lb");
    }

    @Test
    public void clWork1() throws InterruptedException {

        WebElement searchField = gDriver.findElement(By.className("gLFyf"));

        searchField.click();
        searchField.sendKeys("selenium webdriver");
        searchField.sendKeys(Keys.RETURN);

        Thread.sleep(3000);

        WebElement resultRow = gDriver.findElement(By.xpath("//div[@class='yuRUbf']//*[@class='LC20lb MBeuO DKV0Md']"));

        Assertions.assertThat(resultRow.isDisplayed()).as("Element has not been displayed!").isTrue();
        Assertions.assertThat(resultRow.getText()).as("Wrong text has been displayed!").isEqualToIgnoringCase("WebDriver - Selenium");
        Assertions.assertThat(resultRow.getAttribute("class")).as("Wrong attribute text!").contains("LC20lb");
    }
}
