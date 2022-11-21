package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import steps.CartPageSteps;
import steps.HomePageSteps;
import steps.ProductPageSteps;
import webdriver.BaseTest;

public class QuantityTests extends BaseTest {

    CartPageSteps cartPageSteps = new CartPageSteps();
    HomePageSteps homePageSteps = new HomePageSteps();
    ProductPageSteps productPageSteps = new ProductPageSteps();


    @Test(description = "Проверка добавления более одного товара в корзину")
    @Description(value = "Проверка добавления более одного товара в корзину. Добавляется два одинаковых товара")
    public void quantityTwoTest() {
        int quantity = 2;

        openRootPage();

        homePageSteps.openThumbnailProductByCounter(1);
        productPageSteps.addProductsToCart(quantity);
        productPageSteps.gotoCartPage();
        cartPageSteps.gotoOrder();
        cartPageSteps.fillPersonalInformationForm("firstName", "lastName",
                "email@email.email");
        cartPageSteps.fillAddressForm("address", "12312", "city");
        cartPageSteps.fillShippingMethodForm();
        cartPageSteps.fillPaymentForm();
        cartPageSteps.checkQuantityInOrder(String.valueOf(quantity));
    }
}
