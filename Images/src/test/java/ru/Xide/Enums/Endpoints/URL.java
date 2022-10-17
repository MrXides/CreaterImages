package ru.Xide.Enums.Endpoints;

public enum URL {
    Dream("https://www.wombo.art/create");

    private final String value ;

    URL (String value) {
        this.value=value;
    }
    public String getValue(){return value;}

}
