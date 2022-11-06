package com.it_academy.onliner.pageobject;

import org.openqa.selenium.By;

import static java.lang.String.format;

public class ComputerAndNetsPage extends BasePage{

    private static final String CATALOG_COMPUTER_AND_SETTS =
            "//div[@class = 'catalog-navigation-list__aside-title' and contains(text(),'%s')]";


    public void clickOnCatalogComputerAndSetts(String link) {
        waitForElementVisible(By.xpath(format(CATALOG_COMPUTER_AND_SETTS, link)))
                .click();
    }
}
