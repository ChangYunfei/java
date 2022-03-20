package com.chang;

import sun.security.rsa.RSAUtil;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SteamTest {

    public static void main(String[] args) {

        Integer a[]={1, 54, 26, 1, 5, 9, 4, 1, 516, 15};
        Stream<Integer> stream1 = Arrays.stream(a);
        stream1.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {

                System.out.print(integer+" ");
            }


        });
        System.out.println();
      //  stream1.forEach(i-> System.out.println(i));

        Stream<Integer> stream =  Stream.of(a);

        stream.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>10;
            }
        }).forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer+" ");
            }
        });
        System.out.println();
        List<Integer> list=new ArrayList<>();
        list=Arrays.asList(a);

        list.stream().forEach(ab-> System.out.print(ab));
        System.out.println("**********************************");

        Integer a2[]={151,5156,15,48,156,4545,45,1,6,465,98,454,98,5,89,54,98,52651,5484};
        Stream<Integer> stream2 =  Stream.of(a2);
        stream2.filter((name)->name>100&&name<200).forEach((name-> System.out.println(name)));

        Stream<Integer> stream3 = Stream.of(a2);
       // int sum=0;
        stream3.forEach(value-> System.out.println(value));

        Stream<Integer> stream4 = Stream.of(a2);
        Object[] ss =  stream4.filter(i -> i % 2 == 0).toArray();
        System.out.println(Arrays.toString(ss));
//---------------删选后放入到新list中-------------
        Stream<Integer> stream5 = Stream.of(a2);

        List<Integer> list1=new ArrayList<>();

        stream5.filter(i -> i % 2 == 0).forEach(i->list1.add(i));
        System.out.println(list1);
        //---------------筛选后求和-------------
      //  Stream<Integer> stream6 = Stream.of(a2);

        //int he=0;
       // final int he=0;
        //stream5.filter(i -> i % 2 == 0).forEach(i->{he=he+i;});//错
      //  stream5.filter(i -> i % 2 == 0).forEach(i->{ he += i;});//错

       Stream<Integer> stream6 = Stream.of(a2);
        final int[] he = {0};
        stream6.filter(i -> i % 2 == 0).forEach(i->{he[0] = he[0] +i;});//对
        System.out.println("数组和="+he[0]);

        Stream<Integer> stream7 = Stream.of(a2);
        Number num=new Number(0);//自定义引用数据类型
        stream7.filter(i -> i % 2 == 0).forEach(i->{num.num = num.num +i;});//对
        System.out.println("和等于="+num);

        //--test Number------------
       Number num1=new Number(1);
       Number num2=new Number(1000);
        System.out.println(num1+"    "+num2);
//---------------------------------------------------------------
        List<Integer> list2 =
                new ArrayList<>();list2.add(121);list2.add(122);list2.add(123);list2.add(124);list2.add(125);
            //Arrays.asList()方法返回的List不能执行add()/remove方法
               // Arrays.asList(new Integer[]{132,5454,10,1,581,5,4,4,85,45,5,549,4,5,4,4,54,54,45,4,5,548,448,854,8});

       //  Collections.addAll(list2, new int[]{12, 154, 4554});
        Collections.addAll(list2,1,654,4,8,54,5,4,8,45,58,485,1,8);

     /*   boolean bb=false;
        bb|=true;
        bb|=true;
        bb|=false;
        bb|=false;
        bb|=true;
        bb|=false;
        System.out.println("bb=" +bb);*/

        List<Integer> list3=new ArrayList<>();
        list3.add(10011);
        list3.add(10012);
        list3.add(10013);
        list3.add(10014);
        System.out.println(list3);
        list3.remove(0);
        System.out.println(list3);
        list3.remove(0);
        System.out.println(list3);
        list3.remove(0);
        System.out.println(list3);


     /*   System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);*/


        for (int i = 0; i < list2.size() ; i++) {
            System.out.println(i+" "+list2.get(i));

            list2.remove(i);



        }
        System.out.println("__倒着遍历可以执行remove方法______________________________________________________________");
        System.out.println(list2);
        for (int i = list2.size()-1; i >=4 ; i--) {
            System.out.println("i="+i+ "值="+list2.get(i));
            list2.remove(i);
            System.out.println(list2);
        }

        System.out.println(list2);
        list2.remove(Integer.valueOf(1));//删除值1----------------------
        list2.remove(1);//删除下标1
     //   list2.remove(124);//删除下标124，即使集合中有 “124”
      //  list2.remove(4);//删除下标4，
        System.out.println(list2);



    }
}
