package org.example.util;

import org.junit.Assert;
import org.junit.Test;


public class ResourceUtilTest {

    @Test
    public void testGetResourceAbsolutePath() {
        String absolutePath = ResourceUtil.getResourceAbsolutePath("");
        Assert.assertNotNull(absolutePath);
    }
}