package org.example.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author xubaoji
 */
public class DateUtils {

    private static final String DEFAULT_PATTERN = "yyyy-MM-dd";

    /**
     * 获取当前日期
     *
     * @return 当前日期的字符串形式，格式为"yyyy-MM-dd"
     */
    public static String getCurrentDate() {
        return formatDate(LocalDate.now(), DEFAULT_PATTERN);
    }

    /**
     * 获取昨天的日期
     *
     * @return 当前日期的字符串形式，格式为"yyyy-MM-dd"
     */
    public static String getYesterdayDate() {
        LocalDate yesterday = LocalDate.now().minusDays(1);
        return formatDate(yesterday, DEFAULT_PATTERN);
    }

    /**
     * 获取明天的日期
     *
     * @return 当前日期的字符串形式，格式为"yyyy-MM-dd"
     */
    public static String getTomorrowDate() {
        LocalDate tomorrowDate = LocalDate.now().plusDays(1);
        return formatDate(tomorrowDate, DEFAULT_PATTERN);
    }


    /**
     * 格式化日期
     *
     * @param date    日期对象
     * @param pattern 日期格式
     * @return 格式化后的日期字符串
     */
    public static String formatDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * 解析日期字符串
     *
     * @param dateString 日期字符串
     * @param pattern    日期格式
     * @return 解析后的日期对象
     */
    public static LocalDate parseDate(String dateString, String pattern) {
        return LocalDate.parse(dateString, DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * 获取指定日期的年份
     *
     * @param date 日期对象
     * @return 年份
     */
    public static int getYear(LocalDate date) {
        return date.getYear();
    }

    /**
     * 获取指定日期的月份
     *
     * @param date 日期对象
     * @return 月份，从1开始计数
     */
    public static int getMonth(LocalDate date) {
        return date.getMonthValue();
    }

    // 这里可以添加更多的日期工具方法，根据实际需求进行封装

}