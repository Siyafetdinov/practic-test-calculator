package com.cal.tests.negative;

import com.cal.dataproviders.Div.DivTestLongData;
import com.cal.baseTest.BaseTest;
import org.testng.annotations.Test;

public class DivLongZeroTest extends BaseTest {
    @Test(dataProvider = "valuesDivLongZero", dataProviderClass = DivTestLongData.class, expectedExceptions = NumberFormatException.class)
    public void divLongZeroTest(long a, long b) {
        long result = calculator.div(a, b);
    }
}
