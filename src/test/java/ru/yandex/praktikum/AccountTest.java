package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.apache.commons.lang3.RandomStringUtils;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean expected;

    public AccountTest(String name, boolean expected){
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] nameTestData() {
        return new Object[][]{
                // 3 символа включая пробел в середине
                {RandomStringUtils.randomAlphabetic(1) + " " + RandomStringUtils.randomAlphabetic(1), true},
                // 4 символа включая пробел в середине
                {RandomStringUtils.randomAlphabetic(2) + " " + RandomStringUtils.randomAlphabetic(1), true},
                // 18 символов включая пробел в середине
                {RandomStringUtils.randomAlphabetic(10) + " " + RandomStringUtils.randomAlphabetic(7), true},
                // 19 символов включая пробел в середине
                {RandomStringUtils.randomAlphabetic(10) + " " + RandomStringUtils.randomAlphabetic(8), true},
                // Пробел в начале строки
                {" " + RandomStringUtils.randomAlphabetic(10), false},
                // Отсутствующий пробел
                {RandomStringUtils.randomAlphabetic(10), false},
                // Пробел в конце строки
                {RandomStringUtils.randomAlphabetic(10) + " ", false},
                // Более одного пробела в середине
                {RandomStringUtils.randomAlphabetic(7) + "  " + RandomStringUtils.randomAlphabetic(7), false},
                // 2 символа
                {RandomStringUtils.randomAlphabetic(2), false},
                // 20 символов
                {RandomStringUtils.randomAlphabetic(20), false},
        };
    }

    @Test
    public void shouldBeNameAccount() {
        Account account = new Account(name);
        System.out.println(name);
        boolean actual = account.checkNameToEmboss();

        assertEquals(expected, actual);
    }
}




