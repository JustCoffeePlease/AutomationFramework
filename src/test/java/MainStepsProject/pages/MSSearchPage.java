package MainStepsProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.assertj.core.api.Assertions.assertThat;

public class MSSearchPage extends AMSBasePage {

    // Объявляем элемент и сразу используем поиск по локатору
    @FindBy(name = "q")
    private WebElement searchField;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    @FindBy(xpath = "//body")
    private WebElement pageBody;

    @FindBy(css = "svg.goxjub")
    private WebElement searchByVoiceButton;

//    WebElement searchField = driver.findElement(By.className("gLFyf"));
//    private By searchField = By.className("gLFyf");

    public MSSearchPage() {
        super();
    }

    public void fillSearchField (String text){

//        WebElement SearchFieldElement = driver.findElement(searchField);
        searchField.click();
        searchField.sendKeys(text);
    }

    public void pasteToSearchField (String text){

        pasteTextToElementFromClipboard(searchField, text);
    }

    public void pressEnter() {
//        WebElement SearchFieldElement = driver.findElement(searchField);
        searchField.sendKeys(Keys.RETURN);
    }

    public void clickSearchButtonOrPressEnter() throws InterruptedException {
        if(isElementFound(By.name("btnK"), 3)) {
            wait.until(ExpectedConditions.elementToBeClickable(searchButton));
            searchButton.click();
        }else {
            pressEnter();

        }
    }

    public void moveToVoiceSearchButton(){
        // Метод наведения курсосра
        builder.moveToElement(searchByVoiceButton).build().perform();
    }

    public void assertVoiceSearchTooltipContainsText(String text){

        assertThat(pageBody.findElements(By.xpath("//*[contains(text(), '"+ text +"')]"))
                .size())
                .as("Expected tooltip ["+text+" was not found")
                .isNotZero();

    }
}


