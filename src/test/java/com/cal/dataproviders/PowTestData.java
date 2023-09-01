package com.cal.dataproviders;

import org.testng.annotations.DataProvider;

public class PowTestData {
    @DataProvider(name = "valuePow")
    public Object[][] values() {
        return new Object[][]{
                {0, 0, Math.pow(0, 0)},
                {0, -0, Math.pow(0, -0)},
                {10.5, 10.5, Math.pow(10.5, 10.5)},
                {10.5, -10.5, Math.pow(10.5, -10.5)},
                {-10.5, 10.5, Math.pow(-10.5, 10.5)},
                {-10.5, -10.5, Math.pow(-10.5, -10.5)}
        };
    }
}
