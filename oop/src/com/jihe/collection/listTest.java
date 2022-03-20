package com.jihe.collection;

import java.util.*;
import java.util.stream.Stream;

public class listTest
{
    public static void main(String[] args) {
       List<String> a1;
        //a1=new ArrayList<>();
        a1=new LinkedList<>();

        a1.add("a");
        a1.add("cccc");
        a1.add("cbbbccc");
        a1.add("ddddddddcccc");
        a1.add("bbbbbbbbbbbbbbbb");
        System.out.println(a1+"\n长度="+a1.size());

        a1.add(2,"我是二");
        System.out.println(a1+"\n长度="+a1.size());

        System.out.println(a1.get(4));

        System.out.println(a1.contains("cccc"));
        a1.remove(4);
        System.out.println(a1+"\n长度="+a1.size());

        a1.remove("a");
        System.out.println(a1+"\n长度="+a1.size());

        a1.set(0,"1111111");
        System.out.println(a1+"\n长度="+a1.size());


       // ArrayList<String> a2= (ArrayList<String>) a1;
        LinkedList<String> a4= (LinkedList<String>) a1;
        a4.addFirst("one");
        System.out.println(a4+"\n长度="+a4.size());
        a4.addLast("two");

        System.out.println(a4+"\n长度="+a4.size());
        a4.offerFirst("001");

        System.out.println(a4+"\n长度="+a4.size());

        a4.poll();
        System.out.println(a4+"\n长度="+a4.size());
        a4.peekFirst();
        System.out.println(a4+"\n长度="+a4.size());
        a4.getFirst();
        System.out.println(a4+"\n长度="+a4.size());


        show(a4);
        Stream<String> stream = a4.stream();
        System.out.println(stream);
        System.out.println(stream.count());

    }

    private static void show(LinkedList<String> a4) {

        for (int i = 0; i <a4.size() ; i++) {
            System.out.println(a4.get(i));
        }
        System.out.println("===========================");
        for (String a:a4) {
            System.out.println(a);

        }
//        System.out.println("===========================");
//        for(Iterator<String> it = a4.iterator();it.hasNext();){
//            System.out.println(it.next()+" "+a4.size()+"");
//          //  a4.add("*"); ConcurrentModificationException同时操作了一个对象
//        }

        System.out.println("===========================");
       for( ListIterator<String> it=a4.listIterator();it.hasNext();){

           System.out.println(it.next());
           it.set("b");//set add同时出现时 set 在前
          it.add("a");//是it.add();不是集合a4.add();

       }

        System.out.println(a4+"\n长度="+a4.size());
    }
}
