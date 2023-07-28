package org.example.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtils {

    private static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * 获取当前日期时间
     *
     * @return 当前日期时间的字符串形式，格式为"yyyy-MM-dd HH:mm:ss"
     */
    public static String getCurrentDateTime() {
        return formatDateTime(LocalDateTime.now(), DEFAULT_PATTERN);
    }

    /**
     * 获取昨天的日期
     *
     * @return 当前日期的字符串形式，格式为"yyyy-MM-dd HH:mm:ss"
     */
    public static String getYesterdayDateTime() {
        LocalDateTime yesterdayTime = LocalDateTime.now().minusDays(1);
        return formatDateTime(yesterdayTime, DEFAULT_PATTERN);
    }

    /**
     * 获取明天的日期
     *
     * @return 当前日期的字符串形式，格式为"yyyy-MM-dd HH:mm:ss"
     */
    public static String getTomorrowDateTime() {
        LocalDateTime tomorrowDateTime = LocalDateTime.now().plusDays(1);
        return formatDateTime(tomorrowDateTime, DEFAULT_PATTERN);
    }


    /**
     * 格式化日期时间
     *
     * @param dateTime 日期时间对象
     * @param pattern  日期时间格式
     * @return 格式化后的日期时间字符串
     */
    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        return dateTime.format(DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * 解析日期时间字符串
     *
     * @param dateTimeString 日期时间字符串
     * @param pattern        日期时间格式
     * @return 解析后的日期时间对象
     */
    public static LocalDateTime parseDateTime(String dateTimeString, String pattern) {
        return LocalDateTime.parse(dateTimeString, DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * 获取指定日期时间的年份
     *
     * @param dateTime 日期时间对象
     * @return 年份
     */
    public static int getYear(LocalDateTime dateTime) {
        return dateTime.getYear();
    }

    /**
     * 获取指定日期时间的月份
     *
     * @param dateTime 日期时间对象
     * @return 月份，从1开始计数
     */
    public static int getMonth(LocalDateTime dateTime) {
        return dateTime.getMonthValue();
    }

    // 这里可以添加更多的日期时间工具方法，根据实际需求进行封装

}
