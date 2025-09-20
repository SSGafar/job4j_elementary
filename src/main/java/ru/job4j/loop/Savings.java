package ru.job4j.loop;

public class Savings {
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        do {
            years++;

            double interest = total * (percent / 100);
            total += interest;
            total += annualDeposit;

        } while (total < goal);

        return years;
    }
}