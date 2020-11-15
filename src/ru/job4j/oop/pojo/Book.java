package ru.job4j.oop.pojo;

public class Book {
    private String name;
    private int totalPages;

    public Book(String name, int totalPages) {
        this.name = name;
        this.totalPages = totalPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}