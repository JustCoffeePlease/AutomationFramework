package StepsPattern.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchPage extends ABasePage {

    private By searchFieldBy = By.id("lst-id");
//    @FindBy(id = "lst-id")
//    private WebElement searchFieldBy;

    public SearchPage(){
        super();
    }

    public void fillTheSearchField(String keyword){
        // Ввод текста в поле поиска
        WebElement searchField = driver.findElement(searchFieldBy);
        searchField.sendKeys(keyword);
    }

    public void pressEnter() {
        // Нажатие enter
        WebElement searchField = driver.findElement(searchFieldBy);
        searchField.sendKeys(Keys.RETURN);
    }

}
