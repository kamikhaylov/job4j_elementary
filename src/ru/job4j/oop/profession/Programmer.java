package ru.job4j.oop.profession;

public class Programmer extends Engineer {
    private String programLanguage;

    public Programmer(String name, String surname, String education, String birthday, int category, String programLanguage) {
        super(name, surname, education, birthday, category);
        this.programLanguage = programLanguage;
    }

    public void coding() {
    }
}
