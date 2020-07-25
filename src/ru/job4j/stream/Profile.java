package ru.job4j.stream;

public class Profile {
    private Address address;
    private String name;

    public Profile(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}