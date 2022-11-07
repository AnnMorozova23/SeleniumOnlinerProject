package com.it_academy.test;

import com.it_academy.onliner.pageobject.CatalogPage;
import com.it_academy.onliner.pageobject.ComputerAndNetsPage;
import com.it_academy.onliner.pageobject.Header;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;


import static com.it_academy.onliner.framework.DriverManager.getDriver;


public class ComputersAndNetsTest extends BaseTest {
    private Header header;
    private ComputerAndNetsPage computerAndNetsPage;
    private CatalogPage catalogPage;
    private static final String CATALOG_NAVIGATION_LIST = "//div[@class = 'catalog-navigation-list__aside catalog-navigation-list__aside_active']/div[@class = 'catalog-navigation-list__aside-list']";

    @BeforeClass
    public void webDriverInit() {
        header = new Header();
        computerAndNetsPage = new ComputerAndNetsPage();
        catalogPage = new CatalogPage();
        getDriver().get("https://www.onliner.by/");

    }

    @Test
    public void testNoteBookAndMonitorsElementsExist() {
        List<String> expectedFilterNames = computerAndNetsPage.getCatalogComputerAndSettsExpectedList();
        header.clickOnCatalogLink()
                .clickOnCatalogBarButton("Компьютеры");
        WebElement noteBook = catalogPage.findWebElement("компьютеры, мониторы");
        String noteBookText = noteBook.getText();
        Assertions.assertThat(expectedFilterNames).contains(noteBookText);

    }

    @Test
    public void testAccessoriesElementExist() {
        List<String> expectedFilterNames = computerAndNetsPage.getCatalogComputerAndSettsExpectedList();
        header.clickOnCatalogLink()
                .clickOnCatalogBarButton("Компьютеры");
        WebElement accessories = catalogPage.findWebElement("Комплектующие");
        String accessoriesText = accessories.getText();
        Assertions.assertThat(expectedFilterNames).contains(accessoriesText);
    }

    @Test
    public void testDataStorageElementExist() {
        List<String> expectedFilterNames = computerAndNetsPage.getCatalogComputerAndSettsExpectedList();
        header.clickOnCatalogLink()
                .clickOnCatalogBarButton("Компьютеры");
        WebElement dataStorage = catalogPage.findWebElement("Хранение данных");
        String dataStorageText = dataStorage.getText();
        Assertions.assertThat(expectedFilterNames).contains(dataStorageText);
    }
}
