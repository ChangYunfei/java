package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
    detetest2();
datetest();

    }

    private static void detetest2() {
        //Date--------------------------------
        Date d=new Date();
        System.out.println(d);
        long a;
        System.out.println(a=System.currentTimeMillis());
        long b;
        System.out.println(b=System.currentTimeMillis());
        System.out.println(b - a);
        //y不能大写
        SimpleDateFormat s=new SimpleDateFormat("yyMMdd HHmmss");
        SimpleDateFormat s1=new SimpleDateFormat("yyyyMMdd hhmmss");
        SimpleDateFormat s2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ds = s.format(d);
        String ds1 = s1.format(d);
        String ds2 = s2.format(d);
        System.out.println(ds+"\n"+ds1+"\n"+ds2);


        SimpleDateFormat s4=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd1=null;
        try {
            dd1=s4.parse("1998-10-19 13:14:0");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(dd1);
        System.out.println(s4.format(dd1));

    }

    private static void datetest() {
       // SimpleDateFormat s4=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");错误的写法年份y必须小写
        SimpleDateFormat s4=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd1=null;
        try {
            dd1=s4.parse("2001-1-1 14:14:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(dd1);
        System.out.println(s4.format(dd1));
        long t1 = dd1.getTime();
        System.out.println(t1);
        long t2;
        System.out.println(t2=System.currentTimeMillis());
        System.out.println(t2 - t1);

        try {
            System.out.println(   (s4.parse("2001-1-1 14:14:01").getTime())
                                 - (s4.parse("2001-1-1 14:14:00").getTime())
                               );
        } catch (ParseException e) {
            e.printStackTrace();
        }

       java.sql.Date sqlDate=new java.sql.Date(new Date().getTime());
        System.out.println(sqlDate.toLocalDate());
    }

}
