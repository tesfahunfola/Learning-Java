package com.pluralsight_week_6.oop2.recap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    @Test
    void testGetterAndSetter(){
        // arrange

        Wizard  tew = new Wizard("TEs","room","77","Yelem");

    //        act
        tew.setName("Ezana");
        tew.setHouse("Park");
        tew.setPowerLevel("98");
        tew.setWandType("Alew");

    //        asssert
        assertEquals("Ezana",tew.getName());
        assertEquals("Park",tew.getHouse());
        assertEquals("98",tew.getPowerLevel());
        assertEquals("Alew",tew.getWandType());
    }

    @Test
    void castSpell() {
        //        arrange
        Wizard man = new Wizard("Beke", "villa","66","low");

//        act
        man.setHouse("Appart");
        man.setName("Fola");

//        asssert
        man.castSpell("Boss");

        assertEquals("Fola", man.getName());
    }
}