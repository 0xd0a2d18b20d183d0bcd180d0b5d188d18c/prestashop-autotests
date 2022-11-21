package forms;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProductPage {

    public final SelenideElement addToCartButton = $x("//button[contains(@class, \"add-to-cart\")]"),
            continueShoppingButton = $x("//button[contains(text(), \"Continue shopping\")]"),
            gotoCartButton = $x("//div[@id=\"_desktop_cart\"]/div"),
            touchspinUpButton = $x("//button[contains(@class, \"bootstrap-touchspin-up\")]"),
            proceedToCheckoutButton = $x("//a[contains(text(), \"Proceed to checkout\")]");
}
