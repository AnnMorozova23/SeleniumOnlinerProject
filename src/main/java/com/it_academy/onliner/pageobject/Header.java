package com.it_academy.onliner.pageobject;

import org.openqa.selenium.By;

import static java.lang.String.format;

public class Header extends BasePage {
    private static final String MAIN_NAVIGATION_LINK_XPATH_PATTERN =
            "//*[@class='b-main-navigation__text' and contains(text(), '%s')]";

    public void clickOnMainNavigationLink(String link) {
        waitForElementVisible(By.xpath(format(MAIN_NAVIGATION_LINK_XPATH_PATTERN, link))).click();
    }

    public CatalogPage clickOnCatalogLink() {
        clickOnMainNavigationLink("Каталог");
        return new CatalogPage();
    }
}
