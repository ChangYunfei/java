package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class OneCallable implements Callable {
    int a=0;
    @Override
    public Object call() throws Exception {
        int sum=0;
        for (int i = 0; i <10 ; i++) {
            if(a==10)return "赢了";
            sum+=i;
            a++;
            System.out.println("a="+a+"\t"+Thread.currentThread().getName()+" "+i);
        }
        return sum;
    }
}

class Test2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        OneCallable callable=new OneCallable();
        OneCallable callable2=new OneCallable();
        FutureTask ft = new FutureTask(callable);
        FutureTask ft2 = new FutureTask(callable2);
        Thread t = new Thread(ft);
        t.start();
       // t.start(); Start方法重复调用 IllegalThreadStateException


     //   new Thread(new FutureTask(callable2)).start();
      //  new Thread(new FutureTask(callable2)).start();

//        new Thread(ft).start();
// futureTask 实际上是Runnable的实现类，被thread调用一次就不能用了，
// 下面的都是多余的，想要多线程必须多个futureTask对象
        //当futureTask（）中的callable对象是同一个时，资源共享（callable中的资源）
        //thread >futuretask  一对一
        //futuretask >callable 一对一，多对一
        //如下-----------多对一-----（不同的FutureTask 对 同一个Callable对象）----------------------------------
        //   new Thread(new FutureTask(callable2)).start();
        //  new Thread(new FutureTask(callable2)).start();
        //-----------------------------------------------------
       //--如下---- thread >futuretask  一对一-- futuretask对象只能被Thread.start() 使用一次 --
//        new Thread(ft).start();
//        new Thread(ft).start();//这一行无效

        new Thread(ft).start();//这一行无效
        new Thread(ft).start();//这一行无效
        new Thread(ft).start();//这一行无效
        new Thread(ft).start();//这一行无效
     //   new Thread(new FutureTask(callable)).start();

        new Thread(ft2).start();

        //获取线程得到的返回值：
        Object obj = ft.get();

        System.out.println(obj);
    }

}
