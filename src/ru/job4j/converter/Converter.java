package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {

        return value / 70;
    }

    public static int rubleToDollar(int value) {

        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int in1 = 120;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        int out1 = Converter.rubleToDollar(in1);
        boolean passed = expected == out;
        boolean passed1 = expected == out1;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("120 rubles are 2. Test result : " + passed1);

    }
}