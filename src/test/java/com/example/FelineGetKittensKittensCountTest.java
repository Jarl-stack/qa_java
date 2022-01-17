package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)

public class FelineGetKittensKittensCountTest {

    private final int kittensCount;
    private final int expected;

    public FelineGetKittensKittensCountTest(int kittensCount, int expected) {
        this.kittensCount = kittensCount;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {1, 1},
                {0, 0},
                {-1, -1}
        };
    }

    @Test
    public void shouldCheckGetKittensReturnExactCountTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        assertEquals("Не вернулось тоже значение", expected, actual);
    }

}
