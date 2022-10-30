package com.it_academy.test;

import com.it_academy.onliner.pageobject.HomePage;
import org.junit.jupiter.api.*;

public class OnlinerTest {
    private HomePage homePage = new HomePage();

    @BeforeEach
    public void navigateToOnlinerPage() {
        homePage.navigate("https://www.onliner.by/");
    }

    @Test
    public void testOnlinerBrowserTitle() {
        System.out.println("Hi");
    }

    @AfterEach
    public void closeBrowser() {
        homePage.closeBrowser();
    }
}
