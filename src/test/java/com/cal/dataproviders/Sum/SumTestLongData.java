package com.cal.dataproviders.Sum;

import org.testng.annotations.DataProvider;

public class SumTestLongData {
    @DataProvider(name = "valuesSumLong")
    public Object[][] values() {
        return new Object[][]{
                {Long.MIN_VALUE, Long.MAX_VALUE, Long.MIN_VALUE + Long.MAX_VALUE},
                {0, 0, 0},
                {-1000, -1000, -2000},
                {-1000, 999, -1},
                {1000, -999, 1},
                {100, 100, 200},
        };
    }
}
