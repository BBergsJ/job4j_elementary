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
            List<Account> accountsList = users.get(user);
            if (!accountsList.contains(account)) {
                accountsList.add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        return Optional.ofNullable(users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null));
    }

    public Account findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return users.get(user).stream()
                    .filter(a -> a.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
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

    public static void main(String[] args) {
        BankService bank = new BankService();
        bank.addUser(new User("321", "Petr Arsentev"));
        Optional<User> opt = bank.findByPassport("3211");
        if (opt.isPresent()) {
            System.out.println(opt.get().getUsername());
        }
    }
}