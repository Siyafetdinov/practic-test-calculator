package com.cal.dataproviders.Div;

import org.testng.annotations.DataProvider;

public class DivTestLongData {
    @DataProvider(name = "valuesDivLong")
    public Object[][] values() {
        return new Object[][]{
                {Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE / Long.MAX_VALUE},
                {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE / Long.MIN_VALUE},
                {Long.MAX_VALUE, Long.MIN_VALUE, Long.MAX_VALUE / Long.MIN_VALUE},
                {Long.MIN_VALUE, Long.MAX_VALUE, Long.MIN_VALUE / Long.MAX_VALUE},
                {-15, -15, -15 / -15},
                {-15, -15, -15 / -15},
                {-15, 15, -15 / 15},
                {15, -15, 15 / (-15)},
                {15, 15, 15 / 15}
        };
    }

    @DataProvider(name = "valuesDivLongZero")
    public Object[][] valuesZero() {
        return new Object[][]{
                {0, 0},
                {Long.MAX_VALUE, 0},
                {Long.MIN_VALUE, 0}
        };
    }
}
