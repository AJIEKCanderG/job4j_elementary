package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() +  " передвигается по рельсам.");
    }

    @Override
    public int passengers(int number) {
        return 0;
    }
}
