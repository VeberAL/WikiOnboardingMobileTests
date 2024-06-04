package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.PageComponent;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class ScreenPageThree {

    PageComponent pageComponent = new PageComponent();

    private final SelenideElement
            pageText = $(accessibilityId("Page 3 of 4"));


    @Step("Проверка открытия третьей страницы.")
    public ScreenPageThree checkOpenPage(String value) {
        pageComponent.checkPrimaryText(value);
        pageComponent.checkSkipButtonVisibility();
        pageComponent.checkIndicatorVisibility(pageText);
        return this;
    }

    public void clickButtonContinue() {
        pageComponent.clickContinueButton();
    }
}




