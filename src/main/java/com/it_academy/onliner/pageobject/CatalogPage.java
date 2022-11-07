package com.it_academy.onliner.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.it_academy.onliner.framework.DriverManager.getDriver;
import static java.lang.String.format;

public class CatalogPage extends BasePage{
    private static final String CATALOG_BAR_BUTTONS_XPATH_PATTERN =
            "//span[@class = 'catalog-navigation-classifier__item-title-wrapper' and contains(text(), '%s')]";
    private static final String CATALOG_COMPUTER_AND_NETS_XPATH_PATTERN =
            "//div[@class = 'catalog-navigation-list__aside-title' and contains(text(), '%s')]";


    public void clickOnCatalogBarButton(String link) {
        waitForElementVisible(By.xpath(format(CATALOG_BAR_BUTTONS_XPATH_PATTERN, link)))
                .click();
    }

    public CatalogPage clickOnCatalogClassifierButton(String link) {
        waitForElementClickable(By.xpath(format(CATALOG_BAR_BUTTONS_XPATH_PATTERN, link)))
                .click();
        return this;
    }

    public WebElement findWebElement(String link){
        WebElement element = getDriver().findElement(By.xpath(format(CATALOG_COMPUTER_AND_NETS_XPATH_PATTERN, link)));
        return element;
    }


}
