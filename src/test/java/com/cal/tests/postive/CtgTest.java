package com.cal.tests.postive;

import com.cal.dataproviders.CtgTestData;
import com.cal.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgTest extends BaseTest {
    @Test(dataProvider = "valuesCtgDouble", dataProviderClass = CtgTestData.class)
    public void ctgTest(double a, double expectedValue) {
        Assert.assertEquals(expectedValue, calculator.ctg(a), "Invalid CTG " + a + " ctg success = " + expectedValue);
    }
}
