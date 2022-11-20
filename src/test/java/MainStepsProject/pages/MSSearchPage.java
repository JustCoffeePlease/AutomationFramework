package MainStepsProject.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MSSearchPage extends AMSBasePage {

    // Объявляем элемент и сразу используем поиск по локатору
    @FindBy(name = "q")
    private WebElement searchField;

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
}


