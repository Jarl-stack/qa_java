package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void felineEatMeatShouldReturnListOfPredatorFoodTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals("Хуйня", expected, actual);
    }

    @Test
    public void felineGetFamilyShouldReturnExactStringTest() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Не вернул правильную строку", expected, actual);
    }

    @Test
    public void felineGetKittensShouldReturn1Test() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals("Не вернул 1", expected, actual);
    }

}