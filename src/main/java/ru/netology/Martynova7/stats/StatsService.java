package ru.netology.Martynova7.stats;

public class StatsService {

    public int salesAmount(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageAmount(int[] sales) {
        double sum = 0;
        int i = 0;
        for (int x : sales) {
            sum += x;
            i = (int) sum / sales.length;
        }
        return i;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int a = 0; a < sales.length; a++) {
            if (sales[a] > sales[maxMonth]) {
                maxMonth = a;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int MinAverageSalesPerMonth(int[] sales) {
        int min = averageAmount(sales);
        int quantityMinMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < min) {
                quantityMinMonth += 1;
            }
        }
        return quantityMinMonth;
    }

    public int MaxAverageSalesPerMonth(int[] sales) {
        int min = averageAmount(sales);
        int quantityMaxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > min) {
                quantityMaxMonth += 1;
            }
        }
        return quantityMaxMonth;
    }
}