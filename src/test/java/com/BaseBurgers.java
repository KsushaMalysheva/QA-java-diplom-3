package com;

import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class BaseBurgers {

    public void startYandexBrowser() {
        ChromeDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\OneDrive\\Рабочий стол\\тестировщик\\Автоматизация_тестирования_на_java\\QA-java-diplom-3\\src\\main\\resources\\yandexdriver.exe");
        driver = new ChromeDriver();
        setWebDriver(driver);

    }
}
