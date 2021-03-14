package io.trendyol.constant;

import org.openqa.selenium.By;

public class ConstantsHomePage {

    public static final By MY_ACCOUNT = By.id("myAccount");
    public static final By GENDER_POPUP = By.cssSelector("#popupContainer > div > div:nth-child(4) > a");
    public static final By SEARCH_BOX = By.cssSelector(".search-box[type='text']");
    public static final By SEARCH_BUTTON = By.cssSelector("i.search-icon");
    public static final By BASKET_HOVER_ELEMENT = By.cssSelector("div[class='account-navigation-wrapper']>div:nth-of-type(2)");
    public static final By BASKET_HOVER_BUTTON = By.cssSelector("a[class='goBasket']");
    public static final By MYBASKET_BUTTON = By.xpath("//p[contains(@class, 'link-text') and text()='Sepetim']");
}
