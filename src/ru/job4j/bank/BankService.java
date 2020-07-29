package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountsList = users.get(user);
            if (!accountsList.contains(account)) {
                accountsList.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        return users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user).stream()
                    .filter(a -> a.getRequisite().equals(requisite))
                    .findFirst()
                    .get();
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account destination = findByRequisite(destPassport, destRequisite);
        Account source = findByRequisite(srcPassport, srcRequisite);
        if (destination.equals(null) || source.equals(null) || source.getBalance() < amount) {
            return false;
        } else  {
            destination.setBalance(destination.getBalance() + amount);
            source.setBalance(source.getBalance() - amount);
            return true;
        }
    }
}