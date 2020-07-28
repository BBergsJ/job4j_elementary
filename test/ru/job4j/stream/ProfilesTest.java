package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    @Test
    public void whenCollectClientsAddress() {
        List<Profile> profileList = List.of(new Profile(new Address("A", "A", 1, 1))
                ,new Profile(new Address("B", "B", 2, 2))
                ,new Profile(new Address("C", "C", 3, 3))
        );

        Profiles profiles = new Profiles();

        List<Address> test = profiles.collect(profileList);

        List<Address> expected = List.of(new  Address("A", "A", 1, 1)
                , new Address("B", "B", 2, 2)
                , new Address("C", "C", 3, 3)
        );

        assertThat(test, is(expected));
    }
}