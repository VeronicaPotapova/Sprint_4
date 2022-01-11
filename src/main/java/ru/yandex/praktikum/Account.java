package ru.yandex.praktikum;

import com.google.common.base.CharMatcher;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return name.length() >= 3 &&
                name.length() <= 19 &&
                CharMatcher.is(' ').countIn(name) == 1 &&
                CharMatcher.is(' ').countIn(name.trim()) == 1;
    }

}


