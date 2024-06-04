package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("App")
public class WikiAppTest extends TestBase {

    ScreenPageOne pageOne = new ScreenPageOne();
    ScreenPageTwo pageTwo = new ScreenPageTwo();
    ScreenPageThree pageThree = new ScreenPageThree();
    ScreenPageFour pageFour = new ScreenPageFour();
    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка успешной загрузки onboarding экрана")
    void successfulGettingStartedPageTest() {
        pageOne.checkOpenPage("The Free Encyclopedia …in over 300 languages");
        pageTwo.checkOpenPage("New ways to explore");
        pageThree.checkOpenPage("Reading lists with sync");
        pageFour.checkOpenPage("Data & Privacy");
        mainPage.checkPageOpenedCorrectly("Search Wikipedia");
    }
}