package com.cal.dataproviders;

import org.testng.annotations.DataProvider;

public class ValueIsPositiveTestData {
    @DataProvider(name = "valuesOne")
    public Object[][] values() {
        return new Object[][]{
                {Long.MAX_VALUE, true},
                {Long.MIN_VALUE, false},
                {-1000, false},
                {-0, false},
                {0, true},
                {1000, true}
        };
    }
}
