package com.cal.tests.postive.Sum;

import com.cal.dataproviders.Sum.SumTestLongData;
import com.cal.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumLongTest extends BaseTest {
    @Test(dataProvider = "valuesSumLong", dataProviderClass = SumTestLongData.class)
    public void sumLongTest(long a, long b, long expectedValue) {
        Assert.assertEquals(calculator.sum(a, b), expectedValue, "Invalid SUM (LONG) " + a + " + " + b + " success result = " + expectedValue);
    }
}
