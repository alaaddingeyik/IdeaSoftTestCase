package step_definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.WebPage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class ActionClassSteps {
    WebPage webPage = new WebPage();

    @Given("testcase.myideasoft.com adresine gidilir")
    public void navigateToTestcaseMyideasoftCom() {
        BrowserUtilities.waitForPageToLoad(5);
        Driver.getDriver().get("https://testcase.myideasoft.com/");
    }

    @When("Search box alanina urun yazilip arama butonuna tiklanir")
    public void searchProductAndClickSearchButton() {
        webPage.enterSearchTerm("ürün");
        webPage.clickSearchButton();
    }

    @When("Listelenen urunun detayina girilip {int} adet sepete eklenir")
    public void addItemToBasket(Integer quantity) {
        webPage.clickItem();
        webPage.selectQuantity();
        webPage.clickBasket();
    }

    @When("Sepetinize eklenmistir yazisinin gorundugu kontrol edilir")
    public void verifyItemAddedToBasket() {
        boolean isDisplayed = webPage.isBasketInformationDisplayed();
        Assert.assertTrue("Sepete eklenme mesajı görünmedi", isDisplayed);
    }

    @Then("Sepet sayfasına gidilir ve sepet iceriginde ilgili urunden {int} adet oldugu kontrol edilir")
    public void verifyItemQuantityInBasket(Integer expectedQuantity) {
        webPage.clickBasketIcon();
        boolean isQuantityCorrect = webPage.verifyBasketItemQuantity();
        Assert.assertTrue("Sepetteki ürün sayısı beklenen değil", isQuantityCorrect);

    }
}
