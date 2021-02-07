package ru.job4j.patterns.strategy.musicPlayer;

public class Player {
    private Activate activate;

    public void setActivate(Activate activate) {
        this.activate = activate;
    }

    public void executeActivate() {
        activate.execute();
    }
}
