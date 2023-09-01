package com.cal.tests.negative;

import com.cal.dataproviders.SqrtTestData;
import com.cal.baseTest.BaseTest;
import org.testng.annotations.Test;

public class SqrtTestZero extends BaseTest {
    @Test(dataProvider = "valuesSqrtDoubleZero", dataProviderClass = SqrtTestData.class, expectedExceptions = ArithmeticException.class)
    public void sqrtTestZero(double a) {
        double result = calculator.sqrt(a);
    }
}
