package com.pluralsight_week_5.staticExample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void testGetName() {
        //arrange
        Cat cat1 = new Cat("mew");

        //act
        String name = cat1.getName();
        //assert
        assertEquals("mew",name);
    }


    @Test
    void getCatCount() {
        //arrange
        Cat cat1 = new Cat("mew");
        Cat cat2 = new Cat("Puff");

//        //act
//        String name = cat1.getName();
        //assert
        assertEquals(2,Cat.getCatCount());
    }
}