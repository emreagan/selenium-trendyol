package io.trendyol.constant;

import org.openqa.selenium.By;

public class ConstantBasketPage {

    public static final By PRODUCT_INC_BUTTON = By.cssSelector("button[class='ty-numeric-counter-button']");
    public static final By PRODUCT_DELETE_BUTTON = By.cssSelector("div[class='pb-basket-item-actions']>button");
    public static final By POPUP_DELETE_BUTTON = By.cssSelector("div[class='btnBox']>button:nth-of-type(2)");
}
