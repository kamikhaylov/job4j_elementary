package ru.job4j.collection.stream.travelCompany;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfileTest   {
    private List<Profile> profiles = new ArrayList<>();

    @Before
    public void setUp() {
        profiles.add(new Profile(new Address("Samara","Metallurgov",25, 10)));
        profiles.add(new Profile(new Address("Moscow","Vavilova",1, 15)));
        profiles.add(new Profile(new Address("Arhangelsk","Alabina",11, 80)));
    }

    @Test
    public void whenCollectProfile() {
        Profile pr = new Profile();
        List<Address> rsl = pr.collect(profiles);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Samara","Metallurgov",25, 10));
        expected.add(new Address("Moscow","Vavilova",1, 15));
        expected.add(new Address("Arhangelsk","Alabina",11, 80));
        assertThat(rsl, is(expected));
    }
}