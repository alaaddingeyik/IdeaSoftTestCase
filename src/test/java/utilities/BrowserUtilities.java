package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserUtilities {

    /**
     * Belirtilen süre kadar bekler.
     *
     * @param seconds Bekleme süresi (saniye)
     */
    public static void wait(int seconds) {
        try {
            Thread.sleep(1000 * seconds); // Saniyeyi milisaniyeye çevirir
        } catch (InterruptedException e) {
            // Bekleme sırasında bir hata oluşursa, yığını yazdırır
            e.printStackTrace();
        }
    }

    /**
     * Sayfanın tamamen yüklenmesini bekler.
     *
     * @param timeOutInSeconds Maksimum bekleme süresi (saniye)
     */
    public static void waitForPageToLoad(long timeOutInSeconds) {
        WebDriver driver = Driver.getDriver(); // WebDriver örneğini al
        ExpectedCondition<Boolean> expectation =
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete");

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
            wait.until(expectation); // Sayfanın yüklenmesini bekler
        } catch (Throwable error) {
            // Bekleme sırasında bir hata oluşursa, yığını yazdırır
            error.printStackTrace();
        }
    }
}
