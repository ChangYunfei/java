package com.chang;



public class Test {

    public static void main(String[] args) {
        person p1=new Teacher(10,"刘老师","001","立体几何");
        Student s1=new Student(2,"小明","002","四班");
        p1.eat();
       // System.out.println(p1.getXuKeName());//父类引用获取不到子类特有的方法
        Teacher t1= (Teacher) p1;

        System.out.println(t1.getXuKeName());

        t1.run();
        t1.addRun(); //teacher中有这个方法，（不是重写，因为有static修饰，不能加@override注解）
        Run.addRun();
        //s1.addRun();//static修饰，不能这样调
        s1.addRun2();
        t1.addRun();
        t1.addRun2();

     //   Worker w=new Worker();//构造方法被private 修饰不能创建实例
        Worker w2=new Worker(2);
        w2.eat();

        MyUtil.run(t1);
        MyUtil.run(s1);
        MyUtil.run(w2);


        person pp1=MyUtil.getMan("老师");
        pp1.run();
        person pp2=MyUtil.getMan("学生");
        pp2.run();
        person pp3=MyUtil.getMan("工人");
        pp3.run();
        person pp4=MyUtil.getMan("人");
        pp4.run();


        //pp1.getXuKeName()//掉不了
        // 需要向下转型 1.
        ((Teacher) pp1).getXuKeName();
        //2.
        Teacher tt1= (Teacher) pp1;
        tt1.getXuKeName();

        if(pp2 instanceof Student){
            Student s= (Student) pp2;
            s.setName("王小二");
            pp2.run();

        }



        Object[] a=new Object[]{};
        Student[] b=new Student[]{new Student(1,"wang","001","二班"),new Student(2,"李","002","四班")};
        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);
        }
    }



}
