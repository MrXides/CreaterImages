package ru.Xide.Enums.InputData;

public enum Animals {

    Antelope("Antelope"),
    Badger("Badger"),
    Bear("Bear"),
    Bison("Bison"),
    Boar("Boar"),
    Bat("Bat"),
    Bull("Bull"),
    Cat("Cat"),
    Chimpanzee("Chimpanzee"),
    Chipmunk("Chipmunk"),
    Camel("Camel"),
    Crocodile("Crocodile"),
    Cow("Cow"),
    Calf("Calf"),
    Deer("Deer"),
    Dog("Dog"),
    Donkey("Donkey"),
    Duck("Duck"),
    Elephant("Elephant"),
    Ferret("Ferret"),
    Fox("Fox"),
    Frog("Frog"),
    Foal("Foal"),
    Giraffe("Giraffe"),
    Gerbil("Gerbil"),
    Goat("Goat"),
    Hare("Hare"),
    Hamster("Hamster"),
    Hedgehog("Hedgehog"),
    Hippopotamus("Hippopotamus"),
    Horse("Horse"),
    Iguana("Iguana"),
    Lion("Lion"),
    Lynx("Lynx"),
    Lizard("Lizard"),
    Mouse("Mouse"),
    Mantis("Mantis"),
    Monkey("Monkey"),
    Moose("Moose"),
    Mongoose("Mongoose"),
    Ostrich("Ostrich"),
    Panther("Panther"),
    Pig("Pig"),
    Rabbit("Rabbit"),
    Raccoon("Raccoon"),
    Ram("Ram"),
    Sable("Sable"),
    Snake("Snake"),
    Squirrel("Squirrel"),
    Sheep("Sheep"),
    Tiger("Tiger"),
    Turtle ("Turtle"),
    Wolf("Wolf"),
    Zebra("Zebra");

    private final String value ;
    Animals(String value) {
        this.value=value;
    }

    public String getValue(){return value;}
}
