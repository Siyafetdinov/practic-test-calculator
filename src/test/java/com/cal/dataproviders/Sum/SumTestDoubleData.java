package com.cal.dataproviders.Sum;

import org.testng.annotations.DataProvider;

public class SumTestDoubleData {
    @DataProvider(name = "valuesSumDouble")
    public Object[][] values() {
        return new Object[][]{
                {Double.MIN_VALUE, Double.MAX_VALUE, Double.MIN_VALUE + Double.MAX_VALUE},
                {0.0, 0.0, 0.0},
                {0.0, -0.0, 0.0},
                {-0.0, 0.0, 0.0},
                {-0.0, -0.0, 0.0},
                {-15.5, -15.5, -15.5 + (-15.5)},
                {-15.5, 15.5, -15.5 + 15.5},
                {15.5, 15.5, 15.5 + 15.5},
                {15.5, -15.5, 15.5 + (-15.5)},
                {-10, -10, -10 + (-10)},
                {10, 10, 10 + 10}
        };
    }
}
