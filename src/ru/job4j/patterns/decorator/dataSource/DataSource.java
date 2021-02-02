package ru.job4j.patterns.decorator.dataSource;

public interface DataSource {
    public void writeData(String data);
    public String readData();
}