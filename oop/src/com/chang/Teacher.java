package com.chang;
/*
final 修饰的类不能够被继承
 */
public final class Teacher extends person {
   private String xuKeName;


    //加final的方法不能重写
    /*public  String mySchool(){
        System.out.println("蓝天大学");
        return "蓝天大学";
    }*/

    @Override
    public void eat() {
        System.out.println("我是老师，我在吃");
    }

    public Teacher(int age, String name, String id, String xuKeName) {
        super(age, name, id);
        this.xuKeName = xuKeName;
    }

    public Teacher() {


    } public Teacher(String xuKeName) {
        this.xuKeName = xuKeName;
    }

    public String getXuKeName() {
        return xuKeName;
    }

    public void setXuKeName(String xuKeName) {
        this.xuKeName = xuKeName;
    }


    @Override
    public void run() {
          MyUtil.sayHello();
        System.out.println(getName()+"老师在跑");
    }

    @Override
    public void run1() {

    }

    /**
     * 这个方法不能加override注解，因为接口中被static 修饰不能重写
     * 加上@override会报错 ，并不会覆盖接口中的方法
     */
    public void addRun(){
        System.out.println("新的addrun方法，Teacher中");

    }

    public void addRun2(){

        System.out.println("新的addrun2方法，teacher中");
    }
}
