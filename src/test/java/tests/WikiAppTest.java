package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;


public class WikiAppTest extends TestBase {

    ScreenPageOne onboardingPageOne = new ScreenPageOne();
    ScreenPageTwo onboardingPageTwo = new ScreenPageTwo();
    ScreenPageThree onboardingPageThree = new ScreenPageThree();
    ScreenPageFour onboardingPageFour = new ScreenPageFour();
    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка успешной загрузки начальных экранов и стартовой страницы.")
    void successfulGettingStartedPageTest() {
        onboardingPageOne.checkOpenPage("The Free Encyclopedia …in over 300 languages").clickButtonContinue();
        onboardingPageTwo.checkOpenPage("New ways to explore").clickButtonContinue();
        onboardingPageThree.checkOpenPage("Reading lists with sync").clickButtonContinue();
        onboardingPageFour.checkOpenPage("Data & Privacy").clickButtonStart();
        mainPage.checkPageOpenedCorrectly("Search Wikipedia");
    }
}