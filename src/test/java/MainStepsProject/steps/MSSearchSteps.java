package MainStepsProject.steps;


import MainStepsProject.pages.MSSearchPage;

public class MSSearchSteps {

    private MSSearchPage searchPage = new MSSearchPage();


    public MSSearchResultsSteps executeSearchByKeyWord(String keyword) throws InterruptedException {

//        searchPage.fillSearchField(keyword);
//        searchPage.pressEnter();
        searchPage.pasteToSearchField(keyword);
        searchPage.clickSearchButtonOrPressEnter();
//        Thread.sleep(3000);

        return new MSSearchResultsSteps();

        // instance MSSearchResultsSteps возвращается, потому что
        // Сначала выполняется поиск по ключевому слову, после этого
        // выполняетя переход на следующую страницу.
        // Все эти изменения описываются в MSSearchResultsSteps, который возвращается,
        // чтобы автоматически перейти к instance нужного класса
    }

}
