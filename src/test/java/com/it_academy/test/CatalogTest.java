package com.it_academy.test;


import com.it_academy.onliner.pageobject.Header;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.it_academy.onliner.framework.DriverManager.getDriver;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CatalogTest extends BaseTest {

    private Header header;

    @BeforeClass
    public void webDriverInit() {
        header = new Header();
        getDriver().get("https://www.onliner.by/");
    }

    @Test
    public void testElectronicaPage() {
        header.clickOnCatalogLink()
                .clickOnCatalogBarButton("Электроника");
    }

    @Test
    public void testComputerAndNetsPage() {
        header.clickOnCatalogLink()
                .clickOnCatalogBarButton("Компьютеры");
    }

    @Test
    public void testAppliancesPage() {
        header.clickOnCatalogLink()
                .clickOnCatalogBarButton("Бытовая");
    }

    @Test
    public void testConstructionAndRepairPage() {
        header.clickOnCatalogLink()
                .clickOnCatalogBarButton("Стройка");
    }

    @Test
    public void testHomeAndGardenPage() {
        header.clickOnCatalogLink()
                .clickOnCatalogBarButton("Дом");
    }

    @Test
    public void testAutoAndMotoPage() {
        header.clickOnCatalogLink()
                .clickOnCatalogBarButton("Авто");
    }

    @Test
    public void testBeautyAndSportPage() {
        header.clickOnCatalogLink()
                .clickOnCatalogBarButton("Красота");
    }

    @Test
    public void testChildrenAndMomsPage() {
        header.clickOnCatalogLink()
                .clickOnCatalogBarButton("Детям");
    }

    @Test
    public void testWorkAndOfficePage() {
        header.clickOnCatalogLink()
                .clickOnCatalogBarButton("Работа");
    }
}
