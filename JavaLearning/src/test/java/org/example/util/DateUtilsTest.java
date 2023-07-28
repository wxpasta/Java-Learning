package org.example.util;

import org.junit.Test;

import java.time.LocalDate;


public class DateUtilsTest {

    @Test
    public void getCurrentDate() {
        // 获取当前日期
        String currentDate = DateUtils.getCurrentDate();
        System.out.println("Current date: " + currentDate);
    }

    @Test
    public void getYesterday() {
        // 获取当前日期
        String yesterdayDate = DateUtils.getYesterdayDate();
        System.out.println("Yesterday date: " + yesterdayDate);
    }

    @Test
    public void getTomorrowDate() {
        // 获取当前日期
        String dateStr = DateUtils.getTomorrowDate();
        System.out.println("Tomorrow date: " + dateStr);
    }


    @Test
    public void formatDate() {
        // 格式化日期
        String formattedDate = DateUtils.formatDate(LocalDate.now(), "yyyy/MM/dd");
        System.out.println("Formatted date: " + formattedDate);
    }

    @Test
    public void parseDate() {
        // 解析日期字符串
        LocalDate parsedDate = DateUtils.parseDate("2023-07-28", "yyyy-MM-dd");
        System.out.println("Parsed date: " + parsedDate);
    }

    @Test
    public void getYear() {
        // 获取年份和月份
        LocalDate date = LocalDate.now();
        int year = DateUtils.getYear(date);
        System.out.println("Year: " + year);
    }

    @Test
    public void getMonth() {

        // 获取年份和月份
        LocalDate date = LocalDate.now();
        int month = DateUtils.getMonth(date);
        System.out.println("Month: " + month);
    }
}