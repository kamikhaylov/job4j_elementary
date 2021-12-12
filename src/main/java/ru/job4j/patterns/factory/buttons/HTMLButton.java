package ru.job4j.patterns.factory.buttons;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Teст HTML-кнопки</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Тест нажатия кнопки");
    }
}
