package ru.Xide.Methods.Helpers;

import org.testng.Assert;

import static ru.Xide.Settings.Driver.driver;

public class MainHelpers {

    public static void openNeron (String path) {
        try {
            driver.get(path);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }
}
