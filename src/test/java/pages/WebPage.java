package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtilities;

/**
 * Web sayfasındaki belirli elementlerle etkileşime geçmek için kullanılan sınıf.
 */
public class WebPage extends AbstractBasePage {

    // Arama kutusunu temsil eden web elementi.
    @FindBy(xpath = "//input[@name='q']")
    protected WebElement searchBox;

    // Arama butonunu temsil eden web elementi.
    @FindBy(xpath = "//form[@data-selector='search-form']//button//*[name()='svg']")
    protected WebElement searchButton;

    // Ürünü temsil eden web elementi.
    @FindBy(xpath = "//div[@class='showcase-image showcase-image-vertical']//a[@title='Ürün']")
    protected WebElement item;

    // Ürün miktarını temsil eden web elementi.
    @FindBy(xpath = "//select[@id='qty-input']//option[@value='5']")
    protected WebElement count;

    // Sepete ekleme butonunu temsil eden web elementi.
    @FindBy(xpath = "//a[@class='add-to-cart-button']//*[name()='svg']")
    protected WebElement basket;

    // Sepet bilgilerini temsil eden web elementi.
    @FindBy(xpath = "//div[@class='shopping-information-cart-inside']")
    protected WebElement basketInformation;

    // Sepet ikonunu temsil eden web elementi.
    @FindBy(xpath = "//span[normalize-space()='Sepet']")
    protected WebElement basketIcon;

    // Sepetteki ürün sayısını kontrol eden web elementi.
    @FindBy(xpath = "//input[@value='5']")
    protected WebElement basketCheck;

    /**
     * Arama kutusuna ürün ismini yazar.
     */
    public void enterSearchTerm(String term){
        BrowserUtilities.wait(2);
        searchBox.sendKeys(term);
    }

    /**
     * Arama butonuna tıklar.
     */
    public void clickSearchButton(){
        BrowserUtilities.wait(2);
        searchButton.click();
    }

    /**
     * Ürüne tıklar.
     */
    public void clickItem(){
        BrowserUtilities.wait(2);
        item.click();
    }

    /**
     * Ürün miktarını seçer.
     */
    public void selectQuantity(){
        BrowserUtilities.wait(2);
        count.click();
    }

    /**
     * Sepete ekleme butonuna tıklar.
     */
    public void clickBasket(){
        BrowserUtilities.wait(2);
        basket.click();
    }

    /**
     * Sepet bilgilerini kontrol eder.
     */
    public boolean isBasketInformationDisplayed(){
        BrowserUtilities.wait(1);
        return basketInformation.isDisplayed();
    }

    /**
     * Sepet ikonuna tıklar.
     */
    public void clickBasketIcon(){
        BrowserUtilities.wait(2);
        basketIcon.click();
    }

    /**
     * Sepetteki ürün miktarını kontrol eder.
     */
    public boolean verifyBasketItemQuantity(){
        BrowserUtilities.wait(2);
        return basketCheck.isDisplayed();
    }
}
