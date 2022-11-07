package com.it_academy.onliner.pageobject;

import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class ComputerAndNetsPage extends BasePage{

    private static final String CATALOG_COMPUTER_AND_SETTS =
            "//div[@class = 'catalog-navigation-list__aside-title' and contains(text(),'%s')]";


    public void clickOnCatalogComputerAndSetts(String link) {
        waitForElementVisible(By.xpath(format(CATALOG_COMPUTER_AND_SETTS, link)))
                .click();
    }

    public List<String> getCatalogComputerAndSettsExpectedList(){
        List<String> expectedFilterNames = new ArrayList<>();
        expectedFilterNames.add("Ноутбуки, компьютеры, мониторы");
        expectedFilterNames.add("Комплектующие");
        expectedFilterNames.add("Техника для печати и дизайна");
        expectedFilterNames.add("Хранение данных");
        expectedFilterNames.add("Сетевое оборудование");
        return expectedFilterNames;
    }
}
