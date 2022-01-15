package com.example;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class LionTest {


    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void lionInvalideSexShouldThrowExceptionTest() throws Exception {
        Feline feline = new Feline();
        exception.expect(Exception.class);
        Lion lion = new Lion(feline, "Неправильный пол");
    }

    @Test
    public void lionGetKittensShouldReturn1Test() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, "Самка");

        int expected = 1;
        int actual = lion.getKittens();
        assertEquals("Метод вернул не 1", expected, actual);
    }

    @Test
    public void lionGetFoodShouldReturnPredatorFoodTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, "Самец");

        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals("Не вернул значения еды хищника", expected, actual);
    }


}