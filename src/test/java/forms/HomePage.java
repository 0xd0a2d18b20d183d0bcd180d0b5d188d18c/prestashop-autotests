package forms;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    public final SelenideElement myAccountBtn = $(byText("My Account")),
            loginBtn = $(byText("Login"));

    public SelenideElement getCategoryBtn(String name) {
        return $(byText(name));
    }

    public SelenideElement getProductThumbnailLinkByCounter(int counter) {
        return $x("(//a[@class=\"thumbnail product-thumbnail\"])[" + counter + "]");
    }
}
