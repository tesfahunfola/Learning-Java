package com.pluralsight_week_5.staticExample;

import javax.xml.namespace.QName;

public class Cat {
   private String name;

   private static int catCount = 0;

    public Cat(String name) {
        this.name = name;
        catCount ++;
    }

    public String getName() {
        return name;
    }

    public static int getCatCount() {
        return catCount;
    }
}
