package com.cal.tests.postive.Div;

import com.cal.dataproviders.Div.DivTestDoubleData;
import com.cal.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivDoubleTest extends BaseTest {
    @Test(dataProvider = "valuesDivDouble", dataProviderClass = DivTestDoubleData.class)
    public void divDoubleTestStart(double a, double b, double expectedValue) {
            Assert.assertEquals(calculator.div(a, b), expectedValue, "Invalid DIV (double) " + a + " / " + b + " success result = " + expectedValue);
    }
}
