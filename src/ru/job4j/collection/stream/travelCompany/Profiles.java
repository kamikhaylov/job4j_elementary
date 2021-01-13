package ru.job4j.collection.stream.travelCompany;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(profile -> profile.getAddress())
                .distinct()
                .sorted((o1, o2) -> o1.getCity().compareTo(o2.getCity()))
                .collect(Collectors.toList());
    }
}
