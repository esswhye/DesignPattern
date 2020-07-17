package Combinator.Example;

import java.time.LocalDate;

public class Customer {

    private final String name;
    private final LocalDate age;
    private final String email;
    private final String phoneNumber;

    public Customer(String name, LocalDate age, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
