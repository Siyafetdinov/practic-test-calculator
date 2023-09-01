package com.cal.tests.postive.Sum;

import com.cal.dataproviders.Sum.SumTestDoubleData;
import com.cal.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumDoubleTest extends BaseTest {
    @Test(dataProvider = "valuesSumDouble", dataProviderClass = SumTestDoubleData.class)
    public void sumDoubleTest(double a, double b, double expectedValue) {
        Assert.assertEquals(calculator.sum(a, b), expectedValue, "Invalid SUM (Double) " + a + " + " + b + " success result = " + expectedValue);
    }
}
