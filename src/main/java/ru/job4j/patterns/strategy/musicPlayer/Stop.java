package ru.job4j.patterns.strategy.musicPlayer;

public class Stop implements Activate {
    @Override
    public void execute() {
        System.out.println("Воспроизведение трека остановлено");
    }
}
