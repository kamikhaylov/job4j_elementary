package ru.job4j.oop.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        HtmlReport reportHtml = new HtmlReport();
        String textHtml = reportHtml.generate("Report's name", "Report's body");
        System.out.println(textHtml);
        JsonReport reportJson = new JsonReport();
        String textJson = reportJson.generate("Report's name", "Report's body");
        System.out.println(textJson);
    }
}