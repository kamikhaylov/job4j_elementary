package ru.job4j.oop.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int gamer = 1;
        int total = 11;
        while (run) {
            if (gamer == 1) {
                System.out.println("Первый игрок, введите число спичек от 1 до 3");
            } else {
                System.out.println("Второй игрок, введите число спичек от 1 до 3");
            }
            int select = Integer.valueOf(input.nextLine());
            if (select <= 0 || select > 3) {
                System.out.println("Введено не верное кол-во спичек");
                continue;
            }
            total -= select;
            if (total <= 0) {
                if (gamer == 1) {
                    System.out.println("Выйграл первый игрок");
                } else {
                    System.out.println("Выйграл второй игрок");
                }
                break;
            }
            System.out.println("Осталось спичек: " + total);
            if (gamer == 1) {
                gamer = 2;
            } else {
                gamer = 1;
            }
        }
    }
}