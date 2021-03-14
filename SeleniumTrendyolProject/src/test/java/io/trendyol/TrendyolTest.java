package io.trendyol;

import io.trendyol.base.BaseTest;
import io.trendyol.page.BasketPage;
import io.trendyol.page.HomePage;
import io.trendyol.page.ProductDetailPage;
import io.trendyol.page.SearchPage;
import org.junit.Before;
import org.junit.Test;

public class TrendyolTest extends BaseTest {

    HomePage homePage;
    ProductDetailPage productPage;
    SearchPage searchPage;
    BasketPage basketPage;

    @Before
    public void install() {
        homePage = new HomePage(getWebDriver());
        productPage=new ProductDetailPage(getWebDriver());
        searchPage=new SearchPage(getWebDriver());
        basketPage=new BasketPage(getWebDriver());

    }

    @Test
    public void openHomePageTest() throws Exception {

        homePage
                .openHomePage().selectGender().searchProduct("webcam");

        searchPage
                .filterLogitech().listByPriceAsc().selectProduct().switchToNewTab();

        productPage
                .scrollToReviewersNumber().reviewersNumber().commentsNumber().switchToOldTab();

        searchPage
                .deactivateLogitech().filterA4Tech().listByPriceAsc().selectProduct().switchToNewTab();
        productPage
                .scrollToFirstComment() .getFirstComment() .addToBasket() .goToBasket();
        basketPage
                .increaseProductAmount().deleteProduct();
    }


}
