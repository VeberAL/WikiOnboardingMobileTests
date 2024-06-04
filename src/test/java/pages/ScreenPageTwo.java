package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.PageComponent;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class ScreenPageTwo {

    PageComponent pageComponent = new PageComponent();

    private final SelenideElement
            pageText = $(accessibilityId("Page 2 of 4"));

    public ScreenPageTwo checkOpenPage(String value) {
        pageComponent.checkPrimaryText(value);
        pageComponent.checkSkipButtonVisibility();
        pageComponent.checkIndicatorVisibility(pageText);
        return this;
    }

    public void clickButtonContinue() {
        pageComponent.clickContinueButton();
    }
}


