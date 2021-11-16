package ru.job4j.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/** 9.7. Optional и Stream. Метод filter()
 * В Optional есть метод, который иногда полезен. Это метод filter(), он возвращает Optional из значения,
 * если значение удовлетворяет условию, в противном случае пустой Optional.
 * Например,
 * Optional.of(1).filter(n -> n > 0); Вернется Optional из 1
 * Optional.of(-1).filter(n -> n > 0); Вернется пустой Optional
 * Ваша задача:
 * Известно, что работникам организации, у которых > 2 детей положены льготы для детей.
 * Но не всем детям, а тем, что младше 15. Некоторые работники не знают подробности акции.
 * Они решили придти в отдел организации, который отвечает за льготы и узнать положены ли льготы их детям, если да,
 * то каким именно. Вам дан список и работников и паспорт интересующего работника.
 * Нужно найти список детей этого работника, которым положены льготы.
 * В системе уже есть метод поиска по паспорту, вам нужно используя этот метод дописать метод поиска детей
 *
 */

public class OptionalFilter {

    public static class Worker {

        private final String passport;
        private final List<Child> children;

        public Worker(String passport, List<Child> children) {
            this.passport = passport;
            this.children = children;
        }

        public String getPassport() {
            return passport;
        }

        public List<Child> getChildren() {
            return children;
        }
    }

    public static class Child {

        private final String name;

        private final int age;

        public Child(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<Child> defineChildren(List<Worker> workers, String passport) {
        Optional<Worker> findChild = OptionalFilter.findByPassport(workers, passport);
        return findChild.stream()
                .flatMap(w -> w.getChildren().stream())
                .filter(child -> child.getAge() < 15)
                .collect(Collectors.toList());
    }

    public static Optional<Worker> findByPassport(List<Worker> workers, String passport) {
        return workers.stream()
                .filter(w -> w.getPassport().equals(passport))
                .findFirst();
    }

}