package ru.Xide.Settings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import ru.Xide.Enums.Endpoints.Drivers;
import ru.Xide.Enums.Endpoints.URL;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static java.lang.String.valueOf;

public class Driver {

    public static WebDriver driver; //Экземпляр окна браузера для тестов
    public static URL Dream = URL.Dream;
    private static final String ChromeDriver = valueOf(Drivers.ChromePath.getValue());
    private static final String Driver = valueOf(Drivers.Driver.getValue());

//    @BeforeTest
//    public static void beforeTests() {
//    }

    @Before
    public void driverSettings() throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false); // визуализация

        System.setProperty(Driver,ChromeDriver);

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void closeDriver(){
        driver.quit();
    }
}
