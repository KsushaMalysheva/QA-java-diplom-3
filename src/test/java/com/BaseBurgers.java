package com;

import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class BaseBurgers {

    public void startYandexBrowser() {
        ChromeDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\yanexdriver.exe");
        driver = new ChromeDriver();
        setWebDriver(driver);
    }
}
