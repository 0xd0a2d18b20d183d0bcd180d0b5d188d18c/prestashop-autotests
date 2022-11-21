package steps;

import forms.ProductPage;
import io.qameta.allure.Step;

public class ProductPageSteps {

    ProductPage productPage = new ProductPage();

    @Step("Add {counter} products to Cart")
    public void addProductsToCart(int counter) {
        for (int i = 0; i < counter - 1; i++) {
            productPage.touchspinUpButton.click();
        }
        productPage.addToCartButton.click();
    }

    @Step("Go to Cart Page")
    public void gotoCartPage() {
        productPage.proceedToCheckoutButton.click();
    }
}
