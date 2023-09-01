package com.cal.dataproviders.Mult;

import org.testng.annotations.DataProvider;

public class MultTestLongData {
    @DataProvider(name = "valuesMultLong")
    public Object[][] values() {
        return new Object[][]{
                {0, 0, 0},
                {0, -0, 0},
                {-0, 0, 0},
                {-0, -0, 0},
                {-15, -15, -15 * -15},
                {-15, 15, -15 * 15},
                {100, 100, 100 * 100},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE * Integer.MAX_VALUE},
                {Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE * Integer.MAX_VALUE},
        };
    }
}
