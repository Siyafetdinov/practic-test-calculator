package com.cal.tests.postive.Sub;

import com.cal.dataproviders.Sub.SubTestLongData;
import com.cal.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubLongTest extends BaseTest {
    @Test(dataProvider = "valuesSubLong", dataProviderClass = SubTestLongData.class)
    public void subLongTest(long a, long b, long expectedValue) {
        Assert.assertEquals(calculator.sub(a, b), expectedValue, "Invalid SUB (LONG) " + a + " - " + b + " success result = " + expectedValue);
    }
}
