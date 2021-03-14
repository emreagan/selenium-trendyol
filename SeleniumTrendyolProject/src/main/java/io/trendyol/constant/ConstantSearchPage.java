package io.trendyol.constant;

import org.openqa.selenium.By;

public class ConstantSearchPage {
    public static final By ASCENDING_PRICE = By.cssSelector("div[class='sort-fltr-cntnr']>select");
    public static final By FILTER_LOGITECH = By.cssSelector(".fltrs >a:nth-of-type(6)");
    public static final By CHEAPEST_PRODUCT = By.cssSelector("div[class='prdct-cntnr-wrppr']>div>div>a:nth-of-type(1)");
    public static final By DEACTIVATE_SELECTED_FILTER = By.xpath("//div[contains(@class, 'fltr-item-text') and text()='logitech']");
    public static final By FILTER_A4TECH = By.xpath("//div[contains(@class, 'fltr-item-text') and text()='A4 Tech']");
}
