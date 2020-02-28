package io.zipcoder.pets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CatTest {

    String expectedNoise;
    String expectedName;
    Cat testCat;

    @BeforeEach
    public void init(){
        expectedNoise = "meow";
        expectedName = "Mark";
        testCat = new Cat(expectedName);

    }

    @Test
    public void speakTest(){
        String actual = testCat.speak();

        assertEquals(expectedNoise, actual);
    }

    @Test
    public void constructorTest(){
        String actual = testCat.getName();

        assertEquals(expectedName, actual);
    }

    @Test
    public void constructorTest2(){
        expectedNoise = "bark";
        testCat = new Cat(expectedName, expectedNoise);

        String actual = testCat.getName();
        String actualSpeak = testCat.speak();

        assertEquals(expectedName, actual);
        assertEquals(expectedNoise, actualSpeak);
    }

    @Test
    public void inheritTest(){
        assertTrue(testCat instanceof Pet);
    }

    @Test
    public void inheritTest2(){
        assertTrue(testCat instanceof Cat);
    }

    @Test
    public void setNameTest(){
        String expectedNewName = "Grod";

        testCat.setName(expectedNewName);

        assertEquals(expectedNewName, testCat.getName());
    }
}