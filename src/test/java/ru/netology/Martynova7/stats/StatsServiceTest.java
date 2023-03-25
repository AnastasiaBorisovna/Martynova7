package ru.netology.Martynova7.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.salesAmount(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 15;
        int actualSum = service.averageAmount(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void maxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 6;
        int actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void minSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void MinAverageSalesPerMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 5;
        int actualSum = service.MinAverageSalesPerMonth(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void MaxAverageSalesPerMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 5;
        int actualSum = service.MaxAverageSalesPerMonth(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }
}