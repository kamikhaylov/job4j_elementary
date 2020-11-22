package ru.job4j.oop.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        /* for-each */
        for (int i = 0; i < value.length; i++) {
            String element = value[i];
            if (element == key) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Элемента нет");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] arrayString = new String[] {"1", "2", "3", "4"};
        try {
            FindEl.indexOf(arrayString, "5");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}