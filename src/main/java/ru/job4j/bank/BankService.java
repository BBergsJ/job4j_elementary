package ru.job4j.bank;

import java.util.*;

/**
 * Класс для работы с клиентом банка и его аккаунтами
 * @author Емельянов Дмитрий
 * @version 1.0
 * @since 25.05.21
 */

public class BankService {
    /**
     * Хранилище пользователей и их аккаунтов
     * Использует коллекцию HashMap
     */
    private Map<User, List<Account>> users = new HashMap<>();


    /**
     * Метод добавляет пользователя если его нет в хранилище
     * @param user принимает пользователя
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет аккаунт по паспорту пользователя
     * @param passport паспорт пользователя по которому происходит поиск в хранилище
     * @param account аккаунт который мы хотим добавить
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accountsList = users.get(user.get());
            if (!accountsList.contains(account)) {
                accountsList.add(account);
            }
        }
    }

    /**
     * Метод для поиска пользователя по номеру паспорта
     * @param passport номер паспорта пользователя
     * @return возвращает пользователя, если он есть в хранилище или пустое значение
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод для поиска аккаунта пользователя по реквизитам
     * @param passport номер паспорта искомого пользователя
     * @param requisite номер реквизита
     * @return возвращает аккаунт, если он есть у пользователя и пользователь существует
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value).stream()
                .filter(a -> a.getRequisite().equals(requisite))
                .findFirst());
    }

    /**
     * Метод для перевода денег от одного пользователя другому
     * @param srcPassport паспорт отправителя
     * @param srcRequisite реквизиты отправителя
     * @param destPassport паспорт получателя
     * @param destRequisite реквизиты получателя
     * @param amount сумма для отправки
     * @return возвращает результат попытки отправки денег в формате boolean
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Optional<Account> destination = findByRequisite(destPassport, destRequisite);
        Optional<Account> source = findByRequisite(srcPassport, srcRequisite);
        if (destination.equals(null) || source.equals(null) || source.get().getBalance() < amount) {
            return false;
        } else  {
            destination.get().setBalance(destination.get().getBalance() + amount);
            source.get().setBalance(source.get().getBalance() - amount);
            return true;
        }
    }
}