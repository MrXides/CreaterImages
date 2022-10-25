package ru.Xide.Methods.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ru.Xide.Settings.Driver;

import static ru.Xide.Enums.Elements.ElDream.Input;
import static ru.Xide.Settings.Driver.driver;

public class MainHelpers {

    public static void openNeron (String path) {
        try {
            driver.get(path);
        } catch (Exception e) {
            // Сюда скриншотер
            Assert.fail(e.getMessage());
        }
    }
}
