package org.example.util;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author xubaoji
 */
public class FileParentUtil {

    /**
     * 获取文件父类名称
     */
    public static String getParentFileName(File file) {
        // 文件不存在，返回空
        if (!file.exists()) {
            return null;
        }
        // 返回此抽象路径名的父目录的路径名字符串，如果此路径名没有命名父目录，则返回null。
        String parent = file.getParent();
        if (null == parent) {
            return null;
        }
        Path parentPath = Paths.get(parent);
        Path fileName = parentPath.getFileName();
        return fileName.toString();
    }


}
