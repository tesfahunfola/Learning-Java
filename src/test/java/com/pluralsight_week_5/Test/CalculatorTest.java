package com.pluralsight_week_5.Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        //arrange
        Calculator calculator = new Calculator();
        //act
        double addCal = calculator.add(4, 5);

        //assert
        assertEquals(9, addCal);

    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();

        double calSub = calculator.subtract(100, 44);

        //assert
        assertEquals(56, calSub);
    }

    @Test
    void multiply() {
        //arrange
        Calculator calculator = new Calculator();

        //act
        double calMult = calculator.multiply(10, 90);

        //assert
        assertEquals(900, calMult);

    }

    @Test
    void divide() {
        //arrange
        Calculator calculator = new Calculator();

        //act
        double calDiv = calculator.divide(100, 10);

        //assert
        assertEquals(10, calDiv);
    }
}