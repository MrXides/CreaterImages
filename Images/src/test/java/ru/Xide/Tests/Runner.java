package ru.Xide.Tests;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.testng.annotations.BeforeMethod;
import ru.Xide.Settings.Driver;

import static ru.Xide.Methods.Helpers.MainHelpers.generateCreate;
import static ru.Xide.Methods.Helpers.MainHelpers.openNeron;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Runner extends Driver {


    public static String path;

    @Test
    public void startNero() throws Exception {

        path = Dream.getValue();

        openNeron(Dream.getValue());

        generateCreate(driver);
    }
}
