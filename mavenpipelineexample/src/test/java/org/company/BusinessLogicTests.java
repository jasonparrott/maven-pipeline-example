package org.company;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BusinessLogicTests {
    @Test
    public void testDoubleTheValue() {
        BusinessLogic object = new BusinessLogic();
        final int initialValue = 10;
        final int expectedValue = 10 * 2;
        final int actualValue = object.doubleTheValue(initialValue);

        assertThat(actualValue, is(expectedValue));
    }
}
