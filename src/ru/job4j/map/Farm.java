package ru.job4j.map;

import java.util.*;

/**
 * 14. Ферма
 * Ответственный фермер решил провести инвентаризацию животных на своей ферме. Просто посчитать их количество ему
 * показалось мало и он решил посчитать сколько же ног бегает по его ферме.
 * Метод принимает отображение: ключ - объект класса Animal, а значение - количество животных этого класса на ферме.
 * При этом объект класса Animal содержит 2 поля: имя и количество ног у животного.
 * Необходимо реализовать метод так, чтобы на выходе у нас получилась общая сумма ног животных на ферме.
 */

public class Farm {
    public static int sumLegs(Map<Animal, Integer> data) {
        int rsl = 0;
        for (Animal animal : data.keySet()) {
            rsl += data.get(animal) * animal.getLegs();
        }
        return rsl;
    }


    public static class Animal {
        private String name;

        private int legs;

        public Animal(String name, int legs) {
            this.name = name;
            this.legs = legs;
        }

        public String getName() {
            return name;
        }

        public int getLegs() {
            return legs;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Animal animal = (Animal) o;
            return Objects.equals(name, animal.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}