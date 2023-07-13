package org.example.util;

import org.apache.commons.io.FilenameUtils;

/**
 * @author xubaoji
 */
public class FileExtensionUtil {

    /**
     * 获取文件扩展名
     */
    public static String getExtension(String fileName) {
        return FilenameUtils.getExtension(fileName);
    }
}
