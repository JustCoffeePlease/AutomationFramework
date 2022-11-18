package MainProject.pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MPSearchResultPage extends AMPBasePage {

//    private By resultRowElement = By.xpath("//div[@class='yuRUbf']//*[@class='LC20lb MBeuO DKV0Md']");

    @FindBy(xpath = "//div[@class='yuRUbf']//*[@class='LC20lb MBeuO DKV0Md']")
    private WebElement resultRowElement;

    public MPSearchResultPage() {
        super();
    }

    public void assertThatTopResultContainsCorrectText(String expected) {

//        WebElement resultRow = driver.findElement(resultRowElement);

        Assertions.assertThat(resultRowElement.isDisplayed()).as("Element has not been displayed!").isTrue();
        Assertions.assertThat(resultRowElement.getText()).as("Wrong text has been displayed!").isEqualToIgnoringCase(expected);
    }

    public void assertThatTopResultContainsProperAttributeText(String expected) {

//        WebElement resultRow = driver.findElement(resultRowElement);

        Assertions.assertThat(resultRowElement.getAttribute("class")).as("Wrong attribute text!").contains(expected);
    }
}
