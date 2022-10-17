package ru.Xide.Enums.Endpoints;

public enum Drivers {
    Driver("webdriver.chrome.driver"),
    ChromePath("src/test/resources/chrome/chromedriver.exe");

    private final String value ;
    Drivers(String value) {
        this.value=value;
    }

    public String getValue(){return value;}
}
