package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.className;
import static io.appium.java_client.AppiumBy.id;

public class MainPage {

    private final SelenideElement
            searchContainer = $(id("org.wikipedia.alpha:id/search_container")).$(className("android.widget.TextView"));

    @Step("Проверка открытия главной страницы приложения.")
    public void checkPageOpenedCorrectly(String value) {
        searchContainer.shouldHave(text(value));
    }
}