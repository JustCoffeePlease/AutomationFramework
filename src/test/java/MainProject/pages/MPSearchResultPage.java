package MainProject.pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MPSearchResultPage extends AMPBasePage {

    private By resultRowElement = By.xpath("//div[@class='yuRUbf']//*[@class='LC20lb MBeuO DKV0Md']");

    public MPSearchResultPage() {
        super();
    }

    public void assertThatTopResultContainsCorrectText(String expected) {

        WebElement resultRow = driver.findElement(resultRowElement);

        Assertions.assertThat(resultRow.isDisplayed()).as("Element has not been displayed!").isTrue();
        Assertions.assertThat(resultRow.getText()).as("Wrong text has been displayed!").isEqualToIgnoringCase(expected);
    }

    public void assertThatTopResultContainsProperAttributeText(String expected) {

        WebElement resultRow = driver.findElement(resultRowElement);

        Assertions.assertThat(resultRow.getAttribute("class")).as("Wrong attribute text!").contains(expected);
    }
}
