package ru.netology;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

    @org.junit.Test
    public void testRemain() {
        int amount = 1200;
        int expected = 800;
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainIfAmountIs1000() {
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainIfAmountIs1001() {
        int amount = 1001;
        int expected = 999;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainIfAmountIs999() {
        int amount = 999;
        int expected = 1;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainIfAmountIs0() {
        int amount = 0;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainIfAmountIs1() {
        int amount = 1;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        assertEquals(expected, actual);
    }
}