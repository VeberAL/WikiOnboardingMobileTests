package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.PageComponent;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class ScreenPageFour {

    PageComponent pageComponent = new PageComponent();

    private final SelenideElement
            pageText = $(accessibilityId("Page 4 of 4")),
            getStartedButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button"));

    @Step("Проверка открытия четвертой страницы.")
    public ScreenPageFour checkOpenPage(String value) {
        pageComponent.checkPrimaryText(value);
        pageComponent.checkIndicatorVisibility(pageText);
        return this;
    }

    @Step("Нажатие кнопки  Get started.")
    public void clickButtonStart() {
        getStartedButton.click();
    }
}