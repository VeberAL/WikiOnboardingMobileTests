package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.PageComponent;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.qameta.allure.Allure.step;

public class ScreenPageFour {

    PageComponent pageComponent = new PageComponent();

    private final SelenideElement
            pageText = $(accessibilityId("Page 1 of 4"));

    public ScreenPageFour checkOpenPage(String value) {
        step("Открытие четвертой страницы.", () -> {
            pageComponent.checkPrimaryText(value);
            pageComponent.checkSkipButtonVisibility();
            pageComponent.checkIndicatorVisibility(pageText);
        });
        step("Нажатие кнопки Continue.", () -> pageComponent.clickContinueButton());
        return this;
    }
}