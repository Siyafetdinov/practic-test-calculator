package com.cal.dataproviders;

import org.testng.annotations.DataProvider;

public class CtgTestData {
    @DataProvider(name = "valuesCtgDouble")
    public Object[][] values() {
        return new Object[][]{
                {Double.MAX_VALUE, 1.0 / Math.tan(Double.MAX_VALUE)},
                {Double.MIN_VALUE, 1.0 / Math.tan(Double.MIN_VALUE)},
                {10.5, 1.0 / Math.tan(10.5)},
                {-10.5, 1.0 / Math.tan(-10.5)},
                {-10, 1.0 / Math.tan(-10)},
                {10, 1.0 / Math.tan(10)}
        };
    }
}
