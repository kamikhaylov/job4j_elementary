package ru.job4j.patterns.strategy.musicPlayer;

public class Play implements Activate {
    @Override
    public void execute() {
        System.out.println("Влючено воспроизведение трека");
    }
}
