package io.trendyol.page;

import io.trendyol.base.BasePage;
import org.openqa.selenium.WebDriver;

import static io.trendyol.constant.ConstantBasketPage.*;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver webDriver) {
        super(webDriver);
    }

    public BasketPage increaseProductAmount(){
        click(PRODUCT_INC_BUTTON);
        logger.info("Ürün miktarı arttırıldı.");
        sleep(2);
        return this;
    }
    public BasketPage deleteProduct(){
        click(PRODUCT_DELETE_BUTTON);
        sleep(2);
        click(POPUP_DELETE_BUTTON);
        logger.info("Ürün silindi.");
        sleep(2);
        return this;
    }
}
