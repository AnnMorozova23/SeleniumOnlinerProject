package com.it_academy.onliner.pageobject;

import org.openqa.selenium.By;

import static java.lang.String.format;

public class CatalogPage extends BasePage{
    private static final String CATALOG_BAR_BUTTONS_XPATH_PATTERN =
            "//span[@class = 'catalog-navigation-classifier__item-title-wrapper' and contains(text(), '%s')]";


    public void clickOnCatalogBarButton(String link) {
        waitForElementVisible(By.xpath(format(CATALOG_BAR_BUTTONS_XPATH_PATTERN, link)))
                .click();
    }

    public CatalogPage clickOnCatalogClassifierButton(String link) {
        waitForElementClickable(By.xpath(format(CATALOG_BAR_BUTTONS_XPATH_PATTERN, link)))
                .click();
        return this;
    }


}
