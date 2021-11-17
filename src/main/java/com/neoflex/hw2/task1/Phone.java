package com.neoflex.hw2.task1;

import java.util.Objects;

public class Phone {

    private long phone;

    public Phone(long phone) {
        this.phone = phone;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone1 = (Phone) o;
        return phone == phone1.phone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phone=" + phone +
                '}';
    }
}
