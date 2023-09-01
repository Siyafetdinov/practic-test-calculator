package com.cal.tests.postive.Sub;

import com.cal.dataproviders.Sub.SubTestDoubleData;
import com.cal.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubDoubleTest extends BaseTest {

    @Test(dataProvider = "valuesSubDouble", dataProviderClass = SubTestDoubleData.class)
    public void subDoubleTest(double a, double b, double expectedValue) {
        Assert.assertEquals(calculator.sub(a, b), expectedValue, "Invalid SUB (Double) " + a + " - " + b + " success result = " + expectedValue);
    }
}
