package com.cal.dataproviders;

import org.testng.annotations.DataProvider;

public class SinTestData {
    @DataProvider(name = "valuesSinDouble")
    public Object[][] values() {
        return new Object[][]{
                {Double.MAX_VALUE, Math.sin(Double.MAX_VALUE)},
                {Double.MIN_VALUE, Math.sin(Double.MIN_VALUE)},
                {0, Math.sin(0)},
                {-0, Math.sin(-0)},
                {10.5, Math.sin(10.5)},
                {-10.5, Math.sin(-10.5)},
                {200, Math.sin(200)},
                {-200, Math.sin(-200)}
        };
    }
}
