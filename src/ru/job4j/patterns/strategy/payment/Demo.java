package ru.job4j.patterns.strategy.payment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
         while (!order.isClosed()) {
             int cost;
             String continueChoice;
             do {
                 System.out.println("Пожалуйста, выберите товар: \n"
                         + "1 - Материнская плата \n"
                         + "2 - Процессор \n"
                         + "3 - Жесткий диск \n"
                         + "4 - Оперативная память \n");
                 int choice = Integer.parseInt(reader.readLine());
                 cost = priceOnProducts.get(choice);
                 System.out.println("Количество: ");
                 int count = Integer.parseInt(reader.readLine());
                 order.setTotalCost(cost * count);
                 System.out.println("Продолжить выбор? y/n: ");
                 continueChoice = reader.readLine();
             } while(continueChoice.equalsIgnoreCase("y"));

             if (strategy == null) {
                 System.out.println("Выберие способ оплаты: \n"
                        + "1 - InetPay \n"
                        + "2 - Card");
                 String paymentMethod = reader.readLine();
                 if (paymentMethod.equals("1")) {
                     strategy = new PayByInetPay();
                 } else {
                     strategy = new PayByCardPay();
                 }
             }

             order.processOrder(strategy);

             System.out.println("Оплатить " + order.getTotalCost() + " + покупки или продожить выбор? p/c: ");
             String proceed = reader.readLine();
             if (proceed.equalsIgnoreCase("p")) {
                 if (strategy.pay(order.getTotalCost())) {
                     System.out.println("Оплата прошла успешно");
                 } else {
                     System.out.println("Ошибка! Пожалуйста, проверьте свои данные");
                 }
             }
             order.setClosed();
         }
    }
}
