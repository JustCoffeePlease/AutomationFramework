import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Main extends ABaseTest {

    @Test(dataProvider = "dataProvider")
    public void openGoogleComInChromeTest(String text) throws InterruptedException {

        WebElement searchField = gDriver.findElement(By.className("gLFyf"));

        searchField.click();
        searchField.sendKeys(text);
        searchField.sendKeys(Keys.RETURN);

        Thread.sleep(3000);

        WebElement resultRow = gDriver.findElement(By.xpath("//div[@class='yuRUbf']//*[@class='LC20lb MBeuO DKV0Md']"));

        Assertions.assertThat(resultRow.isDisplayed()).as("Element has not been displayed!").isTrue();
        Assertions.assertThat(resultRow.getText()).as("Wrong text has been displayed!").isEqualToIgnoringCase("WebDriver - Selenium");
        Assertions.assertThat(resultRow.getAttribute("class")).as("Wrong attribute text!").contains("LC20lb");
    }

//    public void openGoogleComInChromeTest1() throws InterruptedException {
//
//        WebElement searchField = gDriver.findElement(By.className("gLFyf"));
//
//        searchField.click();
//        searchField.sendKeys("selenium webdriver");
//        searchField.sendKeys(Keys.RETURN);
//
//        Thread.sleep(3000);
//
//        WebElement resultRow = gDriver.findElement(By.xpath("//div[@class='yuRUbf']//*[@class='LC20lb MBeuO DKV0Md']"));
//
//        Assertions.assertThat(resultRow.isDisplayed()).as("Element has not been displayed!").isTrue();
//        Assertions.assertThat(resultRow.getText()).as("Wrong text has been displayed!").isEqualToIgnoringCase("WebDriver - Selenium");
//        Assertions.assertThat(resultRow.getAttribute("class")).as("Wrong attribute text!").contains("LC20lb");
//    }
}
