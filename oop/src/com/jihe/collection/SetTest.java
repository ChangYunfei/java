package com.jihe.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> s1=new HashSet<>();
        s1.add("aaa");
        s1.add("zzz");
        s1.add("uzzz");
        s1.add("gzz");
        s1.add("dfgbzzz");
        s1.add("dfgv");
        s1.add("nhc");
        s1.add("hfdd fgfgz");
        s1.add("hfdd fgfgz");
        s1.add("hfdd fgfgz");
        s1.add("hfdd fgfgz");
        s1.add("hfdd fgfgz");

        for (String s:s1  ) {
            System.out.println(s);

        }
        System.out.println("____________________________________");

        for(Iterator i=s1.iterator() ;i.hasNext();){
            System.out.println(i.next());
        }


    }
}
