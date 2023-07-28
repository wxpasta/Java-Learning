package org.example.util;

import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

import static org.junit.Assert.*;

public class DateOldUtilsTest {

    @Test
    public void getCurrentDate() {
        // 获取当前日期
        String currentDate = DateOldUtils.getCurrentDate();
        System.out.println("Current date: " + currentDate);
    }

    @Test
    public void formatDate() {
        // 格式化日期
        String formattedDate = DateOldUtils.formatDate(new Date(), "yyyy/MM/dd");
        System.out.println("Formatted date: " + formattedDate);
    }

    @Test
    public void parseDate() {
        // 解析日期字符串
        try {
            Date parsedDate = DateOldUtils.parseDate("2023-07-28", "yyyy-MM-dd");
            System.out.println("Parsed date: " + parsedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getYear() {
        // 获取年份和月份
        Date date = new Date();
        int year = DateOldUtils.getYear(date);
        System.out.println("Year: " + year);
    }

    @Test
    public void getMonth() {
        // 获取年份和月份
        Date date = new Date();
        int month = DateOldUtils.getMonth(date);
        System.out.println("Month: " + month);
    }
}