package com.cal.tests.postive;

import com.cal.dataproviders.SqrtTestData;
import com.cal.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SqrtTest extends BaseTest {
    @Test(dataProvider = "valuesSqrtDouble", dataProviderClass = SqrtTestData.class)
    public void sqrtTest(double a, double expectedValue) {
        Assert.assertEquals(expectedValue, calculator.sqrt(a), "Invalid SQRT | value: " + a + " sqrt success = " + expectedValue);
    }
}
