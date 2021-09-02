package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServisTest {

    @Test
    void ShouldcalculateSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(sales);


        assertEquals(expected, actual);

    }

    @Test
    void ShouldcalculateAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.calculateAverage(sales);


        assertEquals(expected, actual);

    }

    @Test
    void ShouldMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSales(sales);


        assertEquals(expected, actual);

    }

    @Test
    void ShouldMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSales(sales);


        assertEquals(expected, actual);

    }

    @Test
    void ShouldnumberMonthMin() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.numberMonthMin(sales);


        assertEquals(expected, actual);

    }
    @Test
    void ShouldnumberMonthMax() {StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.numberMonthMin(sales);


        assertEquals(expected, actual);

    }


}
