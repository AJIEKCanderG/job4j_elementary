package ru.job4j.poly;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() +  " летает по воздуху.");
    }

    @Override
    public int passengers(int number) {
        return 0;
    }
}
