package com.it_academy.test;

import com.it_academy.onliner.pageobject.HomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ComputersAndNetsTest {
    private static HomePage homePage = new HomePage();

    @BeforeEach
    public void navigateToOnlinerPage() {
        homePage.navigate("https://www.onliner.by/");
        WebElement element = homePage.waitForElementVisible(By.xpath("//span[@class = 'b-main-navigation__text' and contains(text(), 'Каталог')]"));
        element.click();
        WebElement computersElement = homePage.waitForElementToBeClickable(By.xpath("//span[@class = 'catalog-navigation-classifier__item-title-wrapper' and contains(text(), 'Компьютеры')]"));
        computersElement.click();
    }

    @Test
    @Disabled
    public void testListExist() {
        WebElement listOfElements = homePage.waitForElementVisible(By.xpath("//div[@class = 'catalog-navigation-list__aside catalog-navigation-list__aside_active']/div[@class = 'catalog-navigation-list__aside-list']"));
        listOfElements.findElement(By.xpath("//div[@class = 'catalog-navigation-list__aside-title' and contains(text(), 'компьютеры, мониторы')]"));
    }

    @Test
    public void testNoteBooks() {
        WebElement noteBooksElement = homePage.waitForElementVisible(By.xpath("//div[@class = 'catalog-navigation-list__aside-title' and contains(text(), 'компьютеры, мониторы')]"));
        noteBooksElement.click();
    }

    @Test
    public void testAccessories() {
        WebElement accessoriesElement = homePage.waitForElementVisible(By.xpath("//div[(normalize-space(text())) = 'Комплектующие']"));
        accessoriesElement.click();
    }

    @Test
    public void testDataStorage() {
        WebElement dataStorageElement = homePage.waitForElementVisible(By.xpath("//div[@class = 'catalog-navigation-list__aside-title' and contains(text(), 'Хранение')]"));
        dataStorageElement.click();
    }

    @Test
    public void testNetworkHardware() {
        WebElement networkHardwareElement = homePage.waitForElementVisible(By.xpath("//div[@class = 'catalog-navigation-list__aside-title' and contains(text(), 'Сетевое')]"));
        networkHardwareElement.click();
    }



    @AfterAll
    static void closeBrowser() {
        homePage.closeBrowser();
    }
}
