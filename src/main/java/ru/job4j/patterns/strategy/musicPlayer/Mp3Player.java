package ru.job4j.patterns.strategy.musicPlayer;

public class Mp3Player {
    public static void main(String[] args) {
        Player player = new Player();

        player.setActivate(new Play());
        player.executeActivate();

        player.setActivate(new Pause());
        player.executeActivate();

        player.setActivate(new Stop());
        player.executeActivate();

        player.setActivate(new Record());
        player.executeActivate();
    }
}
