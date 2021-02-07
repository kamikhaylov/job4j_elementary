package ru.job4j.oop.profession;

public class Tester extends Engineer {
    private String type;

    public Tester(String name, String surname, String education, String birthday, int category, String type) {
        super(name, surname, education, birthday, category);
        this.type = type;
    }

    public void test() {
    }
}
