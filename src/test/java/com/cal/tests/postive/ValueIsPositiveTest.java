package com.cal.tests.postive;

import com.cal.dataproviders.ValueIsPositiveTestData;
import com.cal.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValueIsPositiveTest extends BaseTest {
    @Test(dataProvider = "valuesOne", dataProviderClass = ValueIsPositiveTestData.class)
    public void valueIsPositiveTest(long a, boolean expectedValue) {
        Assert.assertEquals(expectedValue, calculator.isPositive(a), "Invalid VALUE (IS POSITIVE) : " + a + " success result  = " + expectedValue);
    }
}
