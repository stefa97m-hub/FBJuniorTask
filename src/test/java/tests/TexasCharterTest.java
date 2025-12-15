package tests;

import baseTest.BaseTest;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import pages.MainPage;
import pages.TexasFishingCharterPage;

import java.util.List;

public class TexasCharterTest extends BaseTest {

    @Test
    void countNumberOfChartersMoreThan10(){
        MainPage mainPage = new MainPage(driver);
        TexasFishingCharterPage texasFishingCharterPage = mainPage.TexasFishingCharters();

        assertTrue(texasFishingCharterPage
                .hasMoreFishingCharters());
    }

    @Test
    void checkCharterCardName(){
        MainPage mainPage = new MainPage(driver);
        TexasFishingCharterPage texasFishingCharterPage = mainPage.TexasFishingCharters();

        assertFalse(texasFishingCharterPage
                .checkFishingCharterName());

    }

    @Test
    void checkCharterCardBoatLength(){
        MainPage mainPage = new MainPage(driver);
        TexasFishingCharterPage texasFishingCharterPage = mainPage.TexasFishingCharters();

        assertFalse(texasFishingCharterPage
                .checkFishingCharterBoat());
    }

    @Test
    void checkCharterCardBoatMaxPeople(){
        MainPage mainPage = new MainPage(driver);
        TexasFishingCharterPage texasFishingCharterPage = mainPage.TexasFishingCharters();

        assertTrue(
                texasFishingCharterPage
                        .checkFishingCharterBoatPeople()
                        .matches("Up to \\d+ people"),
                "Text doesnt match Up to \\d+ people" + texasFishingCharterPage
                        .checkFishingCharterBoatPeople()
        );
    }

    @Test
    void checkCharterCardBoatPrice(){
        MainPage mainPage = new MainPage(driver);
        TexasFishingCharterPage texasFishingCharterPage = mainPage.TexasFishingCharters();

        assertTrue(
                texasFishingCharterPage
                        .checkFishingCharterPriceText()
                        .matches("Trips from"),
                "Text doesnt match 'Trips from'" + texasFishingCharterPage
                        .checkFishingCharterPriceText()
        );
        assertFalse(
                texasFishingCharterPage
                        .checkFishingCharterPriceNumber()
                        .isBlank()
        );
    }

    @Test
    void checkCharterCardWishlist(){
        MainPage mainPage = new MainPage(driver);
        TexasFishingCharterPage texasFishingCharterPage = mainPage.TexasFishingCharters();

        assertTrue(texasFishingCharterPage
                .checkFishingCharterWishlist()
                .matches("Add listing to wishlist")
        );
    }

    @Test
    void checkCharterCardAvaiablityButton(){
        MainPage mainPage = new MainPage(driver);
        TexasFishingCharterPage texasFishingCharterPage = mainPage.TexasFishingCharters();

        assertTrue(texasFishingCharterPage.getFirstCharterAvailabilityButton()
        );
    }

    @Test
    void clickPriceLowestButtonAndThenHighestSort(){
        MainPage mainPage = new MainPage(driver);
        TexasFishingCharterPage texasFishingCharterPage = mainPage.TexasFishingCharters();

        texasFishingCharterPage.clickOnPriceLowest();
        List<Integer> prices = texasFishingCharterPage.listOfPrices();

        assertTrue(
                texasFishingCharterPage.pricesRising(prices)
        );

        texasFishingCharterPage.clickOnSortHighestAndApply();
        List<Integer> prices1 = texasFishingCharterPage.listOfPrices();

        assertTrue(
                texasFishingCharterPage.pricesFalling(prices1)
        );

    }
}
