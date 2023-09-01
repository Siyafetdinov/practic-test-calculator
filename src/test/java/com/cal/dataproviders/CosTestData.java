package com.cal.dataproviders;

import org.testng.annotations.DataProvider;

public class CosTestData {
    @DataProvider(name = "valuesCosDouble")
    public Object[][] values() {
        return new Object[][]{
                {Double.MAX_VALUE, Math.cos(Double.MAX_VALUE)},
                {Double.MIN_VALUE, Math.cos(Double.MIN_VALUE)},
                {0, Math.cos(0)},
                {10.5, Math.cos(10.5)},
                {-10.5, Math.cos(-10.5)},
                {10, Math.cos(10)},
                {-10, Math.cos(-10)}
        };
    }
}
