package ru.job4j.syntax.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int norm = 10;
        int above = 15;
        int sum = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i != 5 && i != 6) {
                if (hours[i] <= 8) {
                    sum += hours[i] * norm;
                } else if (hours[i] > 8) {
                    sum += 8 * norm + (hours[i] - 8) * above;
                }
            } else {
                if (hours[i] <= 8) {
                    sum += hours[i] * norm * 2;
                } else if (hours[i] > 8) {
                    sum += (8 * norm + (hours[i] - 8) * above) * 2;
                }
            }
        }
        return sum;
    }
}