package org.example.util;

import java.net.URL;

/**
 * @author xubaoji
 */
public class ResourceUtil {


    /**
     *  获取resources目录下文件地址
     *  参数为 ""（空字符串）或 null，表示获取资源文件夹的根目录路径。
     */
    public static String getResourceAbsolutePath(String fileName) {
        String resourcePath = fileName.trim();
        if (fileName.length() ==  0) {
            resourcePath = "";
        }
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        // 获取资源文件夹的路径
        URL resource = classLoader.getResource(resourcePath);
        String resourcesPath = null;
        if (resource != null) {
            resourcesPath = resource.getPath();
        }
        return resourcesPath;
    }
}
