package com.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.util.Date;

public class LocalDateTimeTest {

    public static void main(String[] args) {
        LocalDateTime dateTime1=LocalDateTime.now();
        System.out.println(dateTime1);
        LocalDateTime of = LocalDateTime.of(1998, 10, 19, 10, 10,15,15);
        System.out.println(of);
        System.out.println(of.getYear()+"  "+of.getMonthValue()+" "
                +of.getDayOfMonth()+" "+of.getHour()+" "+of.getMinute()+" "
                +of.getNano()+" "+of.getSecond());


        LocalDateTime news = of.withYear(2021);
        System.out.println(of);
        System.out.println(news);
        LocalDateTime ns=of.withMonth(12).withYear(2020);
        //with** 方法返回新对象，调用者不变
        System.out.println(ns);
        LocalDateTime nss=of.withMonth(12).withYear(2020).withHour(12).withDayOfMonth(1).withMinute(12).withSecond(12);
        System.out.println(nss);
        LocalDateTime nsss = nss.minusYears(10);
        System.out.println(nsss);
        LocalDateTime ns3 = nss.plusMonths(1);
        System.out.println(ns3);

        //-----------格式化-----------------1---------
        DateTimeFormatter f=DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String f11 = f.format(ns3);
        System.out.println(f11);
        TemporalAccessor parse = f.parse(f11);
        System.out.println(parse+"\n----------------------");
        //-----------------------------2---------
        DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter f3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter f4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(f2.format(ns3));//2021年1月1日 下午12时12分12秒
        System.out.println(f3.format(ns3));//   21-1-1 下午12:12
        System.out.println(f4.format(ns3));//2021-1-1 12:12:12
        System.out.println("****************************");
        System.out.println(f4.parse("2021-12-12 11:12:12"));
        //--------3自定义--------------------
        DateTimeFormatter f5=DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        System.out.println(f5.format(ns3));
        TemporalAccessor parse1 = f5.parse("19981019101020");
        System.out.println(parse1);

        //---?????TemporalAccessor 怎么使用？？？怎么变成LocalDateTime


    }

    private static void formt() {
    }
}
