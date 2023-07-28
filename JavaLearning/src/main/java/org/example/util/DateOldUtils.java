package org.example.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author xubaoji
 */
public class DateOldUtils {

    private static final String DEFAULT_PATTERN = "yyyy-MM-dd";

    /**
     * 获取当前日期
     *
     * @return 当前日期的字符串形式，格式为"yyyy-MM-dd"
     */
    public static String getCurrentDate() {
        return formatDate(new Date(), DEFAULT_PATTERN);
    }

    /**
     * 格式化日期
     *
     * @param date    日期对象
     * @param pattern 日期格式
     * @return 格式化后的日期字符串
     */
    public static String formatDate(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * 解析日期字符串
     *
     * @param dateString 日期字符串
     * @param pattern    日期格式
     * @return 解析后的日期对象
     * @throws ParseException 如果解析失败，则抛出此异常
     */
    public static Date parseDate(String dateString, String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.parse(dateString);
    }

    /**
     * 获取指定日期的年份
     *
     * @param date 日期对象
     * @return 年份
     */
    public static int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    /**
     * 获取指定日期的月份
     *
     * @param date 日期对象
     * @return 月份，从1开始计数
     */
    public static int getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) + 1;
    }

    // 这里可以添加更多的日期工具方法，根据实际需求进行封装

}
