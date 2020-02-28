package io.zipcoder.pets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GorillaTest {

    String expectedNoise;
    String expectedName;
    Gorilla testGorilla;

    @BeforeEach
    public void init(){
        expectedNoise = "waaaaaah";
        expectedName = "Gnar";
        testGorilla = new Gorilla(expectedName);

    }

    @Test
    public void speakTest(){
        String actual = testGorilla.speak();

        assertEquals(expectedNoise, actual);
    }

    @Test
    public void constructorTest(){
        String actual = testGorilla.getName();

        assertEquals(expectedName, actual);
    }

    @Test
    public void constructorTest2(){
        expectedNoise = "bark";
        testGorilla = new Gorilla(expectedName, expectedNoise);

        String actual = testGorilla.getName();
        String actualSpeak = testGorilla.speak();

        assertEquals(expectedName, actual);
        assertEquals(expectedNoise, actualSpeak);
    }

    @Test
    public void inheritTest(){
        assertTrue(testGorilla instanceof Pet);
    }

    @Test
    public void inheritTest2(){
        assertTrue(testGorilla instanceof Gorilla);
    }

    @Test
    public void setNameTest(){
        String expectedNewName = "Grod";

        testGorilla.setName(expectedNewName);

        assertEquals(expectedNewName, testGorilla.getName());
    }
}