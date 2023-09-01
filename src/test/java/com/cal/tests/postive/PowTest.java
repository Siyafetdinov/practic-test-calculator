package com.cal.tests.postive;

import com.cal.dataproviders.PowTestData;
import com.cal.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PowTest extends BaseTest {
    @Test(dataProvider = "valuePow", dataProviderClass = PowTestData.class)
    public void powTest(double a, double b, double expectedValue) {
        Assert.assertEquals(calculator.pow(a, b), expectedValue, "Invalid POW | value 1: " + a + " value 2: " + b + " pow success = " + expectedValue);
    }
}
