package MainStepsProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MSSearchPage extends AMSBasePage {

    // Объявляем элемент и сразу используем поиск по локатору
    @FindBy(name = "q")
    private WebElement searchField;

    @FindBy(name = "btnK")
    private WebElement searchButton;

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
}


