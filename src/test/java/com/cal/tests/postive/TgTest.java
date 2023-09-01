package com.cal.tests.postive;

import com.cal.dataproviders.TgTestData;
import com.cal.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TgTest extends BaseTest {
    @Test(dataProvider = "valuesTgDouble", dataProviderClass = TgTestData.class)
    public void tgTest(double a, double expectedValue) {
        Assert.assertEquals(expectedValue, calculator.tg(a), "Invalid TG | value: " + a + " tg success = " + expectedValue);
    }
}
