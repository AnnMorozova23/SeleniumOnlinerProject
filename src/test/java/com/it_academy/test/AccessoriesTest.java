package com.it_academy.test;

import com.it_academy.onliner.pageobject.HomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class AccessoriesTest {

    private static HomePage homePage = new HomePage();

    @BeforeEach
    public void navigateToOnlinerPage() {
        homePage.navigate("https://www.onliner.by/");
        WebElement element = homePage.waitForElementVisible(By.xpath("//span[@class = 'b-main-navigation__text' and contains(text(), 'Каталог')]"));
        element.click();
        WebElement computersElement = homePage.waitForElementToBeClickable(By.xpath("//span[@class = 'catalog-navigation-classifier__item-title-wrapper' and contains(text(), 'Компьютеры')]"));
        computersElement.click();
        WebElement accessoriesElement = homePage.waitForElementToBeClickable(By.xpath("//div[(normalize-space(text())) = 'Комплектующие']"));
        accessoriesElement.click();
    }

    @Test
    public void testVideoKarts() {
        WebElement videoElement = homePage.waitForElementToBeClickable(By.xpath("//a[@href = 'https://catalog.onliner.by/videocard' and contains(@class, 'catalog-navigation-list__dropdown-item')]"));
        videoElement.findElement(By.xpath("//span[@class = 'catalog-navigation-list__dropdown-title' and contains(text(), 'Видеокарты')]"));

    }

    @Test
    public void testCpu() {
        WebElement cpuElement = homePage.waitForElementToBeClickable(By.xpath("//a[@href = 'https://catalog.onliner.by/cpu' and contains(@class, 'catalog-navigation-list__dropdown-item')]"));
        cpuElement.findElement(By.xpath("//span[@class = 'catalog-navigation-list__dropdown-title' and contains(text(), 'Процессоры')]"));
    }



    @AfterAll
    static void closeBrowser() {
        homePage.closeBrowser();
    }
}
