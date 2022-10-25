package ru.Xide.Methods.Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static ru.Xide.Enums.Elements.ElDream.Input;

public class MainSteps {

    public static void generateCreate(WebDriver driver,String topic) throws InterruptedException {

        WebElement mainInput = driver.findElement(By.cssSelector(Input.getValue()));
        mainInput.click();
        mainInput.sendKeys(topic);

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
