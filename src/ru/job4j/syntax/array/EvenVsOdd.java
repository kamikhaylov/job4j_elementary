package ru.job4j.syntax.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int team1 = 0;
        int team2 = 0;
        int teamWin = 0;
        for (int i = 0; i < players.length; i++) {
            if ((i % 2) == 0) {
                team1 += players[i];
            } else {
                team2 += players[i];
            }
        }

        if (team1 > team2) {
            teamWin = 1;
        } else if (team2 > team1) {
            teamWin = 2;
        }

        return teamWin;
    }
}