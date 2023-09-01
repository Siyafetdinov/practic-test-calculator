package com.cal.dataproviders;

import org.testng.annotations.DataProvider;

public class ValueIsNegativeTestData {
    @DataProvider(name = "valuesOne")
    public Object[][] values() {
        return new Object[][]{
                {Long.MAX_VALUE, false},
                {Long.MIN_VALUE, true},
                {-1000, true},
                {-0, true},
                {0, false},
                {1000, false}
        };
    }
}
