package ru.job4j.oop.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 700);
        Book javaBook = new Book("Java book", 1300);
        Book bookQA = new Book("QA", 500);
        Book bigBook = new Book("Big book", 2000);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = javaBook;
        books[2] = bookQA;
        books[3] = bigBook;
        System.out.println("Вывод списка книг: ");
        printBooks(books);
        permutationBooks(books, 0, 3);
        System.out.println("Вывод списка книг после перестановки: ");
        printBooks(books);
        System.out.println("Вывод книг с названием \"Clean code\"");
        printBooks(books, "Clean code");
    }

    public static void printBooks(Book[] books) {
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + ", " + book.getTotalPages() + " страниц");
        }
    }

    public static void printBooks(Book[] books, String name) {
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (name.equals(book.getName())) {
                System.out.println(book.getName() + ", " + book.getTotalPages() + " страниц");
            }
        }
    }

    public static void permutationBooks(Book[] books, int oneIndex, int twoIndex) {
        Book temp = books[oneIndex];
        books[oneIndex] = books[twoIndex];
        books[twoIndex] = temp;
    }
}