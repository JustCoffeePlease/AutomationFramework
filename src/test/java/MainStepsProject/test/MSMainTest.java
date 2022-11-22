package MainStepsProject.test;


import org.testng.annotations.Test;

public class MSMainTest extends AMSBaseTest {

    @Test(dataProvider = "dataProvider")
    public void openGoogleComInChromeTest(String text) throws InterruptedException {

        steps.executeSearchByKeyWord(text)
                .verifyThatTopResultContainsCorrectText("Selenium Webdriver")
                .verifyThatTopResultContainsProperAttributeText("LC20lb");

    }

    @Test
    public void verifySearchByVoiceTooltipOnGoogle(){
        steps.openToolTip()
                .verifyThatTooltipContainsProperText("Голосовой поиск");
    }
}
