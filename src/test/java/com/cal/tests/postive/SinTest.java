package com.cal.tests.postive;

import com.cal.dataproviders.SinTestData;
import com.cal.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SinTest extends BaseTest {
    @Test(dataProvider = "valuesSinDouble", dataProviderClass = SinTestData.class)
    public void sinTest(double a, double expectedValue) {
        Assert.assertEquals(expectedValue, calculator.sin(a), "Invalid SIN | value: " + a + " sin success = " + expectedValue);
    }
}
