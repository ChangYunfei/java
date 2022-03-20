package com.chang;

public class  Student extends person{
    private String  panJi;

    @Override
    public void eat() {
        MyUtil.sayHello();
        System.out.println("我是学生，我在吃");
    }

    @Override
    public String toString() {
        return "Student{" +
                "panJi='" + panJi + '\'' +
                "} " + super.toString();
    }

    public String getPanJi() {
        return panJi;
    }

    public void setPanJi(String panJi) {
        this.panJi = panJi;
    }

    public Student(int age, String name, String id, String panJi) {
        super(age, name, id);
        this.panJi = panJi;
    }
    public Student(){}

    @Override
    public void run() {
        System.out.println(this.getName()+"学生在跑");
    }

    @Override
    public void run1() {

    }
}
