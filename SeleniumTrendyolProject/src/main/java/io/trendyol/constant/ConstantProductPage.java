package io.trendyol.constant;

import org.openqa.selenium.By;

public class ConstantProductPage {
    public static final By PRODUCT_REVIEWERS = By.cssSelector("div[class='pr-rnr-sm-p-s']>span:nth-of-type(1)");
    public static final By PRODUCT_COMMENTS = By.cssSelector("div[class='pr-rnr-sm-p-s']>span:nth-of-type(2)");
    public static final By FIRST_COMMENT = By.cssSelector("div[class=\"rnr-com-cn\"]>div:nth-of-type(1)");
    public static final By ADD_TO_BASKET_BUTTON = By.cssSelector("div[class='add-to-bs-wrp']>button");

}
