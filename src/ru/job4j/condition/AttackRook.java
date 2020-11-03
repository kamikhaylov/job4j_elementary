package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        char leftChar = left.charAt(0);
        char leftNumb = left.charAt(1);
        char rightChar = right.charAt(0);
        char rightNumb = right.charAt(1);

        return (leftChar == rightChar) || (leftNumb == rightNumb);
    }
}
