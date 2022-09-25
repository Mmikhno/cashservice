package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;


import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

    @org.testng.annotations.Test
    public void testRemain() {
        int amount = 1200;
        int expected = 800;
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainIfAmountIs1000() {
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainIfAmountIs1001() {
        int amount = 1001;
        int expected = 999;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainIfAmountIs999() {
        int amount = 999;
        int expected = 1;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainIfAmountIs0() {
        int amount = 0;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainIfAmountIs1() {
        int amount = 1;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }
}