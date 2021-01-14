package ru.job4j.collection.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  Класс описывает модель для банковской системы.
 *  В системе можно производитель следующие действия.
 *  1. Регистрировать пользователя.
 *  2. Удалять пользователя из системы.
 *  3. Добавлять пользователю банковский счет. У пользователя системы могут быть несколько счетов.
 *  4. Переводить деньги с одного банковского счета на другой счет.
 *  @author KONSTANTIN MIKHAYLOV
 *  @version 1.0
 */
public class BankService {
    /**
     * Хранение пользователей и счетов осуществляется в коллекции типа HashMap.
     * @param users коллекция пользователей
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод позволяет добавить пользователя в систему.
     * @param user пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод позволяет добавить новый счет к пользователю.
     * @param passport номер паспорта пользователя
     * @param account счет пользователя
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            if (!users.get(user).contains(account)) {
                users.get(user).add(account);
            }
        }
    }

    /**
     * Метод позволяет найти пользователя по номеру паспорта.
     * @param passport номер паспорта пользователя
     * @return возвращает пользователя
     */

    public User findByPassport(String passport) {
         return users.keySet()
                 .stream()
                 .filter(s -> s.getPassport().equals(passport))
                 .findFirst()
                 .orElse(null);
    }

    /**
     * Метод позволяет найти счет пользователя по реквизитам.
     * @param passport номер паспорта пользователя
     * @param requisite реквизиты счета
     * @return возвращает счет
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(a -> a.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод позволяет перечислить деньги с одного счета на другой счет.
     * Если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят), то метод должен вернуть false.
     * @param srcPassport номер поспорта пользователя для списания
     * @param srcRequisite реквизиты списания денег
     * @param destPassport номер паспорта пользователя для зачисления
     * @param destRequisite реквизиты зачисления денег
     * @param amount сумма перевода
     * @return возвращает результат операции
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null) {
            if (srcAccount.getBalance() >= amount) {
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                destAccount.setBalance(destAccount.getBalance() + amount);
                rsl = true;
            }
        }
        return rsl;
    }
}