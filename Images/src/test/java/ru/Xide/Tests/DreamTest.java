package ru.Xide.Tests;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import ru.Xide.Settings.Driver;

import static ru.Xide.Enums.Endpoints.URL.Dream;

import static ru.Xide.Methods.Helpers.MainHelpers.openNeron;
import static ru.Xide.Methods.Main.MainSteps.generateCreate;



@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DreamTest extends Driver {

    public static String path = Dream.getValue();

    @Test
    public void catNero() throws Exception {
        String topic = "Cat";
        String dir = "Cats";

        driverSettings(dir);

        openNeron(path);
        generateCreate(driver, topic);
    }

    @Test
    public void dogNero() throws Exception {
        String topic = "Dog";
        String dir = "Dogs";

        driverSettings(dir);

        openNeron(path);
        generateCreate(driver, topic);
    }

    @Test
    public void roninNero() throws Exception {
        String topic = "Ronin";

        driverSettings(topic);

        openNeron(path);
        generateCreate(driver, topic);
    }

    @Test
    public void samuraiNero() throws Exception {
        String topic = "Samurai";

        driverSettings(topic);

        openNeron(path);
        generateCreate(driver, topic);
    }

    @Test
    public void tigerNero() throws Exception {
        String topic = "Tiger";

        driverSettings(topic);

        openNeron(path);
        generateCreate(driver, topic);
    }

    @Test
    public void deerNero() throws Exception {
        String topic = "Deer";

        driverSettings(topic);

        openNeron(path);
        generateCreate(driver, topic);
    }
}
