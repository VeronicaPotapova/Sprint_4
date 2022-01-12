package ru.yandex.praktikum;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return name != null &&
                name.matches("(^\\S+ {1}\\S+$)(?<=.{3,19})");
    }

}


