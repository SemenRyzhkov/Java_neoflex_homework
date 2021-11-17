package com.neoflex.hw2.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {

    private String name;

    private List<Phone> phones = new ArrayList<>();

    public Contact(String name, long number) {
        this.name = name;
        this.addPhone(number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public void addPhone(long number) {
        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher(String.valueOf(number));
        if (matcher.matches()) {
            this.phones.add(new Phone(number));
        } else throw new PhoneCreatedException("Phone must be contained ten digits and nothing else");
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                '}';
    }
}
