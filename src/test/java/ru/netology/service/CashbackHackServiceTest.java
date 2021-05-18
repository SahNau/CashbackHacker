package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    void shouldCalculateHowMuchRemainToBonus() {
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMistake() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
