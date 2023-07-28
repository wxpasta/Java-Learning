package org.example.util;

import org.junit.Test;

import java.time.LocalDateTime;

public class DateTimeUtilsTest {

    @Test
    public void getCurrentDateTime() {
        // 获取当前日期时间
        String currentDateTime = DateTimeUtils.getCurrentDateTime();
        System.out.println("Current date time: " + currentDateTime);
    }

    @Test
    public void getYesterdayTime() {
        // 获取当前日期
        String yesterdayDateTime = DateTimeUtils.getYesterdayDateTime();
        System.out.println("Yesterday date time: " + yesterdayDateTime);
    }

    @Test
    public void getTomorrowDate() {
        // 获取当前日期
        String dateStrTime = DateTimeUtils.getTomorrowDateTime();
        System.out.println("Tomorrow date time: " + dateStrTime);
    }

    @Test
    public void formatDateTime() {
        // 格式化日期时间
        String formattedDateTime = DateTimeUtils.formatDateTime(LocalDateTime.now(), "yyyy/MM/dd HH:mm:ss");
        System.out.println("Formatted date time: " + formattedDateTime);
    }

    @Test
    public void parseDateTime() {
        // 解析日期时间字符串
        LocalDateTime parsedDateTime = DateTimeUtils.parseDateTime("2023-07-28 10:30:00", "yyyy-MM-dd HH:mm:ss");
        System.out.println("Parsed date time: " + parsedDateTime);
    }

    @Test
    public void getYear() {
        // 获取年份和月份
        LocalDateTime dateTime = LocalDateTime.now();
        int year = DateTimeUtils.getYear(dateTime);
        int month = DateTimeUtils.getMonth(dateTime);
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
    }

    @Test
    public void getMonth() {
        // 获取年份和月份
        LocalDateTime dateTime = LocalDateTime.now();
        int year = DateTimeUtils.getYear(dateTime);
        int month = DateTimeUtils.getMonth(dateTime);
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
    }
}