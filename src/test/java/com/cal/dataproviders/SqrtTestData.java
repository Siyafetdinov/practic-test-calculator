package com.cal.dataproviders;

import org.testng.annotations.DataProvider;

public class SqrtTestData {
    @DataProvider(name = "valuesSqrtDouble")
    public Object[][] values() {
        return new Object[][]{
                {10.5, Math.sqrt(10.5)},
                {-10.5, Math.sqrt(-10.5)},
                {200, Math.sqrt(200)},
                {-200, Math.sqrt(-200)}
        };
    }

    @DataProvider(name = "valuesSqrtDoubleZero")
    public Object[][] valuesZero() {
        return new Object[][]{
                {0},
                {-0}
        };
    }
}
