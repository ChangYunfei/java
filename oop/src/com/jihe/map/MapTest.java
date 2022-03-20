package com.jihe.map;

import java.util.HashMap;

public class MapTest {

    public static void main(String[] a) {
        System.out.println(2);
        HashMap<Integer,String> map=new HashMap<>();
        map.put(12,"十二");
        map.put(122,"十二2");
        map.put(121,"十二1");
        map.put(123,"十二3");
        System.out.println(map.containsKey(12));

        System.out.println(map.replace(100000, "22222222222"));
        System.out.println(map.get(122));
        System.out.println(map.get(100000));//没有key100000

        System.out.println(map.put(122, "1233111123123121132132123123123123"));
        System.out.println(map.get(122));

        System.out.println(map.keySet());

        map.put(null,null);
        System.out.println(map.keySet());
        System.out.println(map.get(null));

    }
    public static void main() {
        System.out.println(1);
        HashMap<Integer,String> map=new HashMap<>();
        map.put(12,"十二");
        System.out.println(map.containsKey(12));
    }

}
