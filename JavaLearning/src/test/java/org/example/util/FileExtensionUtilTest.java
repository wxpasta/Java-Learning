package org.example.util;

import org.junit.Assert;
import org.junit.Test;


public class FileExtensionUtilTest {

    @Test
    public void testIsEmptyString2() {
        String path = "test.xlsx";
        String extension = FileExtensionUtil.getExtension(path);
        Assert.assertEquals(extension,"xlsx");
    }
}