package com.cal.tests.postive.Mult;

import com.cal.dataproviders.Mult.MultTestDoubleData;
import com.cal.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultDoubleTest extends BaseTest {
    @Test(dataProvider = "valuesMultDouble", dataProviderClass = MultTestDoubleData.class)
    public void multDoubleTest(double a, double b, double expectedValue) {
        Assert.assertEquals(calculator.mult(a, b), expectedValue, "Invalid MULT (DOUBLE) " + a + " * " + b + " success result = " + expectedValue);
    }
}
