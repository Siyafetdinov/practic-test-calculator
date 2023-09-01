package com.cal.dataproviders;

import org.testng.annotations.DataProvider;

public class TgTestData {
    @DataProvider(name = "valuesTgDouble")
    public Object[][] values() {
        return new Object[][]{
                {Double.MAX_VALUE, Math.tan(Double.MAX_VALUE)},
                {0, Math.tan(0)},
                {-0, Math.tan(-0)},
                {10.5, Math.tan(10.5)},
                {-10.5, Math.tan(-10.5)},
                {200, Math.tan(200)},
                {-200, Math.tan(-200)}
        };
    }
}
