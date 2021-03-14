package io.trendyol.page;

import io.trendyol.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static io.trendyol.constant.ConstantProductPage.*;
import static io.trendyol.constant.ConstantProductPage.ADD_TO_BASKET_BUTTON;
import static io.trendyol.constant.ConstantProductPage.FIRST_COMMENT;
import static io.trendyol.constant.ConstantProductPage.PRODUCT_COMMENTS;
import static io.trendyol.constant.ConstantProductPage.PRODUCT_REVIEWERS;
import static io.trendyol.constant.ConstantsHomePage.*;
import static io.trendyol.constant.ConstantsHomePage.MYBASKET_BUTTON;


public class ProductDetailPage extends BasePage {
    public ProductDetailPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ProductDetailPage reviewersNumber(){
        WebElement element=findElement(PRODUCT_REVIEWERS);
        logger.info("Değerlendirme sayısı:" + element.getText());
        sleep(2);
        return this;
    }
    public ProductDetailPage scrollToReviewersNumber(){
        scrollToElement(PRODUCT_REVIEWERS);
        logger.info("Ekran scroll edildi.");
        sleep(2);
        return this;
    }

    public ProductDetailPage scrollToFirstComment(){
        scrollToElement(FIRST_COMMENT);
        logger.info("İlk yoruma kadar scroll yapıldı.");
        sleep(2);
        return this;
    }
    public ProductDetailPage commentsNumber(){
        WebElement element=findElement(PRODUCT_COMMENTS);
        logger.info("Yorum sayısı:" + element.getText());
        return this;
    }
    public ProductDetailPage getFirstComment(){
        logger.info("İlk yorum"+getText(FIRST_COMMENT));
        sleep(2);
        return this;
    }
    public ProductDetailPage addToBasket(){
        clickWithJs(ADD_TO_BASKET_BUTTON);
        logger.info("Ürün sepete eklendi");
        sleep(2);
        return this;
    }
    public ProductDetailPage goToBasket(){
        click(MYBASKET_BUTTON);
        sleep(2);
        logger.info("Sepetime gidildi");
        return this;
    }
}
