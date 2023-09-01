package com.cal.tests.negative;

import com.cal.dataproviders.Div.DivTestDoubleData;
import com.cal.baseTest.BaseTest;
import org.testng.annotations.Test;

public class DivDoubleZeroTest extends BaseTest {
    @Test(dataProvider = "valuesDivDoubleZero", dataProviderClass = DivTestDoubleData.class, expectedExceptions = ArithmeticException.class)
    public void divDoubleZeroTest(double a, double b) {
        double result = calculator.div(a, b);
    }
}
