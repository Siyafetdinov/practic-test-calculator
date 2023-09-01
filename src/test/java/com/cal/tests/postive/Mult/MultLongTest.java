package com.cal.tests.postive.Mult;

import com.cal.dataproviders.Mult.MultTestLongData;
import com.cal.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultLongTest extends BaseTest {
    @Test(dataProvider = "valuesMultLong", dataProviderClass = MultTestLongData.class)
    public void multLongTest(long a, long b, long expectedValue) {
        Assert.assertEquals(calculator.mult(a, b), expectedValue, "Invalid MULT (LONG) " + a + " * " + b + " success result = " + expectedValue);
    }
}
