package com.neoflex.hw2.task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PhoneBook {

    private final Map<String, Contact> phoneBook = new HashMap<>();

    {
        addNew("New", 9992220011L);
        addNew("New", 9992220044L);
        addNew("New1", 9992220055L);
    }

    public Contact addNew(String name, long number) {
        Contact existedCont = this.phoneBook.computeIfPresent(name, (n, cont) -> addPhoneIfNotExist(cont, number));
        Contact newCont = this.phoneBook.computeIfAbsent(name, n -> addNewContact(n, number));
        return existedCont == null ? newCont : existedCont;
    }

    public List<Long> getPhonesByName(String name) {
        Contact contact = phoneBook.get(name);
        return contact == null
                ? null
                : contact.getPhones().stream()
                .map(Phone::getPhone)
                .collect(Collectors.toList());
    }

    public List<Contact> getContactsByPartOfName(String partOfName) {
        return this.phoneBook.entrySet().stream()
                .filter(cont -> cont.getKey().contains(partOfName))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    private static Contact addPhoneIfNotExist(Contact contact, long number) {
        List<Phone> phones = contact.getPhones();
        Phone phone = new Phone(number);
        if (!phones.contains(phone)) {
            phones.add(phone);
        }
        return contact;
    }

    private static Contact addNewContact(String name, long number) {
        return new Contact(name, number);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}
