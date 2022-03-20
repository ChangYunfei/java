package com.date;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.getTime());
        int i =0 ;
        System.out.println(c.get(Calendar.DATE)+" "+c.get(Calendar.YEAR)+" ");

    }
}
