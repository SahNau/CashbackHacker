package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    //проверка по граничным значениям
    @Test
    public void shouldCalculateHowMuchRemainToBonus() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }

    //проверка по граничным значениям
    @Test
    public void shouldCalculateHowMuchRemainToBonus2() {
        int amount = 11;
        int actual = service.remain(amount);
        int expected = 989;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateHowMuchRemainToBonus3() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMistake() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
