package PageObjectPattern.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class SearchResultPage extends ABasePage{
    // Страница результатов поиска
    private final By searchResultBy = By.xpath("//cite[@class = 'iUh30]");
//    @FindBy(xpath = "//cite[@class='iUh30']");
//    private List<WebElement> searchResultBy;

    public SearchResultPage(){
        super();
    }

    public void assertThatExpectedValueIsOnSearchTop(String expectedValue){

        List<WebElement> searchResult = (List<WebElement>) driver.findElement(searchResultBy);

        assertEquals(searchResult.get(0).getText(), "expectedValue", expectedValue + " is not the first result");
    }
}
