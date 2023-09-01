package com.cal.tests.postive;

import com.cal.dataproviders.ValueIsNegativeTestData;
import com.cal.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValueNegativeTest extends BaseTest {

    @Test(dataProvider = "valuesOne", dataProviderClass = ValueIsNegativeTestData.class)
    public void valueNegativeTest(long a, boolean expectedValue) {
        Assert.assertEquals(expectedValue, calculator.isNegative(a), "Invalid VALUE (IS NEGATIVE) : " + a + " success result  = " + expectedValue);
    }
}
