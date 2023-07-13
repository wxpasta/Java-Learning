package org.example.util;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;


public class FileParentUtilTest {

    @Test
    public void testParentFileName() {
        String path = "test.xlsx";
        File file = new File(path);
        String extension = FileParentUtil.getParentFileName(file);
        Assert.assertNull(extension);
    }

    @Test
    public void test() {
        String absolutePath = ResourceUtil.getResourceAbsolutePath("test.xlsx");
        File file = new File(absolutePath);
        String getParentFileName = FileParentUtil.getParentFileName(file);
        Assert.assertNotNull(getParentFileName);
    }
}