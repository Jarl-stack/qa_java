package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {


    @Test
    public void catGedFoodLikePredatorTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actual = cat.getFood();
        Assert.assertEquals("Не вернулись значения еды хищника", expected, actual);
    }

    @Mock
    Feline feline;

    @Test
    public void catGedFoodLikePredatorMockTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Бургеры", "Пицца", "Шаверма"));
        Assert.assertEquals(Arrays.asList("Бургеры", "Пицца", "Шаверма"), cat.getFood());
    }

    @Test
    public void catGetSoundShouldReturnMeowTest() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        Assert.assertEquals("Кот издал не 'Мяу'", expected, actual);
    }

}