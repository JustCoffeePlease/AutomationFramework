package MainStepsProject.steps;

import MainStepsProject.pages.MSSearchResultPage;

public class MSSearchResultsSteps {


   private MSSearchResultPage searchResultPage = new MSSearchResultPage();

   public MSSearchResultsSteps verifyThatTopResultContainsCorrectText(String text) {

       searchResultPage.assertThatTopResultContainsCorrectText(text);

       return this; // Метод возвращает instance класса MSSearchResultsSteps
   }

   public MSSearchResultsSteps verifyThatTopResultContainsProperAttributeText(String text) {

       searchResultPage.assertThatTopResultContainsProperAttributeText(text);

       return this;
   }

}
