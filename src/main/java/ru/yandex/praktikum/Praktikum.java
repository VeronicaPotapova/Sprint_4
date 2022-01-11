package ru.yandex.praktikum;

public class Praktikum {

    static String firstAndLastName = "Name Surname";

    public static void main(String[] args) {

        Account account = new Account(firstAndLastName);
        boolean check = account.checkNameToEmboss();

        if (check) {
            System.out.println("Можно использовать фамилию и имя для печати на банковской карте");
        } else {
            System.out.println("Нельзя использовать фамилию и имя для печати на банковской карте");
        }
    }

}
