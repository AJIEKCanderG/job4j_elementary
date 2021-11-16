package ru.job4j.stream;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 2.4. Группировка элементов и среднее значение. Метод averagingDouble()
 * Collectors.averagingDouble() подсчитывает среднее значения элементов в группе.
 * В качестве аргумента принимает функция, в которой мы должны указать как преобразовать элемент в double.
 * Ваша задача найти для каждой компании средний возраст сотрудников.
 */

public class AveragingMethod {

    public static class Company {

        private final String name;

        public Company(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    public static class Worker {

        private final int age;
        private final Company company;

        public Worker(int age, Company company) {
            this.age = age;
            this.company = company;
        }

        public int getAge() {
            return age;
        }

        public Company getCompany() {
            return company;
        }
    }

    public static Map<String, Double> averaging(List<Worker> workers) {
        return workers.stream()
                .collect(Collectors
                        .groupingBy(worker -> worker.getCompany().getName(),
                                Collectors.averagingDouble(Worker::getAge)));
    }
}