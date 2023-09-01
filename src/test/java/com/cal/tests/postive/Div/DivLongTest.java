package com.cal.tests.postive.Div;

import com.cal.dataproviders.Div.DivTestLongData;
import com.cal.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivLongTest extends BaseTest {
    @Test(dataProvider = "valuesDivLong", dataProviderClass = DivTestLongData.class)
    public void divLongTestStart(long a, long b, long expectedValue) {
        Assert.assertEquals(calculator.div(a, b), expectedValue, "Invalid DIV (LONG) " + a + " / " + b + " success result = " + expectedValue);
    }
}
