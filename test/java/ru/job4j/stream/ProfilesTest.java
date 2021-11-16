package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProfilesTest {
    @Test
    public void whenCollect() {
        Profiles prof = new Profiles();
        List<Address> addresses = prof.collect(List.of(
                new Profile(new Address("Moscow", "Lenina", 3, 5)),
                new Profile(new Address("Omsk", "Narodnaya", 20, 50)),
                new Profile(new Address("Belgorod", "Griboedova", 1, 2))
        ));
        List<Address> expected = List.of(
                new Address("Belgorod", "Griboedova", 1, 2),
                new Address("Moscow", "Lenina", 3, 5),
                new Address("Omsk", "Narodnaya", 20, 50)

        );
        assertThat(addresses, is(expected));
    }

    @Test
    public void whenCollectSortedByCity() {
        Profiles prof = new Profiles();
        List<Address> addresses = prof.collect(List.of(
                new Profile(new Address("Moscow", "Lenina", 3, 5)),
                new Profile(new Address("Tomsk", "Narodnaya", 20, 50)),
                new Profile(new Address("Belgorod", "Griboedova", 1, 2))
        ));
        List<Address> expected = List.of(
                new Address("Belgorod", "Griboedova", 1, 2),
                new Address("Moscow", "Lenina", 3, 5),
                new Address("Tomsk", "Narodnaya", 20, 50)
        );
        assertThat(addresses, is(expected));
    }

    @Test
    public void whenCollectSortedAndDistinct() {
        Profiles prof = new Profiles();
        List<Address> addresses = prof.collect(List.of(
                new Profile(new Address("Moscow", "Lenina", 3, 5)),
                new Profile(new Address("Moscow", "Lenina", 3, 5)),
                new Profile(new Address("Tomsk", "Narodnaya", 20, 50)),
                new Profile(new Address("Belgorod", "Griboedova", 1, 2)),
                new Profile(new Address("Tomsk", "Narodnaya", 20, 50))
        ));
        List<Address> expected = List.of(
                new Address("Belgorod", "Griboedova", 1, 2),
                new Address("Moscow", "Lenina", 3, 5),
                new Address("Tomsk", "Narodnaya", 20, 50)
        );
        assertThat(addresses, is(expected));
    }
}