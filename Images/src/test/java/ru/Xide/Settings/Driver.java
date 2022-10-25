package ru.Xide.Settings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.Xide.Enums.Endpoints.Drivers;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static java.lang.String.valueOf;


public class Driver{

    public static WebDriver driver; //Экземпляр окна браузера для тестов
    private static final String ChromeDriver = valueOf(Drivers.ChromePath.getValue());
    private static final String Driver = valueOf(Drivers.Driver.getValue());


    public void driverSettings(String text){

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "C:\\Users\\Admin\\Documents\\GitHub\\CreaterImages\\Images\\src\\test\\resources\\"+text);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        options.setHeadless(true); // визуализация

        System.setProperty(Driver,ChromeDriver);

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void closeDriver(){
        driver.quit();
    }
}
