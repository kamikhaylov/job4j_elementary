package ru.job4j.oop.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Иванов Иван Иванович");
        student.setGroup("2020-001");
        student.setDateOfReceipt("2020-09-01");
        System.out.println("Студент: " + student.getFio() + " зачислен "
                + student.getDateOfReceipt() + " в группу №" + student.getGroup());
    }
}