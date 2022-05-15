package com;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseBurgers {

    public void startYandexBrowser() {
        ChromeDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\OneDrive\\Рабочий стол\\тестировщик\\Автоматизация_тестирования_на_java\\QA-java-diplom-3\\src\\main\\resources\\yandexdriver.exe");
        driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

    }
}
