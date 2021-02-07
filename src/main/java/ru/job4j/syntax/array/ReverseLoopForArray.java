package ru.job4j.syntax.array;

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[numbers.length - 1 - i];
            boolean even = (element % 2) == 0;
            if (even) {
                System.out.println(
                        "Текущий элемент массива начиная с последнего: "
                                + element
                );
            }
        }
    }
}