package ru.Xide.Main;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Runner {

    @Test
    public void openNero() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false); // визуализация

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chrome/chromedriver.exe");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.wombo.art/create");

        String input = "//*[@id=\"blur-overlay\"]/div/div/div[1]/div[1]/div[1]/div[1]/div[1]/input";

        WebElement mainInput = driver.findElement(By.xpath(input));
        mainInput.click();
        mainInput.sendKeys("Cat");

        int i = 850;
        while (i >= 0) {

        WebElement lineArt = driver.findElement(By.xpath("//*[@id=\"blur-overlay\"]/div/div/div[1]/div[1]/div[1]/div[2]/div/div[2]/div[12]/div/div/img"));
        lineArt.click();
        driver.findElement(By.xpath("//*[@id=\"blur-overlay\"]/div/div/div[1]/div[2]/button")).click();

            new WebDriverWait(driver, 3000).
                    until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"blur-overlay\"]/div/div/div[2]/div/div[2]/button/div/div")));

            driver.findElement(By.xpath("//*[@id=\"blur-overlay\"]/div/div/div[2]/div/div[2]/button/div/div")).click();

            driver.findElement(By.xpath("//*[@id=\"blur-overlay\"]/div/div/div/div[1]/div/button")).click();
            Thread.sleep(2000);
            i--;
        }
        driver.quit();
    }
}
