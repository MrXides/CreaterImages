package ru.Xide.Methods.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ru.Xide.Settings.Driver;

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

    public static void generateCreate(WebDriver driver) throws InterruptedException {
        String input = "//*[@id=\"blur-overlay\"]/div/div/div[1]/div[1]/div[1]/div[1]/div[1]/input";

        WebElement mainInput = driver.findElement(By.xpath(input));
        mainInput.click();
        mainInput.sendKeys("Ronin");

        int i = 100;
        while (i >= 0) {

        WebElement lineArt = driver.findElement(By.xpath("//*[@id=\"blur-overlay\"]/div/div/div[1]/div[1]/div[1]/div[2]/div/div[2]/div[13]/div/div/img"));
        lineArt.click();
        driver.findElement(By.xpath("//*[@id=\"blur-overlay\"]/div/div/div[1]/div[2]/button")).click();

            new WebDriverWait(driver, 3000).
                    until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"blur-overlay\"]/div/div/div[2]/div/div[2]/button/div/div")));

            driver.findElement(By.xpath("//*[@id=\"blur-overlay\"]/div/div/div[2]/div/div[2]/button/div/div")).click();

            driver.findElement(By.xpath("//*[@id=\"blur-overlay\"]/div/div/div/div[1]/div/button")).click();
            Thread.sleep(2000);
            i--;
        }
    }
}
