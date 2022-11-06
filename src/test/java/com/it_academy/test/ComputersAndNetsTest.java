package com.it_academy.test;

import com.it_academy.onliner.pageobject.Header;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.it_academy.onliner.framework.DriverManager.getDriver;


public class ComputersAndNetsTest extends BaseTest {
    private Header header;
    private static final String CATALOG_NAVIGATION_LIST = "//div[@class = 'catalog-navigation-list__aside catalog-navigation-list__aside_active']/div[@class = 'catalog-navigation-list__aside-list']";

    @BeforeClass
    public void webDriverInit() {
        header = new Header();
        getDriver().get("https://www.onliner.by/");

    }

    @Test
    public void testComputerAndNetsPage() {
        List<String> expectedFilterNames = new ArrayList<>();
        expectedFilterNames.add("Ноутбуки, компьютеры, мониторы");
        expectedFilterNames.add("Комплектующие");
        expectedFilterNames.add("Техника для печати и дизайна");
        expectedFilterNames.add("Хранение данныех");
        expectedFilterNames.add("Сетевое оборудование");

        header.clickOnCatalogLink()
                .clickOnCatalogBarButton("Компьютеры");

        WebElement element_1 = getDriver().findElement(By.xpath("//div[@class = 'catalog-navigation-list__aside-title' and contains(text(), 'компьютеры, мониторы')]"));
        String noteBookText = element_1.getText();

        WebElement element_2 = getDriver().findElement(By.xpath("//div[@class = 'catalog-navigation-list__aside-title' and contains(text(), 'Комплектующие')]"));
        String accessoriesText = element_2.getText();

        List<WebElement> filters = getDriver().findElements(By.xpath(CATALOG_NAVIGATION_LIST));

        List<String> filterNames = filters
                .stream()
                .map(el -> el.getText())
                .collect(Collectors.toList());

        Assertions.assertThat(expectedFilterNames).contains(noteBookText).contains(accessoriesText);

    }
}
