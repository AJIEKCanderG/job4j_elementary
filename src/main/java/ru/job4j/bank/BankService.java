package ru.job4j.bank;

import java.util.*;

public class BankService {
    /**
     * Банковский сервис по переводу денежных средств.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему.
     * Метод принимает два параметра: пользователя и список счетов.
     *
     * @param user пользователь которого добавляем.
     */

    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    /**
     * Метод ищет пользователя по паспорту, затем получаем список его счетов.
     * Метод добавляет новый счет к пользователю.
     *
     * @param passport по паспорту ищем пользователя.
     * @param account  получаем список счетов.
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            if (accounts != null) {
                if (!accounts.contains(account)) {
                    accounts.add(account);
                }
            }
        }
    }

    /**
     * Метод ищет пользователя по паспорту.
     *
     * @param passport паспорт пользователя.
     * @return возвращает найденного пользователя.
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод ищет счет пользователя по реквизитам.
     *
     * @param passport  паспорт пользователя.
     *                  Ищем список счетов найденного пользователя.
     * @param requisite реквизиты счета.
     * @return возвращает найденный счет по реквизитам.
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> rsl = Optional.empty();
        Optional<User> user = findByPassport(passport);
        return user.map(value -> users.get(value)
                .stream()
                .filter(s -> s.getRequisite().equals(requisite))
                .findFirst()).orElse(rsl);
    }

    /**
     * Метод реализует перечисление денег с одного счета на другой.
     *
     * @param srcPassport   паспорт пользователя который перечисляет денежные средства
     * @param srcRequisite  реквизиты пользователя который перечисляет денежные средства
     * @param destPassport  паспорт пользователя который получает денежные средства
     * @param destRequisite реквизиты на которые перечисляются денежные средства
     * @param amount        итоговая сумма на счете после получения перевода.
     */

    public void transferMoney(String srcPassport, String srcRequisite,
                              String destPassport, String destRequisite, double amount) {
        Optional<Account> accountSrc = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> accountDest = findByRequisite(destPassport, destRequisite);
        if (accountSrc.isPresent() && accountDest.isPresent()) {
            if (accountSrc.get().getBalance() >= amount) {
                accountSrc.get().setBalance(accountSrc.get().getBalance() - amount);
                accountDest.get().setBalance(accountDest.get().getBalance() + amount);
            }
        }
    }
}