package MainStepsProject.pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.stream.Collectors;

public class MSSearchResultPage extends AMSBasePage {

//    private By resultRowElement = By.xpath("//div[@class='yuRUbf']//*[@class='LC20lb MBeuO DKV0Md']");

    @FindBy(xpath = "//div[@class='yuRUbf']//*[@class='LC20lb MBeuO DKV0Md']")
    private WebElement resultRowElement;

    @FindBy(xpath = "//div[@class='yuRUbf']//*[@class='LC20lb MBeuO DKV0Md']")
    private List<WebElement> resultRowsElement;

    public MSSearchResultPage() {
        super();
    }

    public void assertThatTopResultContainsCorrectText(String expected) {

        // explicit waits
        wait.until(ExpectedConditions.visibilityOfAllElements(resultRowsElement));

//        WebElement resultRow = driver.findElement(resultRowElement);

//        Assertions.assertThat(resultRowElement.isDisplayed()).as("Element has not been displayed!").isTrue();
        // Так как resultRowsElement это список WebElement, а не список String,
        // необходимо провести следующие действия:
        // Вытаскиваем весь текст, который содержится в WebElement, и далее
        // сравниваем эти строки в списках с ожидаемой строкой
        Assertions.assertThat(resultRowsElement
                .stream()
                .map(e->e.getText())                            // Получаем строки
                .collect(Collectors.toList()).toString())       // Формируем из них список. С помощью toString получаем
                .as("Wrong text has been displayed!")  // строку. Тогда мы сможем искать не по списку, а по строке
                .contains(expected);
    }

    public void assertThatTopResultContainsProperAttributeText(String expected) {

//        WebElement resultRow = driver.findElement(resultRowElement);

        Assertions.assertThat(resultRowElement.getAttribute("class")).as("Wrong attribute text!").contains(expected);
    }
}
