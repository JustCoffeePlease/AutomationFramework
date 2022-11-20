package MainProject.tests;

import MainProject.AMPBaseTest;
import MainProject.pages.MPSearchPage;
import MainProject.pages.MPSearchResultPage;
import org.testng.annotations.Test;

public class MPMainTest extends AMPBaseTest {

    @Test(dataProvider = "dataProvider")
    public void openGoogleComInChromeTest(String text) throws InterruptedException {

        MPSearchPage searchPage = new MPSearchPage();
        // Текст мы получаем из dataProvider
        searchPage.fillSearchField(text);
        searchPage.pressEnter();

        Thread.sleep(3000);

        MPSearchResultPage searchResultPage = new MPSearchResultPage();

//        searchResultPage.assertThatTopResultContainsCorrectText("Selenium WebDriver - Selenium documentation");
        searchResultPage.assertThatTopResultContainsCorrectText("Пишем автотест с использованием Selenium Webdriver ...");
        searchResultPage.assertThatTopResultContainsProperAttributeText("LC20lb");
    }
}
