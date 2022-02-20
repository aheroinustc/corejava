package v1ch04;

/**
 * 将时间和日历分开是一种很好的面向对象设计。
 * 标准java类库包含了两个类：
 * 一个是用于表示时间点的Date类、
 * 另一个是用于表示格里高利历的GregorianCalendar类，它扩展自Calendar类。
 *  Date类提供的日期处理函数很多都已经废弃，推荐使用日历类中的方法。
 *
 */

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class DateDemo {

    public static void main(String[] args) {

        //构造Date类的对象，初始化为当前的日期和时间
        Date date = new Date();
        System.out.println(date);

        //构造一个GregorianCalendar对象，初始化为当前的日期和时间
        GregorianCalendar now = new GregorianCalendar();

        //获得当前的年月日时，get方法的使用  访问器
        int year = now.get(Calendar.YEAR) ;
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH) ;
        int weekday = now.get(Calendar.DAY_OF_WEEK) ;
        int hour = now.get(Calendar.HOUR_OF_DAY) ;
        System.out.printf("year = %d , month = %d ,day = %d , weekday = %d, hour = %d\n" ,year ,month ,day , weekday,hour);

        //set方法的使用 更改器
        GregorianCalendar deadline = new GregorianCalendar() ;
        deadline.set(Calendar.YEAR ,2001) ;
        deadline.set(Calendar.MONTH,Calendar.APRIL) ;
        deadline.set(Calendar.DAY_OF_MONTH,15);
        // deadline.set(2001,Calendar.APRIL,15) ; 简化方法
        deadline.add(Calendar.MONTH ,3) ; //向后移动3个月


        //GregorianCalendar和Date类的相互转换

        //已知Date求GregorianCalendar
        Date hireDate = new Date() ;
        GregorianCalendar calendar = new GregorianCalendar() ;
        calendar.setTime(hireDate);

        //已知GregorianCalendar求Date
        hireDate  = calendar.getTime();

    }

}
