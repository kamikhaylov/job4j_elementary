package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            int indexPost = post.length - 1 - i;
            int indexWord = word.length - 1 - i;
            if (post[indexPost] != word[indexWord]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
