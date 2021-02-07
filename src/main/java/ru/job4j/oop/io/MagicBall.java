package ru.job4j.oop.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я Ваш виртуальный ассистент, введите вопрос: ");
        String question = input.nextLine();
        System.out.println(answer(new Random().nextInt(3)));
    }

    public static String answer(int anser) {
        String result = "Может быть";
        if (anser == 0) {
            result = "Да";
        } else if (anser == 1) {
            result = "Нет";
        }
        return result;
    }
}