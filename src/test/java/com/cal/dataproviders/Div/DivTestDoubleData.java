package com.cal.dataproviders.Div;

import org.testng.annotations.DataProvider;

public class DivTestDoubleData {
    @DataProvider(name = "valuesDivDouble")
    public Object[][] values() {

        return new Object[][]{
                {Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE / Double.MAX_VALUE},
                {Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE / Double.MIN_VALUE},
                {Double.MAX_VALUE, Double.MIN_VALUE, Double.MAX_VALUE / Double.MIN_VALUE},
                {Double.MIN_VALUE, Double.MAX_VALUE, Double.MIN_VALUE / Double.MAX_VALUE},
                {-15.5, -15.5, -15.5 / -15.5},
                {-15.5, -15.5, -15.5 / -15.5},
                {-15.5, 15.5, -15.5 / 15.5},
                {15.5, -15.5, 15.5 / (-15.5)},
                {15.5, 15.5, 15.5 / 15.5},
                {100.0, 100, 100.0 / 100},
        };
    }

    @DataProvider(name = "valuesDivDoubleZero")
    public Object[][] valuesZero() {

        return new Object[][]{
                {0.0, 0.0},
                {0.0, -0.0},
                {-0.0, 0.0},
                {-0.0, -0.0},
                {Double.MAX_VALUE, 0},
                {Double.MIN_VALUE, 0}
        };
    }


    @DataProvider(name = "valuesDivDoubleNegative")
    public Object[][] valuesNegative() {
        return new Object[][]{
                {100.0, 1.0, 100.0},
        };
    }
}
