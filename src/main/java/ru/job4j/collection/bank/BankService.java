package ru.job4j.collection.bank;

import java.util.*;

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
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> userAccount = users.get(user.get());
            if (!userAccount.contains(account)) {
                userAccount.add(account);
            }
        }
    }

    /**
     * Метод позволяет найти пользователя по номеру паспорта.
     * @param passport номер паспорта пользователя
     * @return возвращает пользователя
     */

    public Optional<User> findByPassport(String passport) {
         return users.keySet()
                 .stream()
                 .filter(s -> s.getPassport().equals(passport))
                 .findFirst();
    }

    /**
     * Метод позволяет найти счет пользователя по реквизитам.
     * @param passport номер паспорта пользователя
     * @param requisite реквизиты счета
     * @return возвращает счет
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return users.get(user.get())
                    .stream()
                    .filter(a -> a.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
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
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent()) {
            if (srcAccount.get().getBalance() >= amount) {
                srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
                destAccount.get().setBalance(destAccount.get().getBalance() + amount);
                rsl = true;
            }
        }
        return rsl;
    }
}