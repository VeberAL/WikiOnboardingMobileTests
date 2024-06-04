package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class PageComponent {

    private final SelenideElement
            skipButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")),
            okButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            view = $(id("org.wikipedia.alpha:id/primaryTextView"));

    @Step("Проверка отображения текста заголовка на открытой странице.")
    public void checkPrimaryText(String value) {
        view.shouldHave(text(value));
    }

    @Step("Проверка отображения кнопки Continue на открытой странице.")
    public void checkSkipButtonVisibility() {
        skipButton.shouldBe(visible);
    }

    @Step("Проверка отображения корректного индикатора номера страницы.")
    public void checkIndicatorVisibility(SelenideElement indicator) {
        indicator.shouldBe(visible);
    }

    @Step("Нажатие кнопки Continue.")
    public void clickContinueButton() {
        okButton.click();
    }
}