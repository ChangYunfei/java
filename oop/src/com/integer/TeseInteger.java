package com.integer;

public class TeseInteger {
    public static void main(String[] args) {
        Integer i=999;
        Integer i2=new Integer("901");
        int i3=Integer.parseInt("902");
        System.out.println(Integer.toString(25465));
        System.out.println("i2="+i2);
        System.out.println("i3="+i3);

        System.out.println(Integer.signum(123)+" "+Integer.bitCount(1));
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Double.compare(1.003,1.0034));
        System.out.println(Double.max(123,15.0));
        System.out.println(Double.sum(2.001,1.002));
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_EXPONENT);


    }
}
