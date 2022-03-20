package com.chang;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lamuda {

    public static void main(String[] args) {
        Consumer consumer=new Consumer() {
            @Override
            public void accept(Object o) {

            }
        };

        Consumer<String> c=(a)-> System.out.println(a);
        Consumer<String> c2=(a)-> System.out.println(a);

        Predicate<Integer> isjishu=(a)->a%2!=0;

        //定义一个方法转大写
        Function<String,String> toUP=(in)-> in.toUpperCase();
         //Date转成字符串
        Function<Date,String> dateToString=
                (date)->new SimpleDateFormat("YYYY年MM月dd日，HH时mm分ss秒").format(date);


        c.accept("aasdfadfa");//aasdfadfa


        System.out.println(isjishu.test(123));// true


        System.out.println(toUP.apply("adfavavfSFEDFHDFvnj"));// ADFAVAVFSFEDFHDFVNJ


        System.out.println(dateToString.apply(new Date()));//2022年01月07日，14时21分04秒


        //-------------------------------------------------------------
        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("th1.start()");
            }
        });
        th1.start();

        Thread th2=new Thread(()-> System.out.println("th2.start"));
        th2.start();
        //----------------------------------------
        new Thread(()->show("001")).start();
        new Thread(()->show("002")).start();
        new Thread(()->show("003")).start();
        new Thread(()->show("004")).start();
        new Thread(()->show("005")).start();
/*



        new Thread(()->new Lamuda().show2("20001")).start();
        new Thread(()->new Lamuda().show2("20002")).start();
        new Thread(()->new Lamuda().show2("20003")).start();
        new Thread(()->new Lamuda().show2("20004")).start();
        new Thread(()->new Lamuda().show2("20005")).start();
        new Thread(()->new Lamuda().show2("20006")).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                show("30001");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                show("30001");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                show("30002");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                show("30003");
            }
        }).start();

*/


    }

    public static void show(String s) {
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(s);
        }

    }
    public  void show2(String s) {
        for (int i = 0; i <100 ; i++) {
            System.out.println(s);
        }

    }
}
