package ru.job4j.patterns.strategy.musicPlayer;

public class Pause implements Activate {
    @Override
    public void execute() {
        System.out.println("Трек поставлен на паузу");
    }
}
