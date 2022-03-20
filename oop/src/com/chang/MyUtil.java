package com.chang;

public class MyUtil {

    static final double PI=3.1415926D;
    public static  void sayHello(){
        System.out.println("Hello");

    }


    //下面两个方法是多态的实现
    public static void run(person p){
        p.addRun2();
    }

    public static person getMan(String a){
        person p=null;
        if ("老师".equals(a)) {
            p=new Teacher(12,"网老师","0201","地理");

        }else if ("学生".equals(a)) {
            p=new Student(22,"小liu","0032","5班");
        }else if ("工人".equals(a)) {
            p=new Worker(1);
        }else {
            return new person() {
                @Override
                public void run() {
                    System.out.println("匿名内部类 跑起来了");
                }

                @Override
                public void run1() {

                }
            };
        }


        return p;
    }

}
