package com.pluralsight_week_5.staticExample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathHelperTest {

    @Test
    void add() {
        //arrange
        int total = MathHelper.add(3, 5);
        //act
        int expect = 8;
        //assert
        assertEquals(expect, total);
    }

    @Test
    void square() {
        //arrange
        int total = MathHelper.square(3);
        //act
//        int expect = 9;
        //assert
        assertEquals(9, total);
    }
}