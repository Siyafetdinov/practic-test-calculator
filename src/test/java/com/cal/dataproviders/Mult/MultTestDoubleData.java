package com.cal.dataproviders.Mult;

import org.testng.annotations.DataProvider;

public class MultTestDoubleData {
    @DataProvider(name = "valuesMultDouble")
    public Object[][] values() {
        return new Object[][]{
                {0.0, 0.0, 0.0},
                {0.0, -0.0, 0.0},
                {-0.0, 0.0, 0.0},
                {-0.0, -0.0, 0.0},
                {-15.5, -15.5, -15.5 * -15.5},
                {-15.5, 15.5, -15.5 * 15.5},
                {15.5, -15.5, 15.5 * (-15.5)},
                {15.5, 15.5, 15.5 * 15.5},
                {100.0, 100, 100.0 * 100}
        };
    }
}
