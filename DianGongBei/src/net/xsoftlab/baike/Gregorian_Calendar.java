package net.xsoftlab.baike;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by ZNing on 16/5/28.
 */

public class Gregorian_Calendar {
    static final String week[] = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };

    public static void main(String[] args) {
        int i;
        int year = 2015;
        int month = 10;
        System.out.println(year + "年" + month + "月的日历如下所示：");
        GregorianCalendar cal = new GregorianCalendar(year, month - 1, 1);// 以指定的年、月、该月的第一天来创建对象
        int totalDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 获取这个月的天数
        int startDay = cal.get(Calendar.DAY_OF_WEEK) - 1;// 获取这个月的第一天是星期几
        for (i = 0; i < week.length; i++)
            // 输出1周七天的星期
            System.out.print(week[i] + "\t");
        System.out.println();
        for (i = 0; i < startDay; i++)
            System.out.print("\t"); // 输出第一天之前的空格
        // 依次输出每一天，每一个输出项占8个字符宽度
        for (int day = 1; day <= totalDays; day++) {
            if (day <= 10) {
                System.out.print(day + "\t");
            } else {
                System.out.print(day + "\t");
            }
            i++;
            if (i == 7) { // 每个星期输出完，换行
                System.out.println();
                i = 0;
            }
        }
    }
}