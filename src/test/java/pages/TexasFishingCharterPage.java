package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;

public class TexasFishingCharterPage {

    private WebDriver driver;

    public TexasFishingCharterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private By fishingListCharterAvailable = By.xpath( "//div[@data-testid='all-charters-cards-container']/div");
    private By fishingFirstCharterAvailable = By.xpath( "//div[@data-testid='all-charters-cards-container']/div[1]");
    private By fishingFirstCharterName = By.xpath("//div[@data-testid='all-charters-cards-container']/div[1]/div/div/div/p/a/span");
    private By fishingFirstCharterBoat = By.xpath("//div[@data-testid='all-charters-cards-container']/div[1]/div/div[3]/div/div/p/span");
    private By fishingFirstCharterBoatPeople = By.xpath("//div[@data-testid='all-charters-cards-container']/div[1]/div/div[3]/div/p/span");
    private By fishingFirstCharterPriceText = By.xpath("//div[@data-testid='all-charters-cards-container']/div[1]/div[2]/div[2]/div[2]/div/div[1]");
    private By fishingFirstCharterPriceNumber = By.xpath("//div[@data-testid='all-charters-cards-container']/div[1]/div[2]/div[2]/div[2]/div/div[2]");
    private By fishingFirstCharterWishlistTip = By.xpath("/html/body/div[2]/div/div/div/div");
    private By fishingFirstCharterAvailabilityButton = By.xpath("//div[@data-testid='all-charters-cards-container']/div[1]/div/div/div[3]/a");
    private By fishingFirstCharterPriceLowest = By.xpath("//*[@id=\"search-results\"]/div/div[3]/div/div/div[2]/a[3]");
    private By fishingFirstCharterPrices = By.xpath("//*[@data-testid=\"single-charter-card-container\"]/div[2]/div[4]/div[2]/div/div[2]");
    private By fishingFirstCharterSortPrices = By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div");
    private By fishingFirstCharterSortPricesHighest = By.xpath("//*[@id=\"radix-:r5:\"]/div/div/div[2]");
    private By fishingFirstCharterSortPricesApply = By.xpath("//*[@id=\"radix-:r5:\"]/div/button");


    @FindBy(xpath = "//div[@data-testid='all-charters-cards-container']/div[1]/div[2]/div/div[2]/button") WebElement fishingFirstCharterWishlist;

    private int getFishingCharterCount() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .numberOfElementsToBeMoreThan(fishingListCharterAvailable, 0));

        return driver
                .findElements(fishingListCharterAvailable)
                .size();
    }

    public boolean hasMoreFishingCharters() {
        return getFishingCharterCount() > 10;
    }

    private String getFirstCharterName(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .visibilityOfAllElementsLocatedBy(fishingFirstCharterName));

        return driver.findElements(fishingFirstCharterName)
                .getFirst()
                .getText();
    }

    public boolean checkFishingCharterName(){
        return getFirstCharterName()
                .isBlank();
    }

    private String getFirstCharterBoat(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .visibilityOfAllElementsLocatedBy(fishingFirstCharterAvailable));

        return driver
                .findElements(fishingFirstCharterBoat)
                .getFirst()
                .getText();
    }

    public boolean checkFishingCharterBoat(){
        return getFirstCharterBoat()
                .isBlank();
    }

    private String getFirstCharterBoatPeople(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .visibilityOfAllElementsLocatedBy(fishingFirstCharterAvailable));

        return driver
                .findElements(fishingFirstCharterBoatPeople)
                .getFirst()
                .getText();
    }

    public String checkFishingCharterBoatPeople(){
        return getFirstCharterBoatPeople();
    }

    private String getFirstCharterPriceText(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .visibilityOfAllElementsLocatedBy(fishingFirstCharterAvailable));

        return driver
                .findElements(fishingFirstCharterPriceText)
                .getFirst()
                .getText();
    }

    public String checkFishingCharterPriceText(){
        return getFirstCharterPriceText();
    }

    private String getFirstCharterPriceNumber(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .visibilityOfAllElementsLocatedBy(fishingFirstCharterAvailable));

        return driver
                .findElements(fishingFirstCharterPriceNumber)
                .getFirst()
                .getText();
    }

    public String checkFishingCharterPriceNumber(){
        return getFirstCharterPriceNumber();
    }

    private String getFirstCharterWishlist(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .visibilityOfAllElementsLocatedBy(fishingFirstCharterAvailable));

        Actions action = new Actions(driver);
        action.moveToElement(fishingFirstCharterWishlist).perform();

        return driver
                .findElements(fishingFirstCharterWishlistTip)
                .getFirst()
                .getText();
    }

    public String checkFishingCharterWishlist(){
        return getFirstCharterWishlist();
    }

    public boolean getFirstCharterAvailabilityButton(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .visibilityOfAllElementsLocatedBy(fishingFirstCharterAvailable));

        return driver
                .findElements(fishingFirstCharterAvailabilityButton)
                .getFirst().isEnabled();
    }

    public void clickOnPriceLowest(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(fishingFirstCharterAvailable));

        driver.findElement(fishingFirstCharterPriceLowest).click();
    }

    public List<Integer> listOfPrices(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(fishingFirstCharterAvailable));

        return driver.findElements(fishingFirstCharterPrices)
                .stream()
                .map(WebElement::getText)
                .map(text -> text.replaceAll("[^0-9]", ""))
                .map(Integer::parseInt).toList();
    }

    public boolean pricesRising(List<Integer> prices){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(fishingFirstCharterAvailable));

        for (int i = 0; i < prices.size() - 1; i++) {
            if(prices.get(i) > prices.get(i + 1)){
                return false;
            }
        }
        return true;
    }

    public boolean pricesFalling(List<Integer> prices){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(fishingFirstCharterAvailable));

        for (int i = 0; i < prices.size() - 1; i++) {
            if(prices.get(i) < prices.get(i + 1)){
                return false;
            }
        }
        return true;
    }

    public void clickOnSortHighestAndApply(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(fishingFirstCharterAvailable));

        driver.findElement(fishingFirstCharterSortPrices).click();
        driver.findElement(fishingFirstCharterSortPricesHighest).click();
        driver.findElement(fishingFirstCharterSortPricesApply).click();
    }

}
