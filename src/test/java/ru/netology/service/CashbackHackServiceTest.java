package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    public CashbackHackService service = new CashbackHackService();

    @Test
    public void calculateCashbackFrom900() {

        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void calculateCashbackFrom700() {

        int amount = 700;
        int expected = 300;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void calculateCashbackFrom100() {

        int amount = 100;
        int expected = 900;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void calculateCashbackFrom2500() {

        int amount = 2500;
        int expected = 500;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void calculateCashbackFrom1000() {

        int amount = 1000;
        int expected = 1000;

        int actual = service.remain(amount);

        assertEquals(actual, expected, "If amount is 1000, the application should not tell to buy for 1000 more");
    }
}