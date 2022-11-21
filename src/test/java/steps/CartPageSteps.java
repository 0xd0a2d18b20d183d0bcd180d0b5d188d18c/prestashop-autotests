package steps;

import forms.CartPage;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

public class CartPageSteps {

    CartPage cartPage = new CartPage();

    @Step
    public void gotoOrder() {
        cartPage.proceedToCheckoutButton.click();
    }

    @Step
    public void fillPersonalInformationForm(String firstName, String lastName, String email) {
        cartPage.socialTitleValueOne.click();
        cartPage.firstNameField.setValue(firstName);
        cartPage.lastNameField.setValue(lastName);
        cartPage.emailField.setValue(email);
        cartPage.customerPrivacyCheckbox.click();
        cartPage.psgdrpCheckbox.click();
        cartPage.continueButton.click();
    }

    @Step
    public void fillAddressForm(String address, String zipcode, String city) {
        cartPage.addressField.setValue(address);
        cartPage.zipCodeField.setValue(zipcode);
        cartPage.cityField.setValue(city);
        cartPage.addressSubmitButton.click();
    }

    @Step
    public void fillShippingMethodForm() {
        cartPage.deliveryMethodSubmitButton.click();
    }

    @Step
    public void fillPaymentForm() {
        cartPage.payByBankWireCheckbox.click();
        cartPage.approveTermsOfServiceCheckbox.click();
        cartPage.placeOrderButton.click();
    }

    public void checkQuantityInOrder(String counter) {
//        switchTo().frame($x("//iframe[@id=\"framelive\"]"));
        Assert.assertEquals(cartPage.quantityCounterDiv.getText(), counter,
                "Quantity is not equals");
    }
}
