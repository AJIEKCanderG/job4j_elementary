package ru.job4j.calculator;
/** Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.

 Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.*/
public class Fit {

    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 184;
        double man = Fit.manWeight(height);
        short height1 = 170;
        double woman = Fit.womanWeight(height1);
        System.out.println("Man 184 is " + man);
        System.out.println("Woman 170 is " + woman);
    }

}