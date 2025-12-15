package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public TexasFishingCharterPage TexasFishingCharters(){
        driver.findElement(By.xpath("//*[@id=\"main-content-tab\"]/div[1]/ul/li[39]/a")).click();
        return new TexasFishingCharterPage(driver);
    }

}
