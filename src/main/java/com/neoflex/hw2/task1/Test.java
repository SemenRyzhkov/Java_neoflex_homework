package com.neoflex.hw2.task1;

public class Test {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        System.out.println(phoneBook);

        phoneBook.addNew("New", 9992220011L);

        System.out.println(phoneBook);

        phoneBook.addNew("New", 9992220033L);

        System.out.println(phoneBook);

        System.out.println(phoneBook.getPhonesByName("New"));

        System.out.println(phoneBook.getContactsByPartOfName("Ne"));
    }
}
