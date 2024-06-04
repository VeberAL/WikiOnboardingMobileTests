package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class PageComponent {

    private final SelenideElement
            skipButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")),
            okButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            view = $(id("org.wikipedia.alpha:id/primaryTextView"));

    public void checkPrimaryText(String value) {
        view.shouldHave(text(value));
    }

    public void checkSkipButtonVisibility() {
        skipButton.shouldBe(visible);
    }

    public void checkIndicatorVisibility(SelenideElement indicator) {
        indicator.shouldBe(visible);
    }

    public void clickContinueButton() {
        okButton.click();
    }
}