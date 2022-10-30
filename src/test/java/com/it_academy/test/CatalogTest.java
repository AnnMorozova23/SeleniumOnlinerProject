package com.it_academy.test;

import com.it_academy.onliner.pageobject.HomePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class CatalogTest {
    private static HomePage homePage = new HomePage();

    @BeforeEach
    public void navigateToOnlinerPage() {
        homePage.navigate("https://www.onliner.by/");
        WebElement element = homePage.waitForElementVisible(By.xpath("//span[@class = 'b-main-navigation__text' and contains(text(), 'Каталог')]"));
        element.click();
    }

    @Test
    public void testElectronica() {
        WebElement electronicaElement = homePage.waitForElementToBeClickable(By.xpath("//span[contains (text(), 'Электроника')]"));
        electronicaElement.click();
    }

    @Test
    public void testComputersAndNets() {
        WebElement computerElement = homePage.waitForElementToBeClickable(By.xpath("//span[@class = 'catalog-navigation-classifier__item-title-wrapper' " +
                "and contains(text(), 'Компьютеры')]"));
        computerElement.click();
    }

    @Test
    public void testAppliances() {
        WebElement appliancesElement = homePage.waitForElementToBeClickable(By.xpath("//span[@class = 'catalog-navigation-classifier__item-title-wrapper' " +
                "and contains(text(), 'Бытовая')]"));
        appliancesElement.click();
    }

    @Test
    public void testConstructionAndRepair() {
        WebElement constructionElement = homePage.waitForElementToBeClickable(By.xpath("//span[contains(text(),'Стройка')]"));
        constructionElement.click();
    }

    @Test
    public void testHomeAndGarden() {
        WebElement homeElement = homePage.waitForElementToBeClickable(By.xpath("//span[contains(@class, 'catalog-navigation-classifier') and contains(text(), 'Дом')]"));
        homeElement.click();
    }

    @Test
    public void testAutoAndMoto() {
        WebElement autoElement = homePage.waitForElementToBeClickable(By.xpath("//span[contains(@class, 'catalog-navigation-classifier') and contains(text(), 'Авто')]"));
        autoElement.click();
    }

    @Test
    public void testBeautyAndSport() {
        WebElement beautyElement = homePage.waitForElementToBeClickable(By.xpath("//span[contains(@class, 'catalog-navigation-classifier') and contains(text(), 'Красота')]"));
        beautyElement.click();
    }

    @Test
    public void testChildrenAndMoms() {
        WebElement childrenElement = homePage.waitForElementToBeClickable(By.xpath("//span[contains(@class, 'catalog-navigation-classifier') and contains(text(), 'Детям')]"));
        childrenElement.click();
    }

    @Test
    public void testWorkAndOffice() {
        WebElement workElement = homePage.waitForElementToBeClickable(By.xpath("//span[contains(@class, 'catalog-navigation-classifier') and contains(text(), 'Работа')]"));
        workElement.click();
    }


    @AfterAll
    static void closeBrowser() {
        homePage.closeBrowser();
    }

}
