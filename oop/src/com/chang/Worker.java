package com.chang;

/*public class Worker extends Teacher {
* teacher 被final修饰不能继承
*
* */
public class Worker  extends person{
    /**
     * private 修饰 不能被外界创建实例（不能new对象）
     */
    private Worker(){}

    @Override
    public void addRun2() {
        System.out.println("worker 快跑2 addrun2");
    }

    public Worker(int a){

    }

    @Override
    public void run() {

        System.out.println("工人在跑");

    }

    @Override
    public void run1() {

    }
}
