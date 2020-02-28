package io.zipcoder.pets;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DogTest {

    String expectedNoise;
    String expectedName;
    Dog testDog;

    @BeforeEach
    public void init(){
        expectedNoise = "woof woof";
        expectedName = "Joe";
        testDog = new Dog(expectedName);

    }

    @Test
    public void speakTest(){
        String actual = testDog.speak();

        assertEquals(expectedNoise, actual);
    }

    @Test
    public void constructorTest(){
        String actual = testDog.getName();

        assertEquals(expectedName, actual);
    }

    @Test
    public void constructorTest2(){
        expectedNoise = "bark";
        testDog = new Dog(expectedName, expectedNoise);

        String actual = testDog.getName();
        String actualSpeak = testDog.speak();

        assertEquals(expectedName, actual);
        assertEquals(expectedNoise, actualSpeak);
    }

    @Test
    public void inheritTest(){
        assertTrue(testDog instanceof Pet);
    }

    @Test
    public void inheritTest2(){
        assertTrue(testDog instanceof Dog);
    }

    @Test
    public void setNameTest(){
        String expectedNewName = "Grod";

        testDog.setName(expectedNewName);

        assertEquals(expectedNewName, testDog.getName());
    }
}