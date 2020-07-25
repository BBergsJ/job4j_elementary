package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public static List<Address> collect(List<Profile> profiles) {
        List<Address> result = profiles.stream()
                .map(Profile::getAddress).collect(Collectors.toList());
        return result;
    }
}