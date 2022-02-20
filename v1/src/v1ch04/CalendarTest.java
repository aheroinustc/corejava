package v1ch04;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarTest {
    public static void main(String[] args) {
        //为方便打印，设置locale为us
        Locale.setDefault(Locale.US);

        //构造当前日期的日历
        GregorianCalendar d = new GregorianCalendar();

        int today = d.get(Calendar.DAY_OF_MONTH); //获得当前的日
        int month = d.get(Calendar.MONTH); //获得当前的月

        //把日历设置到当前月份的第一天
        d.set(Calendar.DAY_OF_MONTH, 1);
        //获得当月第一天是星期几
        int weekday = d.get(Calendar.DAY_OF_WEEK);

        //获得星期的开始是星期几 (Sunday in the U.S.)
        int firstDayOfWeek = d.getFirstDayOfWeek();

        // 确定所需的缩进距离
        int indent = 0;
        while (weekday != firstDayOfWeek) {
            indent++;
            d.add(Calendar.DAY_OF_MONTH, -1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }

        // 打印星期的缩写字符串
        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        do {
            System.out.printf("%-4s", weekdayNames[weekday]);
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        } while (weekday != firstDayOfWeek);

        System.out.println();
        //开始打印日期

        //打印缩进的距离
        for (int i = 1; i <= indent; i++)
            System.out.print("    ");

        //设置日期为当月的第一天
        d.set(Calendar.DAY_OF_MONTH, 1);
        do {
            //打印日
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);

            // 打印当前日的标记 *
            if (day == today) System.out.print("*");
            else System.out.print(" ");

            // 前进1日
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);

            // 另起一周
            if (weekday == firstDayOfWeek) System.out.println();
        } while (d.get(Calendar.MONTH) == month);
        // 退出循环，当日来到下一月

        // print final end of line if necessary
        if (weekday != firstDayOfWeek) System.out.println();
    }
}