package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    //проверка по граничным значениям
    @Test
    void shouldCalculateHowMuchRemainToBonus() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    //проверка по граничным значениям
    @Test
    void shouldCalculateHowMuchRemainToBonus2() {
        int amount = 11;
        int actual = service.remain(amount);
        int expected = 989;
        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateHowMuchRemainToBonus3() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    void shouldMistake() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
