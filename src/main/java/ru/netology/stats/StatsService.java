package ru.netology.stats;


public class StatsService {
    public long amount(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {

            totalSale += sale;
        }
        return totalSale;
    }

    public long averageSum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        long averageSale = totalSale / sales.length;
        return averageSale;
    }

    public int monthMaxSales(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int monthMinSales(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int monthsSalesBelowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSum(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsSalesAboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSum(sales)) {
                counter++;
            }
        }
        return counter;
    }
}