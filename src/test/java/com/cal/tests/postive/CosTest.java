package com.cal.tests.postive;

import com.cal.dataproviders.CosTestData;
import com.cal.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CosTest extends BaseTest {
    @Test(dataProvider = "valuesCosDouble", dataProviderClass = CosTestData.class)
    public void cosTest(double a, double expectedValue) {
        Assert.assertEquals(expectedValue, calculator.cos(a), "Invalid COS " + a + " cos success = " + expectedValue);
    }
}
