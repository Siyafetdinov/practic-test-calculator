package com.cal.dataproviders.Sub;

import org.testng.annotations.DataProvider;

public class SubTestDoubleData {
    @DataProvider(name = "valuesSubDouble")
    public Object[][] values() {
        return new Object[][]{
                {0.0, 0.0, 0.0},
                {0.0, -0.0, 0.0},
                {-0.0, 0.0, 0.0},
                {-0.0, -0.0, 0.0},
                {Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE - Double.MAX_VALUE},
                {Double.MAX_VALUE, Double.MIN_VALUE, Double.MAX_VALUE - Double.MIN_VALUE},
                {-15.5, -15.5, -15.5 - (-15.5)},
                {-15.5, 15.5, -15.5 - 15.5},
                {15.5, 15.5, 15.5 - 15.5},
                {15.5, -15.5, 15.5 - (-15.5)},
                {-10, -10, -10 - (-10)},
                {10, 10, 10 - 10}
        };
    }
}
