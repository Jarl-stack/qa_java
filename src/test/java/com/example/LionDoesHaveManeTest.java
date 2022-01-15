package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)

public class LionDoesHaveManeTest {

    private final String lionSex;
    private final boolean expected;

    public LionDoesHaveManeTest(String lionSex, boolean expected) {
        this.lionSex = lionSex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void shouldCheckDoesHaveManeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, lionSex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}