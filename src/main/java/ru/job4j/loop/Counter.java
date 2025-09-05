package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(sum(0, 5));
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(6, 1));
        System.out.println(sum(15, 30));

        System.out.println("Sum of even from 1 to 10: " + sumByEven(1, 10));
        System.out.println("Sum of even from 0 to 10: " + sumByEven(0, 10));
        System.out.println("Sum of even from 3 to 8: " + sumByEven(3, 8));
        System.out.println("Sum of even from 1 to 1: " + sumByEven(1, 1));
        System.out.println("Sum of even from 15 to 30: " + sumByEven(15, 30));
        System.out.println("Sum of even from -22 to 10: " + sumByEven(-22, 10));
        System.out.println("Sum of even from 5 to 10: " + sumByEven(5, 10));
    }
}