package steps;

import com.codeborne.selenide.Condition;
import forms.HomePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

public class HomePageSteps {

    private final HomePage homePage = new HomePage();

    @Step("Open thumbnail product bu counter {counter}")
    public void openThumbnailProductByCounter(int counter) {
        switchTo().frame($x("//iframe[@id=\"framelive\"]"));
        homePage.getProductThumbnailLinkByCounter(counter).click();
    }
}
