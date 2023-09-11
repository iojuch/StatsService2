package ru.netology.stats.StatsService.services;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            //sum = sum + sale;
            sum += sale;
        }
        return sum;
    }

    public int calcAvg(int[] sales) {
        return sumSales(sales) / sales.length;

    }

    public int maxMonthSales(int[] sales) {
        int maxMonth = 0;
        for (int sale = 0; sale < sales.length; sale++) {
            if (sales[sale] > sales[maxMonth]) {
                maxMonth = sale;
            }

        }
        return maxMonth + 1;
    }

    public int minMonthSales(int[] sales) {
        int minMonth = 0;
        for (int sale = 0; sale < sales.length; sale++) {
            if (sales[sale] < sales[minMonth]) {
                minMonth = sale;
            }
        }
        return minMonth + 1;
    }

    public int bellowAverageSales(int[] sales) {
        int counter = 0;
        for (int sale : sales) {
            if (sale < calcAvg(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveAverageSales(int[] sales) {
        int counter = 0;
        for (int sale : sales) {
            if (sale > calcAvg(sales)) {
                counter++;
            }
        }
        return counter;
    }

}
