package io.trendyol.page;

import io.trendyol.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static io.trendyol.constant.ConstantSearchPage.*;
import static io.trendyol.constant.ConstantsHomePage.*;
import static io.trendyol.constant.ConstantsHomePage.GENDER_POPUP;
import static io.trendyol.constant.ConstantsHomePage.SEARCH_BOX;
import static io.trendyol.constant.ConstantsHomePage.SEARCH_BUTTON;

public class HomePage extends BasePage {
    WebDriverWait webDriverWait;
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }


    public HomePage openHomePage() {
        navigateUrl("https://www.trendyol.com/");
        logger.info("Trendyol sayfası açıldı...");
        return this;
    }

    public HomePage selectGender()  {
        clickWithJs(GENDER_POPUP);
        logger.info("Cinsiyet Seçildi.");
        sleep(2);
        return this;
    }
    public HomePage searchProduct(String text) {
        sendKeys(SEARCH_BOX,text);
        sleep(2);
        click(SEARCH_BUTTON);
        sleep(2);
        logger.info("Arama yapıldı.");
        return this;
    }

}
