package org.example.util;

import org.junit.Assert;
import org.junit.Test;


public class StringUtilTest {
    @Test
    public void testIsEmptyString() {
        boolean testIsEmpty = StringUtil.isEmptyString("TestString");
        Assert.assertFalse(testIsEmpty);
    }

    @Test
    public void testIsEmptyString2() {
        boolean testIsEmpty = StringUtil.isEmptyString("");
        Assert.assertTrue(testIsEmpty);
    }

    @Test
    public void testIsEmptyString3() {
        boolean testIsEmpty = StringUtil.isEmptyString(null);
        Assert.assertTrue(testIsEmpty);
    }
}