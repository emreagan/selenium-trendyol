package io.trendyol.page;

import io.trendyol.base.BasePage;
import org.openqa.selenium.WebDriver;

import static io.trendyol.constant.ConstantSearchPage.*;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver webDriver) {
        super(webDriver);
    }
    public SearchPage filterLogitech(){
        clickWithJs(FILTER_LOGITECH);
        logger.info("Logitech marka filtrelemesi yapıldı.");
        sleep(2);
        return this;
    }

    public SearchPage listByPriceAsc(){
        selectByValue(ASCENDING_PRICE,"PRICE_BY_ASC");
        logger.info("Azalan fiyata göre listeleme yapıldı.");
        sleep(2);
        return this;
    }
    public SearchPage selectProduct(){
        clickWithJs(CHEAPEST_PRODUCT);
        logger.info("En ucuz ürün seçildi");
        sleep(3);
        return this;
    }

    public SearchPage deactivateLogitech(){
        click(DEACTIVATE_SELECTED_FILTER);
        logger.info("Logitech marka filtresi iptal edildi.");
        sleep(2);
        return this;
    }
    public SearchPage filterA4Tech(){
        click(FILTER_A4TECH);
        logger.info("A4 Tech marka filtrelemesi yapıldı.");
        sleep(2);
        return this;
    }


}
