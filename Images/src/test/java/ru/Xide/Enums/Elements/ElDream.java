package ru.Xide.Enums.Elements;

public enum ElDream {

    //css
    Input("input[placeholder ='Type anything']");

    private final String value ;
    ElDream(String value) {
        this.value=value;
    }

    public String getValue(){return value;}
}
