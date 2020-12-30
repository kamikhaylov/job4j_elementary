package ru.job4j.collection.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.lang.Math.min;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator comparator =  new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return left.getSize() - right.getSize();
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);
        Comparator<Attachment> comparatorName =  new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                int leftLenght = left.getName().length();
                int ringtLenght = right.getName().length();
                int minLenght = min(leftLenght, ringtLenght);
                for (int i = 0; i < minLenght; i++) {
                    int compare = Character.compare(left.getName().charAt(i), right.getName().charAt(i));
                    if (compare != 0) {
                        return compare;
                    }
                }
                return Integer.compare(leftLenght, ringtLenght);
            }
        };
        attachments.sort(comparatorName);
        System.out.println(attachments);
    }
}