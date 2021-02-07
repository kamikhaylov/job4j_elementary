package ru.job4j.patterns.strategy.musicPlayer;

public class Record implements Activate {
    @Override
    public void execute() {
        System.out.println("Включена запись");
    }
}
