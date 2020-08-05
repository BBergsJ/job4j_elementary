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
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accountsList = users.get(user.get());
            if (!accountsList.contains(account)) {
                accountsList.add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value).stream()
                .filter(a -> a.getRequisite().equals(requisite))
                .findFirst());
    }

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