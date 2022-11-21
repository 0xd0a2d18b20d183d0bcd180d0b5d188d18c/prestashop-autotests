package forms;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CartPage {

    public SelenideElement quantityInput = $x("//input[contains(@class, \"js-cart-line-product-quantity\")]"),
            proceedToCheckoutButton = $x("//a[contains(text(), \"Proceed to checkout\")]"),
            socialTitleValueOne = $x("//input[@id=\"field-id_gender-1\"]"),
            firstNameField = $x("//input[@id=\"field-firstname\"]"),
            lastNameField = $x("//input[@id=\"field-lastname\"]"),
            emailField = $x("//input[@id=\"field-email\"]"),
            customerPrivacyCheckbox = $x("//input[@name=\"customer_privacy\"]"),
            psgdrpCheckbox = $x("//input[@name=\"psgdpr\"]"),
            continueButton = $x("//form[@id=\"customer-form\"]//button[@type=\"submit\"]"),
            addressField = $x("//input[@id=\"field-address1\"]"),
            zipCodeField = $x("//input[@id=\"field-postcode\"]"),
            cityField = $x("//input[@id=\"field-city\"]"),
            addressSubmitButton = $x("//div[@class=\"js-address-form\"]//button[@type=\"submit\"]"),
            deliveryMethodSubmitButton = $x("//button[@name=\"confirmDeliveryOption\"]"),
            payByBankWireCheckbox = $x("//input[@id=\"payment-option-2\"]"),
            approveTermsOfServiceCheckbox = $x("//input[@id=\"conditions_to_approve[terms-and-conditions]\"]"),
            placeOrderButton = $x("//button[contains(text(), \"Place order\")]"),
            quantityCounterDiv = $x("//div[@class=\"col-xs-4 text-sm-center\"]");
}
