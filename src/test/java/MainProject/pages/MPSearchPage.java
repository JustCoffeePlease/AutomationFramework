package MainProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class MPSearchPage extends AMPBasePage {

//    WebElement searchField = driver.findElement(By.className("gLFyf"));
    private By searchField = By.className("gLFyf");

    public MPSearchPage() {
        super();
    }

    public void fillSearchField (String text){
        WebElement SearchFieldElement = driver.findElement(searchField);
        SearchFieldElement.click();
        SearchFieldElement.sendKeys(text);
    }

    public void pressEnter() {
        WebElement SearchFieldElement = driver.findElement(searchField);
        SearchFieldElement.sendKeys(Keys.RETURN);
    }
}


