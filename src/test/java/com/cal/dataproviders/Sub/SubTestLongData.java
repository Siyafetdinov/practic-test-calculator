package com.cal.dataproviders.Sub;

import org.testng.annotations.DataProvider;

public class SubTestLongData {
    @DataProvider(name = "valuesSubLong")
    public Object[][] values() {
        return new Object[][]{
                {0, 0, 0},
                {-0, +0, 0},
                {+0, +0, 0},
                {+0, -0, 0},
                {0, -0, 0},
                {-0, 0, 0},
                {-0, -0, 0},
                {Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE - Long.MAX_VALUE},
                {Long.MAX_VALUE, Long.MIN_VALUE, Long.MAX_VALUE - Long.MIN_VALUE},
                {-15, -15, -15 - (-15)},
                {-15, 15, -15 - 15},
                {15, 15, 15 - 15},
                {15, -15, 15 - (-15)}
        };
    }
}
