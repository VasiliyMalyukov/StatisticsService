package ru.netology.javaqamvn.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMax1() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {13, 5, 8, 4, 5, 3, 8, 6, 11, 11, 11};
        long expected = 13;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMax2() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {3, 5, 8, 4, 5, 3, 8, 6, 11, 11, 11};
        long expected = 11;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}