package StepsPattern.steps;

import StepsPattern.pages.SearchResultPage;

public class SearchResultsSteps {

    private SearchResultPage searchResultPage  = new SearchResultPage();

    public SearchResultsSteps verifyThatTopValueIsCorrect(String expectedValue) {

        searchResultPage.assertThatExpectedValueIsOnSearchTop(expectedValue);

        return this;
    }

}
