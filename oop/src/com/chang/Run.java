package com.chang;

public interface Run {
    abstract void run();
    abstract void run1();

    /**
     * defaulf 修饰的方法可以不用重写
     * static 修饰的不能重写(硬写时不能加override注解）
     * static修饰 通过类名.方法名去调用
     *
     */
    static void addRun(){
       System.out.println("加速跑");
   }
     default void addRun2(){
       System.out.println("加速跑2");
   }



}
